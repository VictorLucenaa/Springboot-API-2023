package com.remedios.victor.curso.controllers;

import com.remedios.victor.curso.dto.DadosCadastroRemedio;
import com.remedios.victor.curso.dto.DadosListagemRemedio;
import com.remedios.victor.curso.dto.Remedio;
import com.remedios.victor.curso.repository.RemedioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/remedios") // endpoint da aplicação que este controller é rodado
public class RemedioController {

    @Autowired
    private RemedioRepository repository;
    @PostMapping // para salvar dados no banco
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroRemedio dados){
        repository.save(new Remedio(dados));
    }

    @GetMapping
    public List<DadosListagemRemedio> listar (){
        return repository.findAll().stream().map(DadosListagemRemedio::new).toList();
    }
}
