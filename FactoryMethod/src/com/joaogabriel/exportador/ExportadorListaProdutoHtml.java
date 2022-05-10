package com.joaogabriel.exportador;

import java.util.function.Function;

/**
 * @author Manoel Campos da Silva Filho
 */

class ExportadorListaProdutoHtml extends AbstractExportadorListaProduto {
    @Override
    public String abrirTabela() {
        return "<table>\n";
    }

    @Override
    public String fecharTabela() {
        return "</table>\n";
    }

    @Override
    public String abrirLinha() {
        return "  <tr>";
    }

    @Override
    public String fecharLinha() {
        return "</tr>\n";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }

    @Override
    public Coluna newColuna(Function<Produto, Object> obtemValorColuna, String titulo) {
        return new ColunaHtml(obtemValorColuna, titulo);
    }
}