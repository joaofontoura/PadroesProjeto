package com.manoelcampos.desconto.calculo;

import com.manoelcampos.desconto.model.Cliente;

public class Desconto {
    private Cliente cliente;
    private DescontoService descontoService;

    public Desconto(Cliente cliente, DescontoService descontoService) {
        this.cliente = cliente;
        this.descontoService = descontoService;
    }

    public double calcular(final double valorTotal){
        return descontoService.calcularDescontro(valorTotal);
    }
}
