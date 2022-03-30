package com.cadastro.Cadastro.Model.DTO;

import com.cadastro.Cadastro.Model.Status;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProdutoDTO implements Serializable {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
