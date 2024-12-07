package com.beyzanur.service;

import com.beyzanur.dto.request.CreateUserRequestDto;
import com.beyzanur.dto.request.RegisterRequestDto;
import com.beyzanur.entity.Auth;
import com.beyzanur.manager.UserProfileManager;
import com.beyzanur.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository repository;
    private final UserProfileManager userProfileManager;

    public Auth register(RegisterRequestDto dto) {
       Auth auth = repository.save(Auth.builder()
                        .userName(dto.getUserName())
                        .email(dto.getEmail())
                        .password(dto.getPassword())
                .build());
     userProfileManager.createUser(CreateUserRequestDto.builder()
                     .authId(auth.getId())
                     .email(dto.getEmail())
                     .userName(auth.getUserName())
             .build());
   return auth;
    }
}
