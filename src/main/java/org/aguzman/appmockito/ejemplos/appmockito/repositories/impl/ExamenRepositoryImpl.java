package org.aguzman.appmockito.ejemplos.appmockito.repositories.impl;

import org.aguzman.appmockito.ejemplos.appmockito.models.Examen;
import org.aguzman.appmockito.ejemplos.appmockito.repositories.ExamenRepository;

import java.util.Arrays;
import java.util.List;

public class ExamenRepositoryImpl implements ExamenRepository {
    @Override
    public List<Examen> findAll() {
        return Arrays.asList(new Examen(5L, "Matemáticas"),
                             new Examen(6L, "Lenguaje"),
                             new Examen(7L, "Historia"));
    }
}