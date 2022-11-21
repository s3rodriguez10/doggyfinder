package com.doggyfinder.pets.security.services;

import com.doggyfinder.pets.security.entities.Role;
import com.doggyfinder.pets.security.enums.TypeRole;

import java.util.Optional;


public interface IRoleService {
    public Optional<Role> getByTypeRole(TypeRole roleName);
    public void save(Role role);
}
