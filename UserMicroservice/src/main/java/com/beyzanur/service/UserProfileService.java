package com.beyzanur.service;

import com.beyzanur.document.UserProfile;
import com.beyzanur.dto.request.CreateUserRequestDto;
import com.beyzanur.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final UserProfileRepository repository;
    //cache temizlemek için oluşturduk
    private final CacheManager cacheManager;
    public void createUser(CreateUserRequestDto dto) {
        repository.save(UserProfile.builder()
                        .authId(dto.getAuthId())
                        .userName(dto.getUserName())
                        .email(dto.getEmail())
                .build());

    }

    public List<UserProfile> getAll() {
        return repository.findAll();
    }
    @Cacheable("upper-case")
    public String upperName(String name) {
        String result = name.toUpperCase();
        try{
            Thread.sleep(3000L);

        }catch(Exception exception){}
        return  result;
    }
    public void clearCache(){
        cacheManager.getCache("upper-case").clear();
    }
}
