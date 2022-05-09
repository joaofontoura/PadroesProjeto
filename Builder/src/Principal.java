import com.joaogabriel.ProdutoBuilder;

public class Principal {
    public static void main(String[] args) {
        ProdutoBuilder builder = new ProdutoBuilder("TV", 3499.99);
        var produto = builder
                .marca("Samsung")
                .modelo("SM722U")
                .build();

        System.out.println(produto);
    }
}
