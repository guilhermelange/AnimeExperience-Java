package model;

import java.util.ArrayList;

public class Anime extends Media implements Comparable<Anime>{
    private ArrayList<Author> autores;
    private String imagem;
    private int anoCriacao;
    private int classificacaoIndicativa;
    private boolean favorito;
    private ArrayList<Season> temporadas;
    private ArrayList<PlayList> playlists;
    private int index;
    
    public Anime(String nome, String descricao, int ano_criacao, int classificacao_indicativa, String imagem) {
        super(nome, descricao);
        this.anoCriacao = ano_criacao;
        this.classificacaoIndicativa = classificacao_indicativa;
        this.imagem = imagem;
        temporadas = new ArrayList<Season>();
        playlists = new ArrayList<PlayList>();
        this.index = 0;
        this.favorito = false;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public ArrayList<Author> getAutores() {
        return autores;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public ArrayList<Season> getTemporadas() {
        return temporadas;
    }

    public ArrayList<PlayList> getPlaylists() {
        return playlists;
    }
    
    public void addTemporada(Season novaTemporada) {
        getTemporadas().add(novaTemporada);
    }
    
    public void addPlayList(PlayList novaPlayList) {
        getPlaylists().add(novaPlayList);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s", getNome());
    }

    public String getImagem() {
        return imagem;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    
    @Override
    public int compareTo(Anime o) {
        if (this.getIndex() < o.getIndex()) {
            return -1;
        } if (this.getIndex() > o.getIndex()) {
            return 1;
        } else {
            return this.getNome().compareToIgnoreCase(o.getNome());
        }
    }
}
