package com.doggyfinder.pets.entities;

import javax.persistence.*;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet")
    private Long idPet;

    @Column(name = "name_pet")
    private String name;

    public void setIdPet(Long idPet) {
        this.idPet = idPet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdPet() {
        return idPet;
    }

    public String getName() {
        return name;
    }

}
