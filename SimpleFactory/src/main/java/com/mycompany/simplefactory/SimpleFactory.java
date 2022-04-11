/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labbit-03
 */
public class SimpleFactory {

    public static void main(String[] args) throws IOException {
        String nomeArquivo = "src/produtos.csv";
        BufferedReader reader = Files.newBufferedReader(Paths.get(nomeArquivo));
        String line;
        List<Produto> produtos = new ArrayList();
        
        while ((line = reader.readLine()) != null){
            String vetor[] = line.split(",");
            Produto produto = new Produto();
            
            produto.setId(Integer.parseInt(vetor[0]));
            produto.setDescricao(vetor[1]);
            produto.setMarca(vetor[2]);
            produto.setModelo(vetor[3]);
            produto.setEstoque(Integer.parseInt(vetor[4]));
            
            produtos.add(produto);
        }
        
        ExportadorListaProduto exportadorPadrao = ExportadorListaProduto.newInstance();
        System.out.println("Lista de Produtos em HTML\n");
        System.out.println(exportadorPadrao.exportar(produtos));

        ExportadorListaProduto exportadorMarkdown = ExportadorListaProduto.newInstance("md");
        System.out.println("Lista de Produtos em Markdown\n");
        System.out.println(exportadorMarkdown.exportar(produtos));
    }
}
