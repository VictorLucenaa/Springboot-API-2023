package com.remedios.victor.curso.dto;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosCadastroRemedio( // DTOs não são criados como classes, mas sim como records

        @NotBlank
        String nome,
        @Enumerated
        Via via,
        @NotBlank
        String lote,
        int quantidade,
        @Future
        LocalDate validade,
        @Enumerated
        Laboratorio laboratorio) {
}
