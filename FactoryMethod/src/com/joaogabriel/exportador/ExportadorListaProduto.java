package com.joaogabriel.exportador;

import java.util.List;
import java.util.function.Function;

public interface ExportadorListaProduto {
    String abrirTabela();
    String fecharTabela();
    String abrirLinha();
    String fecharLinha();
    String fecharLinhaTitulos();
    String exportar(List<Produto> produtos);

    Coluna newColuna(Function<Produto, Object> obtemValorColuna, String titulo);
    void addColuna(Coluna coluna);

    static ExportadorListaProduto newInstance(){
        return newInstance("html");
    }
    static ExportadorListaProduto newInstance(String extensaoArquivoExportacao){
        switch (extensaoArquivoExportacao){
            case "html": return new ExportadorListaProdutoHtml();
            case "md": return new ExportadorListaProdutoMarkdown();
            default: throw new UnsupportedOperationException("Formato de arquivo não suportado: " + extensaoArquivoExportacao);
        }
    }
}
