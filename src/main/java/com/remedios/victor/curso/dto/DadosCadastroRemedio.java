package com.remedios.victor.curso.dto;

public record DadosCadastroRemedio( // DTOs não são criados como classes, mas sim como records
        String nome,
        Via via,
        String lote,
        String quantidade,
        String validade,
        Laboratorio laboratorio) {
}
