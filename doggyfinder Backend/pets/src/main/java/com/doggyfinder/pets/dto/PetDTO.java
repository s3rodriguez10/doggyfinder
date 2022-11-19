package com.doggyfinder.pets.dto;

import com.doggyfinder.pets.enums.TypePet;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.util.Date;


@Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class PetDTO {

    private Long idPet;
    @NotBlank
    private String name;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date dateOfBirth;

    private TypePet typeOfPet;

}
