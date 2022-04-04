/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletomethod;

/**
 *
 * @author aluno
 */
public class BoletoMethod {
    
    public static void main(String[] args) {
        ProcessarBoletos processador = new LeituraRetornoBradesco();
        String nomeArquivo = "src/bradesco-1.csv";
        processador.processar(nomeArquivo);
    }
    
}
