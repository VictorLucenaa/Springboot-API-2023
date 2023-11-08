package com.remedios.victor.curso.controllers;

import com.remedios.victor.curso.infra.TokenService;
import com.remedios.victor.curso.users.AutenticacaoService;
import com.remedios.victor.curso.users.DadosAutenticacao;
import com.remedios.victor.curso.users.User;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;


    @PostMapping
    @Transactional
    public ResponseEntity<?> efetuarLogin(@RequestBody @Valid DadosAutenticacao dados){
       var token = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
        var autenticacao = manager.authenticate(token);
       return ResponseEntity.ok(tokenService.gerarToken((User) autenticacao.getPrincipal()));
    }
}
