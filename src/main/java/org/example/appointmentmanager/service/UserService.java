package org.example.appointmentmanager.service;

import org.example.appointmentmanager.entity.User;
import org.example.appointmentmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserbyId(String Id) {
        return userRepository.findById(Id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String Id) {
        userRepository.deleteById(Id);
    }
}
