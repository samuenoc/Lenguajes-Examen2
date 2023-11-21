package com.examen_2.examen_2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen_2.examen_2.modelos.Reserva;
import com.examen_2.examen_2.repositorios.ReservaRepository;
import com.examen_2.examen_2.servicios.ReservaService;

@Service
public class ReservaServiceImpl  implements ReservaService{

    @Autowired
    private ReservaRepository reservaRepository;
    
    @Override
    public Reserva crearReserva() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearReserva'");
    }
    
}
