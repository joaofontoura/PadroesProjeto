package org.joaogabriel.rest.cepservice;

import org.joaogabriel.rest.model.Endereco;

public interface CepService {
    Endereco buscaEndereco(String cep);
}
