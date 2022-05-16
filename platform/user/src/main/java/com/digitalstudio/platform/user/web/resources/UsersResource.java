package com.digitalstudio.platform.user.web.resources;

import com.digitalstudio.platform.user.web.model.CreateUserRequest;
import com.digitalstudio.platform.user.web.model.CreateUserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UsersResource {
    @PostMapping
    public CreateUserResponse saveUser(CreateUserRequest createUserRequest){
        CreateUserResponse fakeUserResponse = new CreateUserResponse();

        // Service Call
        // userService.save(user);
        fakeUserResponse.setUserId(UUID.randomUUID());
        fakeUserResponse.setEmail(createUserRequest.getEmail());

        return fakeUserResponse;
    }
}
