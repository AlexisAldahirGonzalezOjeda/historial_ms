package com.proyecto.historial_ms.controllers;

import com.proyecto.historial_ms.exceptions.RegistroNotFoundException;
import com.proyecto.historial_ms.models.Registro;
import com.proyecto.historial_ms.models.Historial;
import com.proyecto.historial_ms.repositories.RegistroRepository;
import com.proyecto.historial_ms.repositories.HistorialRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class RegistroController {

    private final RegistroRepository registroRepository;
    private final HistorialRepository historialRepository;


    public RegistroController(RegistroRepository registroRepository, HistorialRepository historialRepository) {
        this.registroRepository = registroRepository;
        this.historialRepository = historialRepository;

        //Seed
        Registro newRegistro01 = new Registro("123456789", "Juan", "Perez", new Date(91, 4,19), "Masculino", "Soltero", "Publico", "Independiente", "Calle 10, carrera 9", "3011234567", "0", "JuanPerez@mai.com");
        Registro newRegistro02 = new Registro("987654321", "Sofia", "Lopez", new Date(88, 10,5), "Femenino", "Casada", "Privado", "Ama de casa", "Calle 18, carrera 5", "3017654321", "0", "SofiaLopez@mai.com");

        this.registroRepository.save(newRegistro01);
        this.registroRepository.save(newRegistro02);
    }

    @GetMapping("/registros/{userId}")
    Registro getRegistro(@PathVariable String userId){
        return registroRepository.findById(userId)
                .orElseThrow(() -> new RegistroNotFoundException("No se encontro un registro con el userId: " + userId));
    }

    @PostMapping("/registrar")
    Historial newRegistro(@RequestBody Historial historiales){
        Registro history = registroRepository.findById(historiales.getId()).orElse(null);
        if (history == null){
            throw new RegistroNotFoundException("No se encontró una cuenta con el user Id:" + historiales.getId());
        } else{
            return historialRepository.save(historiales);
        }
        
    }
}
