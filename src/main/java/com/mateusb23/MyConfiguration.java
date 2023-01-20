package com.mateusb23;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Development
public class MyConfiguration {

    @Bean
    public CommandLineRunner Executar() {
        return args -> {
            System.out.println("RODANDO A CONFIGRURAÇÃO DE DESENVOLVIMENTO");
        };
    }

}
