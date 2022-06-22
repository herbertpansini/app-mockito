package org.aguzman.appmockito.ejemplos.appmockito.services.impl;

import org.aguzman.appmockito.ejemplos.appmockito.models.Examen;
import org.aguzman.appmockito.ejemplos.appmockito.repositories.ExamenRepository;
import org.aguzman.appmockito.ejemplos.appmockito.services.ExamenService;

import java.util.Optional;

public class ExamenServiceImpl implements ExamenService {
    private ExamenRepository examenRepository;

    public ExamenServiceImpl(ExamenRepository examenRepository) {
        this.examenRepository = examenRepository;
    }

    @Override
    public Optional<Examen> findExamenPorNombre(String nombre) {
        return this.examenRepository.findAll()
                .stream().filter(e -> e.getNombre().equals(nombre))
                .findFirst();
    }
}