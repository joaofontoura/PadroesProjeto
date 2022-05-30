package com.joaogabriel.cotacao;

import io.github.mainstringargs.yahooFinance.YahooFinanceModules;
import io.github.mainstringargs.yahooFinance.YahooFinanceRequest;
import io.github.mainstringargs.yahooFinance.YahooFinanceUrlBuilder;

public class YahooAdapter implements ServicoCotacao{
    @Override
    public Cotacao getCotacao(String codEmpresa) {
        var builder = new YahooFinanceUrlBuilder().modules(YahooFinanceModules.values()).symbol(codEmpresa);
        var request = new YahooFinanceRequest();

        var financeData = request.getFinanceData(request.invoke(builder));
        var financials = financeData.getFinancialData();

        if (financials == null) {
            return new Cotacao();
        }
        var cotacao = new Cotacao(codEmpresa, financials.getCurrentPrice().getRaw().doubleValue());
        cotacao.setMoeda(financials.getFinancialCurrency());
        return cotacao;
    }
}
