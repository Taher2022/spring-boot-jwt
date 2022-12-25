package com.techgen.controller;

import com.techgen.dto.JWTAuthResponseDto;
import com.techgen.dto.LoginDto;
import com.techgen.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // Build Login REST API
    @PostMapping(value = {"/login"})
    public ResponseEntity<JWTAuthResponseDto> login(@RequestBody LoginDto loginDto){
        String token = authService.login(loginDto);
        JWTAuthResponseDto jwtAuthResponse = new JWTAuthResponseDto();
        jwtAuthResponse.setAccessToken(token);
        return ResponseEntity.ok(jwtAuthResponse);
    }

}
