package com.doggyfinder.pets.security.services;

import com.doggyfinder.pets.security.dto.UserDTO;
import com.doggyfinder.pets.security.entities.User;

import java.util.Optional;

public interface IUserService {
    public Optional<User> getByUsername(String username);
    public boolean existsByUsername(String username);
    public boolean existsByEmail(String email);
    public void save(UserDTO userDTO);

}
