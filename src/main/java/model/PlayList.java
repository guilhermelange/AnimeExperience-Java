package model;

public class PlayList implements Colecao {
    private long id;
    private long animeId;
    private String link;
    private String nome;

    public PlayList(String nome, String link) {
        this.nome = nome;
        this.link = link;
    }
    
    public PlayList(String nome, String link, long id, long animeId) {
        this.nome = nome;
        this.link = link;
        this.id = id;
        this.animeId = animeId;
    }

    public int getQtdMidias() {
        return 0;
    }

    @Override
    public int getTotal() {
        return 0;
    }

    public String getLink() {
        return link;
    }

    public void setAnime(long animeId) {
        this.animeId = animeId;
    }
}