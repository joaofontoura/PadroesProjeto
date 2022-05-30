package com.manoelcampos;

import com.manoelcampos.produtos.Produto;
import com.manoelcampos.produtos.ProdutoBuilder;

public class Principal {
    public static void main(String[] args) {
        ProdutoBuilder builder = new ProdutoBuilder();
        var produto = builder
                .id(1)
                .descricao("TV")
                .marca("Samsung")
                .preco(1799.99)
                .categoria("Eletrodoméstico")
                .codigoEan("225896371")
                .modelo("SM-702V")
                .urlFoto("url")
                .estoque(100)
                .build();

        System.out.println("Produto: "+produto);
    }
}
