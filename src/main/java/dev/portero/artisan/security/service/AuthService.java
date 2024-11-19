package dev.portero.artisan.security.service;

import dev.portero.artisan.security.dto.AuthRequest;
import dev.portero.artisan.security.dto.AuthResponse;
import dev.portero.artisan.security.dto.RegisterRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public AuthResponse login(AuthRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        return null;
    }

    public AuthResponse refreshToken(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }
}
