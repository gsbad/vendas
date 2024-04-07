package dev.gustavosa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Development
public class MinhaConfig {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Vendas";
    }
    @Bean(name = "userName")
    public String userName(){
        return "Gustavo Sá";
    }     
}
