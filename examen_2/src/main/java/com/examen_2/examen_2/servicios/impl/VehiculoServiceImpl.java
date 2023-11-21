package com.examen_2.examen_2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen_2.examen_2.modelos.Vehiculos;
import com.examen_2.examen_2.repositorios.VehiculosRepository;
import com.examen_2.examen_2.servicios.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculosRepository vehiculosRepository;

    @Override
    public Vehiculos creaVehiculos(Vehiculos vehiculos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creaVehiculos'");
    }

    @Override
    public List<Vehiculos> obtenerTodosVehiculos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTodosVehiculos'");
    }

    @Override
    public Vehiculos buscarVehiculos(int idVehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarVehiculos'");
    }

    
}
