package dev.portero.artisan.security.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class RegisterRequest {
    private String email;
    private String password;
}
