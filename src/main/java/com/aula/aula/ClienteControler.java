package com.aula.aula;

import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteControler {
    private ClienteRepository clienteRepository;

    public ClienteControler(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public Collection<Cliente> getNomeCliente(){
        return clienteRepository.findAll();
    }

    @PostMapping
    public Cliente criarCliente(@RequestBody Cliente cliente){
        System.out.print(cliente);
        clienteRepository.save(cliente);
        return cliente;
    }

    @PutMapping
    public Cliente alterarCliente(@RequestBody Cliente cliente) {
        System.out.println(cliente);
        clienteRepository.save(cliente);
        return cliente;
    }

    @DeleteMapping
    public void removeCliente(@RequestBody Cliente cliente) {
        System.out.println(cliente);
        clienteRepository.delete(cliente);
    }
}
