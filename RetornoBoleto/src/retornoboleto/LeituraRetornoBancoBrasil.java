/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retornoboleto;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joaoc
 */
public class LeituraRetornoBancoBrasil implements LeituraRetorno{

    @Override
    public List<Boleto> lerAquivo(String nomeArquivo) {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(nomeArquivo));
            String divisor;
            List<Boleto> boletos = new ArrayList<>();
            
            while((divisor = reader.readLine()) != null){
                
                String[] vetor = divisor.split(";");
                Boleto boleto = new Boleto();
                
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);                              
                boleto.setDataVencimento(LocalDate.parse(vetor[2]));
                boleto.setDataPagamento(LocalDate.parse(vetor[3]).atTime(0, 0, 0));

                boleto.setCpfCliente(vetor[4]);
                boleto.setValor(Double.parseDouble(vetor[5]));
                boleto.setMulta(Double.parseDouble(vetor[6]));
                boleto.setJuros(Double.parseDouble(vetor[7]));

                boletos.add(boleto);                
            }
            return boletos;
        } catch (IOException ex) {
            Logger.getLogger(LeituraRetornoBancoBrasil.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return null;
    }    
}
