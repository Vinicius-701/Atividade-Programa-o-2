package Base;

public class Produto {
    private long id;
    private String nome;
    private String categoria;
    private double preco;


    public Produto(long numId, String name, String categ, double valor){
        this.id = numId;
        this.nome = name;
        this.categoria = categ;
        this.preco = valor;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }
}
