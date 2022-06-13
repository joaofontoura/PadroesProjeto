package com.manoelcampos.desconto.calculo;

public class DescontoAniversario implements DescontoService{
    @Override
    public double calcularDescontro(double valorTotal) {
        double desconto = valorTotal * 0.15;
        return valorTotal - desconto;
    }
}
