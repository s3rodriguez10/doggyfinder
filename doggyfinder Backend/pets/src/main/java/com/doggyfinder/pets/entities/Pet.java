package com.doggyfinder.pets.entities;

import com.doggyfinder.pets.enums.TypePet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet")
    private Long idPet;

    @Column(name = "name_pet",length = 40)
    private String name;

    @Column
    private Date dateOfBirth;

    @Enumerated(EnumType.STRING)
    private TypePet typeOfPet;
}
