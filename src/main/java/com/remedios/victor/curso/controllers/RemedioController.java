package com.remedios.victor.curso.controllers;

import com.remedios.victor.curso.dto.DadosCadastroRemedio;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/remedios") // endpoint da aplicação que este controller é rodado
public class RemedioController {

    @PostMapping // para salvar dados no banco
    public void cadastrar(@RequestBody DadosCadastroRemedio dados){ // requestbody faz com que o programa entenda o "corpo" do json e o exiba no console.
        System.out.println(dados);
    }
}
