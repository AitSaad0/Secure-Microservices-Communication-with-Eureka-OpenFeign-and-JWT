package com.example.user_service.Controller;

import com.example.user_service.config.JwtService;
import com.example.user_service.dto.LoginRequest;
import com.example.user_service.dto.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final JwtService jwtService;

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {

        if ("amzazi".equals(request.username()) && "pass1234".equals(request.password())) {
            String token = jwtService.generateToken(request.username());
            return ResponseEntity.ok(new LoginResponse(token));
        }

        return ResponseEntity.status(401).build(); // Unauthorized
    }
}
