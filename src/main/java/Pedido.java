import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private long id;
    private LocalDate dataPedido;
    private List<Produto> listaProdutos = new ArrayList<>();
    private Cliente cliente;

        public Pedido(long numId,int dia, int mes, int ano, List<Produto> lista, Cliente c){
            this.id = numId;
            this.dataPedido = LocalDate.of(ano, mes, dia);
            this.listaProdutos = lista;
            this.cliente = c;
        }

    public void setId(long id) {
        this.id = id;
    }

    public void setDataPedido(int dia, int mes, int ano) {
        this.dataPedido = LocalDate.of(ano, mes, dia);;
    }

    public void setListaProdutos(List<Produto> listaPedidos) {
        this.listaProdutos = listaPedidos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
