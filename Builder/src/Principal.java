import com.joaogabriel.ProdutoBuilder;

public class Principal {
    public static void main(String[] args) {
        ProdutoBuilder builder = new ProdutoBuilder();
        var produto = builder
                .descricao("Televisão")
                .marca("Samsung")
                .modelo("SMS3212")
                .preco(3499)
                .build();

        System.out.println(produto);
    }
}
