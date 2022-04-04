/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletomethod;

import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author aluno
 */
public abstract class LeituraRetorno {
    DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    List<Boleto> lerArquivo;
    
    protected abstract Boleto processarLinhaArquivo(String[] vetorLinhaArq);
   
}
