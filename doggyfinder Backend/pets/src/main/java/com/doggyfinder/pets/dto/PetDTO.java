package com.doggyfinder.pets.dto;

import javax.validation.constraints.NotBlank;

public class PetDTO {

    private Long idPet;
    @NotBlank
    private String name;

    public PetDTO() {
    }

    public PetDTO(Long idPet, String name) {
        this.idPet = idPet;
        this.name = name;
    }

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
