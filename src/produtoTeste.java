import classes.Produto;

public class produtoTeste {

    public static void main(String[] args) {

        Produto produto;
        Produto produto2;

        // Criando o 1° objeto

        produto = new Produto();
        produto.nome = "Play Station 5";
        produto.preco = 5648.99;
        System.out.println("Produto nome: " + produto.nome);
        System.out.println("Produto preço: " + produto.preco);

        // Criando o 2° objeto

        produto2 = new Produto();
        produto2.nome = "Xbox Series X";
        produto2.preco = 5700.90;
        System.out.println("Produto2 nome: " + produto2.nome);
        System.out.println("Produto2 preço: " + produto2.preco);
    }

}
