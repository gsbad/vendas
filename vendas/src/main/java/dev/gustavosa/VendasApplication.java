package dev.gustavosa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class VendasApplication {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;
    @Autowired
    @Qualifier("userName")
    private String userName;

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

    @GetMapping("/hello")
    public String olaMundo(){
        return "Olá " + userName + "! Você está no " + applicationName;
    }
}