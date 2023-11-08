package com.remedios.victor.curso.dto;

import com.remedios.victor.curso.services.Laboratorio;
import com.remedios.victor.curso.services.Via;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

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
