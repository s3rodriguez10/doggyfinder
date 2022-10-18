package com.doggyfinder.pets.repositories;

import com.doggyfinder.pets.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPetRepository extends JpaRepository<Pet,Long>{
}
