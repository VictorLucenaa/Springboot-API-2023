package com.remedios.victor.curso.controllers;

import com.remedios.victor.curso.dto.DadosCadastroRemedio;
import com.remedios.victor.curso.dto.Remedio;
import com.remedios.victor.curso.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/remedios") // endpoint da aplicação que este controller é rodado
public class RemedioController {

    @Autowired
    private RemedioRepository repository;
    @PostMapping // para salvar dados no banco
    public void cadastrar(@RequestBody DadosCadastroRemedio dados){
        repository.save(new Remedio(dados));
    }
}
