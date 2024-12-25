package library.service;

import library.entity.User;
import library.models.request.AuthLoginRequest;
import library.models.request.UserRegisterRequest;
import library.models.response.AuthLoginResponse;

public interface AuthService {
    void register(UserRegisterRequest userRegisterRequest);

    AuthLoginResponse login(AuthLoginRequest authLoginRequest);

    User getUsernameFromToken(String token);
}
