/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletofuncional;

/**
 *
 * @author aluno
 */
public class BoletoFuncional {

    public static void main(String[] args) {
        ProcessarBoletos processador = new ProcessarBoletos(ProcessarBoletos::lerBradesco);
        String nomeArquivo = "src/bradesco-1.csv";
        processador.processar(nomeArquivo);
    }
}
