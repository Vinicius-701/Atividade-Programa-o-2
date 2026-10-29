package Questoes;

import Base.*;

import java.util.List;
import java.util.stream.Collectors;

public class Questao3 {
    public static void executar(List<Produto> listaPodutosTodos){
        System.out.println("---------------Resposta da 3----------------");
        System.out.println("Produtos agrupados por categoria: ");

        listaPodutosTodos.stream().collect(Collectors.groupingBy(c -> c.getCategoria()))
                .forEach((categoria, produtos) -> {
                    System.out.println("Categoria: " + categoria);

                    produtos.forEach(produto -> System.out.println(produto.getNome()));
                });

    }
}
