package com.joaogabriel.cotacao;

import io.github.mainstringargs.alphavantagescraper.AlphaVantageConnector;
import io.github.mainstringargs.alphavantagescraper.StockQuotes;
import io.github.mainstringargs.alphavantagescraper.output.AlphaVantageException;

import java.time.format.DateTimeFormatter;

public class AlphaAdapter implements ServicoCotacao{
    @Override
    public Cotacao getCotacao(String codEmpresa) {
        final String s = System.getenv("ALPHAVANTAGE_APIKEY");
        final String apiKey = s == null ? "50M3AP1K3Y" : s;
        final int timeout = 3000;
        var apiConnector = new AlphaVantageConnector(apiKey, timeout);

        //Permite obter a cotação (quotes) de ações (stocks).
        StockQuotes stockQuotes = new StockQuotes(apiConnector);
        var response = stockQuotes.quote(codEmpresa);
        var stock = response.getStockQuote();

        var cotacao = new Cotacao(codEmpresa, response.getStockQuote().getPrice());
        cotacao.setData(stock.getLatestTradingDay());
        cotacao.setMoeda(stock.getSymbol());
        return cotacao;
    }
}
