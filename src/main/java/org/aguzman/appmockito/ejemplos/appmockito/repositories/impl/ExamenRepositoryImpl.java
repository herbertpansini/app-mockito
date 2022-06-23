package org.aguzman.appmockito.ejemplos.appmockito.repositories.impl;

import org.aguzman.appmockito.ejemplos.appmockito.Datos;
import org.aguzman.appmockito.ejemplos.appmockito.models.Examen;
import org.aguzman.appmockito.ejemplos.appmockito.repositories.ExamenRepository;

import java.util.List;

public class ExamenRepositoryImpl implements ExamenRepository {
    @Override
    public List<Examen> findAll() {
        System.out.println("ExamenRepositoryImpl.findAll");
        return Datos.EXAMENES;
    }

    @Override
    public Examen guardar(Examen examen) {
        System.out.println("ExamenRepositoryImpl.guardar");
        return Datos.EXAMEN;
    }
}