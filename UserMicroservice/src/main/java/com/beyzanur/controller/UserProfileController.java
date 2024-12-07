package com.beyzanur.controller;

import com.beyzanur.document.UserProfile;
import com.beyzanur.dto.request.CreateUserRequestDto;
import com.beyzanur.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import  static com.beyzanur.config.RestApis.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(USERPROFILE)
public class UserProfileController {
    private final UserProfileService userProfileService;
    @PostMapping(CREATE_USER)
    public ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDto dto){
        userProfileService.createUser(dto);
        return ResponseEntity.ok(true);
    }
    @GetMapping(GET_ALL)
    public  ResponseEntity<List<UserProfile>>getAll(){
        return  ResponseEntity.ok(userProfileService.getAll());
    }
    @GetMapping("/upper-name")
    public ResponseEntity<String> upperName(String name){
        return ResponseEntity.ok(userProfileService.upperName(name));

    }
}
