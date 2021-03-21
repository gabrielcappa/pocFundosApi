package com.cappa.pocFundosApi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "fundo")
public class FundoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_produto" ,nullable = false, unique = true)
    private Integer codigoProduto;

    @Column(name = "cnpj" ,nullable = false, unique = true)
    private String cnpj;

    @Column(name = "nome" ,nullable = false)
    private String nome;

}
