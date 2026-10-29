package Questoes;
import Base.*;

import java.util.List;
import java.util.stream.Collectors;

public class Questao2 {
    public static void executar(List<Pedido> listaPedidos){

        System.out.println("---------------Resposta da 2----------------");
        System.out.println("lista do id dos pedidos com produtos da categoria \"Papelaria\": ");
        List<Pedido> listaPedidosPapelaria = listaPedidos.stream().
                filter(pedido -> pedido.getListaProdutos().stream().
                        anyMatch(produto -> produto.getCategoria().equals("Papelaria")))
                .collect(Collectors.toList());

        listaPedidosPapelaria.stream().forEach(c -> System.out.println(c.getId())); // imprimi o ID, pois para os pedidos não há um nome

    }
}
