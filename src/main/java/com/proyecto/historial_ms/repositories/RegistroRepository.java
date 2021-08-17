package com.proyecto.historial_ms.repositories;

import com.proyecto.historial_ms.models.Historial;
import com.proyecto.historial_ms.models.Registro;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RegistroRepository extends MongoRepository <Registro, String> {
    /*List<Registro> findByUserId (String userId);*/
}
