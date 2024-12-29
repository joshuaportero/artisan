package dev.portero.artisan.security.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class AuthRequest {
    private String email;
    private String password;
}
