package Questoes;
import Base.*;

import java.util.List;

public class Questao1 {
    public static void executar(List<Produto> listaJogos){
        System.out.println("Jogos com valor menor que 100: ");
        listaJogos.stream().filter(jogo -> jogo.getPreco() < 100).forEach(jogo -> System.out.println(jogo.getNome()));

    }
}
