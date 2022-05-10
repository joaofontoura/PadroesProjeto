package com.joaogabriel.exportador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Manoel Campos da Silva Filho
 */
class ExportadorListaProdutoMarkdown extends AbstractExportadorListaProduto {

    @Override
    public String abrirTabela() {
        return null;
    }

    @Override
    public String fecharTabela() {
        return null;
    }

    @Override
    public String abrirLinha() {
        return null;
    }

    @Override
    public String fecharLinha() {
        return null;
    }

    @Override
    public String fecharLinhaTitulos() {
        StringBuilder builder = new StringBuilder();
        for (Coluna coluna : getColunas()){
            builder.append(coluna.abrir() + "----");
        }
        builder.append("\n");
        return builder.toString();
    }

    @Override
    public Coluna newColuna(Function<Produto, Object> obtemValorColuna, String titulo) {
        return new ColunaMarkdown(obtemValorColuna, titulo);
    }

}