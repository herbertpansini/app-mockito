package org.aguzman.appmockito.ejemplos.appmockito.services;

import org.aguzman.appmockito.ejemplos.appmockito.models.Examen;

public interface ExamenService {
    Examen findExamenPorNombre(String nombre);
}
