package com.joaogabriel.cotacao;
import com.jimmoores.quandl.DataSetRequest;
import com.jimmoores.quandl.classic.ClassicQuandlSession;
import java.time.format.DateTimeFormatter;

public class QuandlAdapter implements ServicoCotacao{
    @Override
    public Cotacao getCotacao(String codEmpresa) {
        var session = ClassicQuandlSession.create();
        var request = DataSetRequest.Builder
                .of(codEmpresa)
                .withMaxRows(1)
                .build();
        var result = session.getDataSet(request);

        if (result.size() == 0){
            return new Cotacao();
        }
        var row = result.get(0);
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = formatter.format(row.getLocalDate("Date"));

        var cotacao = new Cotacao(codEmpresa, row.getDouble("Close"));
        cotacao.setData(row.getLocalDate("Date"));
        return cotacao;
    }
}
