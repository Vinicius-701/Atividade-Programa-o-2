package Base;

public class Cliente {

    private long id;
    private String nome;

    public Cliente(long numId, String name){
        this.id = numId;
        this.nome = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
