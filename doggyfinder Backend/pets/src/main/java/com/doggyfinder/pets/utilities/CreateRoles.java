/*
package com.doggyfinder.pets.utilities;

import com.doggyfinder.pets.security.entities.Role;
import com.doggyfinder.pets.security.enums.TypeRole;
import com.doggyfinder.pets.security.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CreateRoles implements CommandLineRunner {
    @Autowired
    private RoleService roleService;

    @Override
    public void run(String... args) throws Exception {
        Role rolAdmin = new Role();
        rolAdmin.setTypeRole(TypeRole.ROLE_ADMIN);
        Role rolUser = new Role();
        rolUser.setTypeRole(TypeRole.ROLE_USER);

        roleService.save(rolAdmin);
        roleService.save(rolUser);
    }
}
*/
