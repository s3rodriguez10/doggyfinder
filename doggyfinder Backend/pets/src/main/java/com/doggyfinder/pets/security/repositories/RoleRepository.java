package com.doggyfinder.pets.security.repositories;

import com.doggyfinder.pets.security.entities.Role;
import com.doggyfinder.pets.security.enums.TypeRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByTypeRole(TypeRole roleName);
}
