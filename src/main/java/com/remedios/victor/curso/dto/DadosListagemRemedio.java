package com.remedios.victor.curso.dto;


import com.remedios.victor.curso.services.Laboratorio;
import com.remedios.victor.curso.services.Remedio;
import com.remedios.victor.curso.services.Via;

import java.time.LocalDate;

public record DadosListagemRemedio(Long id, String nome, Via via, String lote, Laboratorio laboratorio, LocalDate validade) {

    public DadosListagemRemedio(Remedio remedio){
        this(remedio.getId(), remedio.getNome(), remedio.getVia(), remedio.getLote(), remedio.getLaboratorio(), remedio.getValidade());
    }
}
