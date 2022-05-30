package com.manoelcampos.produtos;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Produto da loja.
 * @author Manoel Campos da Silva Filho
 */
public class Produto {
    private long id;
    private String codigoEan;
    private String descricao;
    private String marca;
    private String modelo;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private int estoque;
    private String categoria;
    private String urlFoto;

    public Produto(long id, String descricao, String marca, double preco, String categoria){
        this.setId(id);
        this.setDescricao(descricao);
        this.setMarca(marca);
        this.setPreco(preco);
        this.dataCadastro = LocalDate.now();
        this.setCategoria(categoria);
    }

    Produto(long id, String codigoEan, String descricao, String marca, String modelo, double preco, LocalDate
            dataCadastro, LocalDate dataUltimaAtualizacao, int estoque, String categoria, String urlFoto) {
        this.id = id;
        this.setCodigoEan(codigoEan);
        this.setDescricao(descricao);
        this.setMarca("marca");
        this.setModelo(modelo);
        this.setPreco(preco);
        this.dataCadastro = LocalDate.now();
        this.dataUltimaAtualizacao = LocalDate.now();
        this.setEstoque(estoque);
        this.setCategoria(categoria);
        this.setUrlFoto(urlFoto);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigoEan() {
        return codigoEan;
    }

    public void setCodigoEan(String codigoEan) {
        Objects.requireNonNull(codigoEan, "codigoEan não pode ser nulo");
        this.codigoEan = codigoEan;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        Objects.requireNonNull(codigoEan,"descricao não pode ser nulo");
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        Objects.requireNonNull(codigoEan,"marca não pode ser nulo");
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isBlank()){
            if (marca == null || marca.isBlank()){
                throw new IllegalArgumentException("É preciso atribuir uma marca para poder informar um modelo");
            }
        }
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <=0){
            throw new IllegalArgumentException("O preço deve ser maior que 0");
        }
        this.preco = preco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        if (dataUltimaAtualizacao.isBefore(dataCadastro)){
            throw new IllegalArgumentException("A data de atualização não pode ser anterior que a data de Cadastro");
        }
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if (estoque == 0) {
            this.estoque = 0;
        }
        else if (estoque < 0 ) {
            throw new IllegalArgumentException("Estoque não pode ser negativo");
        }
        else {
            this.estoque = estoque;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        Objects.requireNonNull(codigoEan,"categoria não pode ser nulo");
        this.categoria = categoria;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        Objects.requireNonNull(codigoEan,"urlFoto não pode ser nulo");
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", codigoEan='" + codigoEan + '\'' +
                ", descricao='" + descricao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", dataCadastro=" + dataCadastro +
                ", dataUltimaAtualizacao=" + dataUltimaAtualizacao +
                ", estoque=" + estoque +
                ", categoria='" + categoria + '\'' +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }
}
