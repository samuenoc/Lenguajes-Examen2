package com.examen_2.examen_2.servicios;

import java.util.List;

import com.examen_2.examen_2.modelos.Cliente;


public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);
    
    public List<Cliente> obtenerTodos();

    public Cliente buscarCliente(int idCliente);

}
