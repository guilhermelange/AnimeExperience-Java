package model;

public class Episodio implements Comparable<Episodio>{
    private int numero;
    private int duracao;
    private String link;
    private String nome;
    private String descricao;    
    private int temporada;
    private long animeId;

    public Episodio(String nome, String descricao, int numero, int duracao, String link) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.link = link;
        this.numero = numero;
    }
    
    public Episodio(String nome, String descricao, int numero, int duracao, String link, long animeId, int tempNum) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.link = link;
        this.numero = numero;
        this.animeId = animeId;
        this.temporada = tempNum;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getLink() {
        return link;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public int compareTo(Episodio o) {
        return Integer.compare(this.getNumero(), o.getNumero());
    }
}
