package org.aguzman.appmockito.ejemplos.appmockito.repositories;

import java.util.List;

public interface PreguntaRepository {
    List<String> findPreguntasPorExamenId(Long id);
}
