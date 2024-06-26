package dev.gustavosa;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class VendasApplication {

    @Autowired
    //@Qualifier("gato")
    @Galinha   
    private Animal animal;

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            this.animal.fazerBarulho();
        };
    }

    @Value("${spring.application.name}")
    private String applicationName;

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

    @GetMapping("/hello")
    public String olaMundo(){
        return "Olá! Você está no " + applicationName;
    }
}