package gyt.auth_service.service;

import gyt.auth_service.dto.AuthResponse;
import gyt.auth_service.dto.LoginRequest;
import gyt.auth_service.dto.RegisterRequest;

public interface AuthService {
    AuthResponse login(LoginRequest request);

    AuthResponse register(RegisterRequest request);
}
