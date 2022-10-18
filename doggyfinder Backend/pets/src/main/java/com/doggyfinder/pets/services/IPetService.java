package com.doggyfinder.pets.services;


import com.doggyfinder.pets.dto.PetDTO;

import java.util.List;
import java.util.Optional;

public interface IPetService {

    public List<PetDTO> findAll();
    public PetDTO findById(Long idPet);
    public PetDTO update(PetDTO pet);
    public PetDTO save(PetDTO pet);
    public boolean delete(Long idPet);

}
