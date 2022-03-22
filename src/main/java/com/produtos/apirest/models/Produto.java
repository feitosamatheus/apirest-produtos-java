package com.produtos.apirest.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity   // DIZ QUE É UMA ENTIDADE (TABELA) DO BANCO DE DADOS
@Table(name = "PRODUTO")  // DEFINIR O NOME DA TABELA
public class Produto {  // SERINALIZA A CLASSE TRANSFORMANDO EM BYTES

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GERA AUTOMATICAMENTO A NUMERAÇÃO DO ID
    private long id;

    private String nome;

    private BigDecimal quantidade;

    private BigDecimal valor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
