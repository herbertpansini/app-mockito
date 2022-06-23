package org.aguzman.appmockito.ejemplos.appmockito.services.impl;

import org.aguzman.appmockito.ejemplos.appmockito.models.Examen;
import org.aguzman.appmockito.ejemplos.appmockito.repositories.ExamenRepository;
import org.aguzman.appmockito.ejemplos.appmockito.repositories.PreguntaRepository;
import org.aguzman.appmockito.ejemplos.appmockito.services.ExamenService;

import java.util.Optional;

public class ExamenServiceImpl implements ExamenService {
    private ExamenRepository examenRepository;
    private PreguntaRepository preguntaRepository;

    public ExamenServiceImpl(ExamenRepository examenRepository, PreguntaRepository preguntaRepository) {
        this.examenRepository = examenRepository;
        this.preguntaRepository = preguntaRepository;
    }

    @Override
    public Optional<Examen> findExamenPorNombre(String nombre) {
        return this.examenRepository.findAll()
                .stream().filter(e -> e.getNombre().equals(nombre))
                .findFirst();
    }

    @Override
    public Examen findExamenPorNombreConPreguntas(String nombre) {
        Optional<Examen> examenOptional = this.findExamenPorNombre(nombre);
        Examen examen = null;
        if (examenOptional.isPresent()) {
            examen = examenOptional.orElseThrow();
            examen.setPreguntas(this.preguntaRepository.findPreguntasPorExamenId(examen.getId()));
        }
        return examen;
    }

    @Override
    public Examen guardar(Examen examen) {
        if (!examen.getPreguntas().isEmpty()) {
            this.preguntaRepository.guardarVarias(examen.getPreguntas());
        }
        return this.examenRepository.guardar(examen);
    }
}