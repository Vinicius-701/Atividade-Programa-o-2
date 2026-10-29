import java.math.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1234, "José");
        Cliente c2 = new Cliente(3456, "Laura");
        Cliente c3 = new Cliente(6789, "Pedro");


        Produto p1 = new Produto(1122, "Papel A4", "Papelaria", 4);
        Produto p2 = new Produto(3344, "Tesoura", "Papelaria", 20);
        Produto p3 = new Produto(5566, "Cola", "Papelaria", 10);

        Produto p4 = new Produto(7788, "Fifa", "Jogo", 40);
        Produto p5 = new Produto(9999, "God of War", "Jogo", 60);
        Produto p6 = new Produto(3434, "Read Dead Redemption", "Jogo", 100);

        Produto p7 = new Produto(6677, "Crime e Castigo", "Livro", 50);
        Produto p8 = new Produto(7654, "Cem anos de Solidão", "Livro", 70);
        Produto p9 = new Produto(5476, "Harry Potter", "Livro", 40);


        Pedido V1 = new Pedido(1111, 28, 10, 2026, List.of(p1, p2), c1);
        Pedido V2 = new Pedido(2222, 14, 5, 2026, List.of(p5, p8), c2);
        Pedido V3 = new Pedido(3333, 30, 11, 2025, List.of(p3, p6), c3);
        Pedido V4 = new Pedido(4444, 3, 3, 2025, List.of(p3, p6), c1);
        Pedido V5 = new Pedido(5555, 5, 11, 2024, List.of(p3, p6), c2);
        Pedido V6 = new Pedido(6666, 12, 3, 2026, List.of(p3, p6), c3);


        List<Cliente> listaClientes = new ArrayList<>(List.of(c1, c2, c3));

        List<Produto> listaPapelaria = new ArrayList<>(List.of(p1, p2, p3));
        List<Produto> listaJogos = new ArrayList<>(List.of(p4, p5, p6));
        List<Produto> listaLivros = new ArrayList<>(List.of(p7, p8, p9));
        List<Produto> listaPodutosTodos = new ArrayList<>(List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9));

        List<Pedido> listaPedidos = new ArrayList<>(List.of(V1, V2, V3, V4, V5, V6));


        // resposta da 1
        listaJogos.stream().filter(jogo -> jogo.getPreco() < 100).forEach(jogo -> System.out.println(jogo.getNome()));

        // resposta da 2
        System.out.println("---------------Resposta da 2----------------");
        List<Pedido> listaPedidosPapelaria = listaPedidos.stream().
                filter(pedido -> pedido.getListaProdutos().stream().
                        anyMatch(produto -> produto.getCategoria().equals("Papelaria")))
                .collect(Collectors.toList());

        listaPedidosPapelaria.stream().forEach(c -> System.out.println(c.getId())); // imprimi o ID, pois para os pedidos não há um nome

        // resposta da 3 - forEach dentro de outro forEach
        System.out.println("---------------Resposta da 3----------------");

        listaPodutosTodos.stream().collect(Collectors.groupingBy(c -> c.getCategoria()))
                .forEach((categoria, produtos) -> {
                    System.out.println("Categoria: " + categoria);

                    produtos.forEach(produto -> System.out.println(produto.getNome()));
                });


        // resposta da 4
        System.out.println("---------------Resposta da 4----------------");


        Map<Cliente, List<Pedido>> PedidoPorCliente = listaPedidos.stream()
                .collect(Collectors.groupingBy(pedido -> pedido.getCliente()));

        List<Pedido> listaRecente = new ArrayList<>();

        PedidoPorCliente.forEach((cliente, pedidos) -> {
            Pedido novo = pedidos.stream()
                    .max(Comparator.comparing(pedido -> pedido.getDataPedido()))
                    .get();

            listaRecente.add(novo);

            System.out.println(novo.getId());
        });


    }






}
