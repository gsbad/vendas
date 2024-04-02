package dev.gustavosa.service;

import org.springframework.stereotype.Service;

import dev.gustavosa.model.Cliente;
import dev.gustavosa.repository.ClienteRepository;

@Service
public class ClienteService {

    // Injeção de dependências
    private ClienteRepository repository;
    
    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente); 

    }
    public void validarCliente(Cliente cliente){
        // Aplica validações
    }
    
}
