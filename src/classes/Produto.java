package classes;

public class Produto {

    // Atributos

    public String nome;
    public double preco;
    public double desconto = 0.25;

    // Métodos: utilizamos os métodos para prover comunicação entre classes que acontece através de troca de mensagens.

    // Temos 4 tipos de métodos:

    // Sem_Com -> Sem "parâmetros" de entrada e com "parâmetro" de retorno.
    // Com_Sem -> Com "parâmetros" de entrada e sem "parâmetro" de retorno.
    // Com_Com -> Com "parâmetros" de entrada e com "parâmetro" de retorno.
    // Sem_Sem -> Sem "parâmetros" de entrada e sem "parâmetro" de retorno.

    // Exemplo: Sem_Com
    // Sem entrada precoComDesconto() -> parênteses vazios
    public double precoComDesconto() {
        return preco * (1 - desconto);
    }

    // Mesma lógica do desconto


    }
