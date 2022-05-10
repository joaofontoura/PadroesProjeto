package com.joaogabriel.exportador;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractExportadorListaProduto implements ExportadorListaProduto {
    private List<Coluna> colunas;

    public AbstractExportadorListaProduto() {
        setColunas(new ArrayList<>());
        getColunas().add(newColuna(Produto::getId, "Código"));
        getColunas().add(newColuna(Produto::getDescricao, "Descrição"));
        getColunas().add(newColuna(Produto::getMarca, "Marca"));
        getColunas().add(newColuna(Produto::getModelo, "Modelo"));
        getColunas().add(newColuna(Produto::getEstoque, "Estoque"));
    }

    @Override
    public void addColuna(Coluna coluna) {
        getColunas().add(coluna);
    }

    @Override
    public final String exportar(List<Produto> listaProdutos) {
        final StringBuilder builder = new StringBuilder();
        builder.append(abrirTabela());

        for (Coluna coluna : getColunas()){
            builder.append(coluna.exportarCabecalho());
        }
        builder.append("\n");
        builder.append(fecharLinhaTitulos());
        gerarLinhasProdutos(builder, listaProdutos);
        builder.append(fecharTabela());
        return builder.toString();
    }
    private void gerarLinhasProdutos(StringBuilder sb, List<Produto> listaProdutos) {
        for (Produto produto : listaProdutos){
            sb.append(gerarColunasLinha(produto));
        }
    }
    protected String gerarColunasLinha(Produto produto) {
        StringBuilder sb = new StringBuilder();
        sb.append(abrirLinha());
        for (Coluna coluna : getColunas()) {
            sb.append(coluna.exportarDado(produto));
        }
        sb.append(fecharLinha());
        sb.append("\n");
        return sb.toString();
    }

    public List<Coluna> getColunas() {
        return colunas;
    }

    public void setColunas(List<Coluna> colunas) {
        this.colunas = colunas;
    }
}