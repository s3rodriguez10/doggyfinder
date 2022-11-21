package com.doggyfinder.pets.security.services;

import com.doggyfinder.pets.security.entities.Role;
import com.doggyfinder.pets.security.enums.TypeRole;
import com.doggyfinder.pets.security.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService implements IRoleService{

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Optional<Role> getByTypeRole(TypeRole roleName) {
        return roleRepository.findByTypeRole(roleName);
    }

    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }
}
