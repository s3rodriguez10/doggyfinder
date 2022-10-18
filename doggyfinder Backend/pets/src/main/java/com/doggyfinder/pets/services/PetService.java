package com.doggyfinder.pets.services;

import com.doggyfinder.pets.dto.PetDTO;
import com.doggyfinder.pets.entities.Pet;
import com.doggyfinder.pets.repositories.IPetRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PetService implements IPetService{

    @Autowired
    private IPetRepository iPetRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<PetDTO> findAll() {
        return iPetRepository.findAll()
                .stream().map(pet -> modelMapper.map(pet,PetDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PetDTO findById(Long idPet) {
        return modelMapper.map(iPetRepository.findById(idPet).get(),PetDTO.class);
    }

    @Override
    public PetDTO update(PetDTO pet) {
        Pet pet1 = iPetRepository.save(modelMapper.map(pet, Pet.class));
        return modelMapper.map(pet1,PetDTO.class);
    }

    @Override
    public PetDTO save(PetDTO pet) {
        Pet pet1 = iPetRepository.save(modelMapper.map(pet, Pet.class));
        return modelMapper.map(pet1,PetDTO.class);
    }

    @Override
    public boolean delete(Long idPet) {
        if(iPetRepository.findById(idPet).isPresent()){
            iPetRepository.deleteById(idPet);
            return true;
        }

        return false;
    }
}
