package com.doggyfinder.pets.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class configurationDTO {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
