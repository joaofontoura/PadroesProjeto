package com.joaogabriel;

public class ProdutoBuilder {
    private int id;
    private String descricao;
    private double preco;
    private String marca;
    private String modelo;
    private String categoria;
    private int estoque;

    public ProdutoBuilder id(int id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder preco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder estoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public Produto build() {
        return new Produto(id, descricao, preco, marca, modelo, categoria, estoque);
    }
}