package Questoes;

import Base.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Questao4 {
    public static void executar(List<Pedido> listaPedidos) {

        System.out.println("---------------Resposta da 4----------------");
        System.out.println("Lista com os ids dos pedidos mais recentes de cada cliente");

        Map<Cliente, List<Pedido>> PedidoPorCliente = listaPedidos.stream()
                .collect(Collectors.groupingBy(pedido -> pedido.getCliente()));

        List<Pedido> listaRecente = new ArrayList<>();

        PedidoPorCliente.forEach((cliente, pedidos) -> {
            Pedido novo = pedidos.stream()
                    .max(Comparator.comparing(pedido -> pedido.getDataPedido()))
                    .get();

            listaRecente.add(novo);

            System.out.println(novo.getId() + " - " + novo.getCliente().getNome());
        });


    }
}
