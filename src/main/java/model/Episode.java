package model;

public class Episode extends Media implements Comparable<Episode>{
    private int duracao;
    private String link;
    private int numero;
    private static long currentId;

    public Episode(String nome, String descricao, int numero, int duracao, String link) {
        super(nome, descricao);
        this.duracao = duracao;
        this.link = link;
        this.numero = numero;
        this.setId(++currentId);
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

    @Override
    public int compareTo(Episode o) {
        return Integer.compare(this.getNumero(), o.getNumero());
    }
}
