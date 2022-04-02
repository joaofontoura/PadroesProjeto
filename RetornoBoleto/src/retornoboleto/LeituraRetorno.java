/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retornoboleto;

import java.net.URI;
import java.util.List;

/**
 *
 * @author joaoc
 */
public interface LeituraRetorno {
    
    List<Boleto> lerAquivo(String nomeArquivo);
}
