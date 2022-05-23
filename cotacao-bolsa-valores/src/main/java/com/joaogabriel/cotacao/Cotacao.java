package com.joaogabriel.cotacao;

import java.time.LocalDate;

public class Cotacao {
    private String codEmpresa;
    private LocalDate data = LocalDate.now();
    private double preco;
    private String moeda = "R$";

    public Cotacao(String codEmpresa, double preco) {
        this.codEmpresa = codEmpresa;
        this.preco = preco;
    }

    public Cotacao() {
        this.codEmpresa = "";
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    @Override
    public String toString() {
        return "\t-----------Cotação-----------" +
                "\nCódigo Empresa: " + codEmpresa+
                "\nData: " + data +
                "\nPreco: " + preco +
                "\nMoeda: " + moeda;
    }
}
