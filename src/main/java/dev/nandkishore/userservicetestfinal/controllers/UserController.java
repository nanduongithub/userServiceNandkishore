package dev.nandkishore.userservicetestfinal.controllers;

import dev.nandkishore.userservicetestfinal.dtos.SetUserRolesRequestDto;
import dev.nandkishore.userservicetestfinal.dtos.UserDto;
import dev.nandkishore.userservicetestfinal.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserDetails(@PathVariable("id") Long userId) {
        System.out.println("Got the request here");

        UserDto userDto = new UserDto();
//        UserDto userDto = userService.getUserDetails(userId);
//
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @PostMapping("/{id}/roles")
    public ResponseEntity<UserDto> setUserRoles(@PathVariable("id") Long userId, @RequestBody SetUserRolesRequestDto request) {

        UserDto userDto = userService.setUserRoles(userId, request.getRoleIds());

        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }


}
