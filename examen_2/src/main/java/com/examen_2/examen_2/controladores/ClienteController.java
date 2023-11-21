package com.examen_2.examen_2.controladores;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen_2.examen_2.repositorios.ClienteRepository;



@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/prueba")
    public String prueba(){
        return "Funciona";
    }

}
