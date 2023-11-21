package com.examen_2.examen_2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen_2.examen_2.modelos.TipoVehiculo;
import com.examen_2.examen_2.repositorios.TipoVehiculoRepository;
import com.examen_2.examen_2.servicios.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearTipoVehiculo'");
    }

    @Override
    public String eliminarTipoVehiculo(int idTipoVehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarTipoVehiculo'");
    }
    
}
