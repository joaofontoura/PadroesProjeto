/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retornoboleto;

/**
 *
 * @author joaoc
 */
public class RetornoBoleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final ProcessarBoletos processador = new ProcessarBoletos(new LeituraRetornoBancoBrasil());
        
        String nomeArquivo = "banco.csv";
        System.out.println("Lendo arquivo " + nomeArquivo + "\n");

        processador.processar(nomeArquivo);
    }
    
}
