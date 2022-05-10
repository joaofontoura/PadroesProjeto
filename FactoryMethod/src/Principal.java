import com.joaogabriel.exportador.ExportadorListaProduto;
import com.joaogabriel.exportador.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Produto> produtos =
                Arrays.asList(
                        new Produto("TV", "LG", "132-A", 120),
                        new Produto("Notebook", "Asus", "New age", 341),
                        new Produto("Smartphone", "Samsung", "Galaxy S10", 214));

        ExportadorListaProduto exportador = ExportadorListaProduto.newInstance("md");
        System.out.println(exportador.exportar(produtos));
    }
}
