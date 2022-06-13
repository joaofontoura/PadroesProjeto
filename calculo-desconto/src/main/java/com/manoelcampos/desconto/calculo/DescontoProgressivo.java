package com.manoelcampos.desconto.calculo;

public class DescontoProgressivo implements DescontoService{
    @Override
    public double calcularDescontro(double valorTotal) {
        double progressao = valorTotal/20;
        if (progressao >= 20){
            valorTotal = valorTotal - (valorTotal*0.2);
        }
        else{
            valorTotal = valorTotal - (progressao);
        }
        return valorTotal;
    }
}
