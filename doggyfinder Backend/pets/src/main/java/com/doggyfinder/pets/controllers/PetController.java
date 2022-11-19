package com.doggyfinder.pets.controllers;

import com.doggyfinder.pets.dto.PetDTO;
import com.doggyfinder.pets.services.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private IPetService iPetService;

    @GetMapping("")
    public ResponseEntity<List<PetDTO>> findAll(){
        return new ResponseEntity(iPetService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<PetDTO> create(@RequestBody PetDTO dto){
        System.out.println(dto.toString());
        return new ResponseEntity(iPetService.save(dto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PetDTO> findById(@PathVariable("id") Long id){
        return new ResponseEntity(iPetService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<PetDTO> update(@RequestBody PetDTO dto){
        return new ResponseEntity(iPetService.update(dto),HttpStatus.OK);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id){
        return new ResponseEntity(iPetService.delete(id),HttpStatus.OK);
    }
}
