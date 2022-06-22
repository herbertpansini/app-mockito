package org.aguzman.appmockito.ejemplos.appmockito.services.impl;

import org.aguzman.appmockito.ejemplos.appmockito.models.Examen;
import org.aguzman.appmockito.ejemplos.appmockito.repositories.ExamenRepository;
import org.aguzman.appmockito.ejemplos.appmockito.services.ExamenService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ExamenServiceImplTest {

    @Test
    void findExamenPorNombre() {
        ExamenRepository examenRepository = mock(ExamenRepository.class);
        ExamenService examenService = new ExamenServiceImpl(examenRepository);
        List<Examen> examenes = Arrays.asList(new Examen(5L, "Matemáticas"),
                new Examen(6L, "Lenguaje"),
                new Examen(7L, "Historia"));
        when(examenRepository.findAll()).thenReturn(examenes);
        Optional<Examen> examen = examenService.findExamenPorNombre("Matemáticas");
        assertTrue(examen.isPresent());
        assertEquals(5, examen.orElseThrow().getId());
        assertEquals("Matemáticas", examen.orElseThrow().getNombre());
    }

    @Test
    void findExamenPorNombreListaVacia() {
        ExamenRepository examenRepository = mock(ExamenRepository.class);
        ExamenService examenService = new ExamenServiceImpl(examenRepository);
        List<Examen> examenes = Collections.emptyList();
        when(examenRepository.findAll()).thenReturn(examenes);
        Optional<Examen> examen = examenService.findExamenPorNombre("Matemáticas");
        assertFalse(examen.isPresent());
    }
}