package org.aguzman.appmockito.ejemplos.appmockito.repositories.impl;

import org.aguzman.appmockito.ejemplos.appmockito.Datos;
import org.aguzman.appmockito.ejemplos.appmockito.repositories.PreguntaRepository;

import java.util.List;

public class PreguntaRepositoryImpl implements PreguntaRepository {
    @Override
    public List<String> findPreguntasPorExamenId(Long id) {
        System.out.println("PreguntaRepositoryImpl.findPreguntasPorExamenId");
        return Datos.PREGUNTAS;
    }

    @Override
    public void guardarVarias(List<String> preguntas) {
        System.out.println("PreguntaRepositoryImpl.guardarVarias");
    }
}
