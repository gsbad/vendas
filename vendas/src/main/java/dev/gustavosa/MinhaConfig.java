package dev.gustavosa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


//Herda @Profile Development e @Configuration de MinhaConfig
@Development
public class MinhaConfig {

    @Bean(name = "applicationName")
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }    
}
