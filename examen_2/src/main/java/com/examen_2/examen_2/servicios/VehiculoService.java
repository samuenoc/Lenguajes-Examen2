package com.examen_2.examen_2.servicios;

import java.util.List;

import com.examen_2.examen_2.modelos.Vehiculos;

public interface VehiculoService {
    public Vehiculos creaVehiculos(Vehiculos vehiculos);

    public List<Vehiculos> obtenerTodosVehiculos();

    public Vehiculos buscarVehiculos(int idVehiculo);


}
