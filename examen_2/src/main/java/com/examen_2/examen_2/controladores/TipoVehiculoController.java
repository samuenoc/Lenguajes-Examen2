package com.examen_2.examen_2.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tipovehiculo")
public class TipoVehiculoController {
      @GetMapping("/prueba")
    public String prueba(){
        return "Funciona";
    }
}
