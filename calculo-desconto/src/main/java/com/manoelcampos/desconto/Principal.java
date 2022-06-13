package com.manoelcampos.desconto;

import com.manoelcampos.desconto.calculo.Desconto;
import com.manoelcampos.desconto.calculo.DescontoProgressivo;
import com.manoelcampos.desconto.model.Cliente;
import com.manoelcampos.desconto.model.Venda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Carlos");
        cliente.setDataNascimento(LocalDate.parse("01/05/2001", formatter));

        Venda venda = new Venda();
        venda.setId(1);
        venda.setValorTotal(1000.00);
        venda.setData(LocalDate.now());

        final Desconto desconto = new Desconto(cliente, new DescontoProgressivo());
        System.out.println("O valor total da compra sem desconto foi: "+
                venda.getValorTotal()+
                "\nO valor com desconto foi: "+desconto.calcular(venda.getValorTotal()));
    }
}
