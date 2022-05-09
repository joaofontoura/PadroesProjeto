package com.joaogabriel;

import java.time.LocalDate;

public final class Produto {
    private int id;
    private String descricao;
    private double preco;
    private String marca;
    private String modelo;
    private String categoria;
    private int estoque;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    Produto(int id, String descricao, double preco, String marca, String modelo, String categoria, int estoque) {
        this.id = id;
        this.descricao = descricao;
        this.setPreco(preco);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.categoria = categoria;
        this.estoque = estoque;
        this.dataCadastro = LocalDate.now();
        this.dataAtualizacao = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0)
            throw new IllegalArgumentException("O preço deve ser maior que 0");
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (marca == null || marca.isBlank())
            throw new IllegalArgumentException("É preciso atribuir uma marca para poder informar um modelo");
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", estoque=" + estoque +
                ", dataCadastro=" + dataCadastro +
                ", dataAtualizacao=" + dataAtualizacao +
                '}';
    }
}
