/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retornoboleto;

import java.util.List;

/**
 *
 * @author joaoc
 */
public class ProcessarBoletos {
    
    private final LeituraRetorno leituraRetorno;

    public ProcessarBoletos(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }    
    
    public final void processar(String nomeArquivo){
        List<Boleto> boletos = leituraRetorno.lerAquivo(nomeArquivo);
        for (Boleto boleto : boletos) {
            System.out.println(boleto);
        }
    }
}
