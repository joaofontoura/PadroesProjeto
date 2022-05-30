import com.jimmoores.quandl.DataSetRequest;
import com.jimmoores.quandl.classic.ClassicQuandlSession;
import com.joaogabriel.cotacao.AlphaAdapter;
import com.joaogabriel.cotacao.QuandlAdapter;
import com.joaogabriel.cotacao.ServicoCotacao;
import com.joaogabriel.cotacao.YahooAdapter;
import io.github.mainstringargs.alphavantagescraper.AlphaVantageConnector;
import io.github.mainstringargs.alphavantagescraper.StockQuotes;
import io.github.mainstringargs.alphavantagescraper.output.AlphaVantageException;

import java.time.format.DateTimeFormatter;

/*
    @author Manoel Campos da Silva Filho
*/
public class Principal {
    public static void main(String[] args) {
        //YahooService
        var servicoYahoo = new YahooAdapter();
        var cotacaoYahoo = servicoYahoo.getCotacao("VALE3.sa");
        System.out.println(cotacaoYahoo);

        //AlphaVantage
        var servicoApha = new AlphaAdapter();
        var cotacaoAlpha = servicoApha.getCotacao("INTL");
        System.out.println(cotacaoAlpha);

        /*Quandl
        var servicoQuandl = new QuandlAdapter();
        var cotacaoQuandl = servicoQuandl.getCotacao("AAPL");
        System.out.println(cotacaoQuandl);*/
    }
}
