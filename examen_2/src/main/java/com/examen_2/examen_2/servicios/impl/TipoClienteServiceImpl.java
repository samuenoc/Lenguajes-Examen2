package com.examen_2.examen_2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen_2.examen_2.modelos.TipoCliente;
import com.examen_2.examen_2.repositorios.TipoClienteRepository;
import com.examen_2.examen_2.servicios.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(TipoCliente tipoCliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearTipoCliente'");
    }
    
}
