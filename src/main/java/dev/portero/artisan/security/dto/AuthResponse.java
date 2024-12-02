package dev.portero.artisan.security.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class AuthResponse {
    private String accessToken;
    private String refreshToken;
}
