package com.doggyfinder.pets.security.entities;

import com.doggyfinder.pets.security.enums.TypeRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter @AllArgsConstructor @NoArgsConstructor
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;

    @Enumerated(EnumType.STRING)
    private TypeRole typeRole;

    @ManyToMany(mappedBy = "roles")
    private List<User> users = new ArrayList<>();
}
