package com.remedios.victor.curso.dto;

import com.remedios.victor.curso.services.Laboratorio;
import com.remedios.victor.curso.services.Via;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarRemedio(
        @NotNull
        Long id,
        String nome,
        Via via,
        Laboratorio laboratorio) {
}
