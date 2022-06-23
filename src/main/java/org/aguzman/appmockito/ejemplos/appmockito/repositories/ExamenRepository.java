package org.aguzman.appmockito.ejemplos.appmockito.repositories;

import org.aguzman.appmockito.ejemplos.appmockito.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();

    Examen guardar(Examen examen);
}
