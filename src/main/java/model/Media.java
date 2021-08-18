package model;

public abstract class Media {
    private String nome;
    private String descricao;
    private long id;
    private static long currentId;

    public Media(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.id = ++currentId;
    }
    
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
