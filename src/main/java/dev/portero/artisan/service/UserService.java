package dev.portero.artisan.service;

import dev.portero.artisan.security.dto.ChangePasswordRequest;
import dev.portero.artisan.domain.user.User;
import dev.portero.artisan.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;

    public ResponseEntity<?> changePassword(Long id, ChangePasswordRequest request) {
        return repository.findById(id).map(user -> {
            if (!user.getPassword().equals(request.getCurrentPassword())) {
                return ResponseEntity.badRequest().build();
            }
            if (!request.getNewPassword().equals(request.getConfirmationPassword())) {
                return ResponseEntity.badRequest().build();
            }

            user.setPassword(request.getNewPassword());
            return repository.save(user);
        }).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    public User getUser(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
