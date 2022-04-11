/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simplefactory;

import java.util.List;

/**
 *
 * @author labbit-03
 */
public interface ExportadorListaProduto {
    
    String abrirTabela();
    String fecharTabela();
    String abrirLinha();
    String fecharLinha();
    String fecharLinhaTitulos();
    String abrirColuna (String valor);
    String fecharColuna();
    
    String exportar(List<Produto> produtos);
    
    static ExportadorListaProduto newInstance(){
        return newInstance("html");
    }
    
     static ExportadorListaProduto newInstance(String extensaoArquivoExportacao){
        switch (extensaoArquivoExportacao){
            case "html": return new ExportadorListaProdutoHtml();
            case "md": return new ExportadorListaProdutoMarkdown();
            default: throw new UnsupportedOperationException(
                    "Formato de arquivo não suportado: " + extensaoArquivoExportacao);
        }
    }
}