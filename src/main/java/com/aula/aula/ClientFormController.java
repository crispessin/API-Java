package com.aula.aula;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ClientFormController {
    private ClienteRepository clienteRepository;

    public ClientFormController(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/index")
    public String mostrarClientes(Model model){
        model.addAttribute("clientes", clienteRepository.findAll());
        return "index";
    }
}
