package com.remedios.victor.curso.dto;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "remedios") //diz que a classe será representada em uma tabela cujo nome é "remedios" no banco de dados
@Table(name = "Remedio") // indica que a classe será uma entidade chamada remédios no banco de dados
@Getter //adiciona os getters pelo lombok
@Setter //adiciona os setters pelo lombok
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Remedio {

    @Id // significa que o "private Long id" será o id da aplicação e a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // identifica que o banco vai gerar o ID automaticamente.
    private Long id;
    private String nome;

    @Enumerated(EnumType.STRING) // indica que o atributo é um enum e ele precisa ser mapeado pelo JPA
    private Via via;
    private String lote;
    private String quantidade;
    private String validade;
    @Enumerated(EnumType.STRING) //  indica que o atributo é um enum e ele precisa ser mapeado pelo JPA
    private Laboratorio laboratorio;

    public Remedio(DadosCadastroRemedio dados) {
        this.nome = dados.nome();
        this.via = dados.via();
        this.lote = dados.lote();
        this.quantidade = dados.quantidade();
        this.validade = dados.validade();
        this.laboratorio = dados.laboratorio();
    }
}
