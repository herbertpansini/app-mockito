package org.aguzman.appmockito.ejemplos.appmockito.services;

import org.aguzman.appmockito.ejemplos.appmockito.models.Examen;

import java.util.Optional;

public interface ExamenService {
    Optional<Examen> findExamenPorNombre(String nombre);
}
