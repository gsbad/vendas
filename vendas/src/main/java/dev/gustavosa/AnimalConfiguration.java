package dev.gustavosa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {
    
    @Bean(name = "cachorro")
    public Animal cachorro(){
        return new Animal(){
            @Override
            public void fazerBarulho(){
                System.out.println("Auau!");
            }
        };
    }
    @Bean(name = "gato")
    public Animal gato(){
        return new Animal(){
            @Override
            public void fazerBarulho(){
                System.out.println("Miau!");
            }
        };
    }
    @Bean(name = "galinha")
    public Animal galinha(){
        return new Animal(){
            @Override
            public void fazerBarulho(){
                System.out.println("Cocococo!");
            }
        };
    }

}
