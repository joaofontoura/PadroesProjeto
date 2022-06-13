package com.manoelcampos.desconto.calculo;

public class DescontoDefinido implements DescontoService{
    @Override
    public double calcularDescontro(double valorTotal) {
        double desconto = valorTotal * 0.1;
        return valorTotal - desconto;
    }
}
