package com.proyecto.historial_ms.controllers;

import com.proyecto.historial_ms.exceptions.HistorialNotFoundException;
import com.proyecto.historial_ms.exceptions.RegistroNotFoundException;
import com.proyecto.historial_ms.models.Historial;
import com.proyecto.historial_ms.models.Registro;
import com.proyecto.historial_ms.repositories.HistorialRepository;
import com.proyecto.historial_ms.repositories.RegistroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class HistorialController {

    private final HistorialRepository historialRepository;


    public HistorialController(HistorialRepository historialRepository) {
        this.historialRepository = historialRepository;

        //Seed
        Historial newHistorial01 = new Historial("123456789", "Juan", "Perez", 30, "Masculino", 405, 4,
                "Independiente", "Control Médico", "No", "No", "Sí", "Sí", "No", "No", "No", "Insulina, Amilina");
        Historial newHistorial02 = new Historial("987654321", "Sofia", "Lopez", 33, "Femenino", 0, 0,
                "Ama de Casa", "Control Médico", "No", "No", "No", "No", "No", "No", "Si", "No");
        this.historialRepository.save(newHistorial01);
        this.historialRepository.save(newHistorial02);
    }


  /*  @PostMapping("/historial")
    Historial newHistorial(@RequestBody Historial historial){
        Registro account = RegistroRepository.findByUserId(Historial.getId()).orElse(null);

        if (account == null)
            throw new RegistroNotFoundException("No se encontro una cuenta con el userId: " + historial.getId());
        return HistorialRepository.save(historial);
    }

   */

    @GetMapping("/historial/{id}")
    Historial getHistorial(@PathVariable String id){
        return historialRepository.findById(id)
                .orElseThrow(() -> new HistorialNotFoundException("No se encontro un registro con el userId: " + id));
    }
}