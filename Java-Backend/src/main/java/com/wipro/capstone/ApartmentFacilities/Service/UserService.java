package com.wipro.capstone.ApartmentFacilities.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.capstone.ApartmentFacilities.Entity.UserMaster;
import com.wipro.capstone.ApartmentFacilities.Repository.UserRepository;
@Service

public class UserService {
	@Autowired
    private UserRepository userRepository;

    public List<UserMaster> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserMaster> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public UserMaster createUser(UserMaster user) {
        return userRepository.save(user);
    }

    public UserMaster updateUser(Long id, UserMaster userDetails) {
        UserMaster user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setUsername(userDetails.getUsername());
        user.setPassword(userDetails.getPassword());
        user.setRole(userDetails.getRole());
        user.setStatus(userDetails.getStatus());
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        UserMaster user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.delete(user);
    }
}
