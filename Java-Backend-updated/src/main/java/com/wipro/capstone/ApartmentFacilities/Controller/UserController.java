package com.wipro.capstone.ApartmentFacilities.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.capstone.ApartmentFacilities.Entity.UserMaster;
import com.wipro.capstone.ApartmentFacilities.Service.UserService;

@RestController
@RequestMapping("/api/users")

public class UserController {
	@Autowired
    private UserService userService;

    @GetMapping
    public List<UserMaster> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<UserMaster> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public UserMaster createUser(@RequestBody UserMaster user) {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public UserMaster updateUser(@PathVariable Long id, @RequestBody UserMaster userDetails) {
        return userService.updateUser(id, userDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}


