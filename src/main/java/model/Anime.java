package model;

import controller.Session;
import daos.AnimeDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Anime implements Comparable<Anime>, Serializable {
    private long id;
    private String nome;
    private String descricao;
    private String imagem;
    private int anoCriacao;
    private int classificacaoIndicativa;
    private int index;
    private List<Autor> autores;
    private List<Temporada> temporadas;
    private List<PlayList> playlists;
    
    public Anime(String nome, String descricao, int ano_criacao, int classificacao_indicativa, String imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoCriacao = ano_criacao;
        this.classificacaoIndicativa = classificacao_indicativa;
        this.imagem = imagem;
        temporadas = new ArrayList<Temporada>();
        playlists = new ArrayList<PlayList>();
        this.index = 0;
    }
    
    public Anime(String nome, String descricao, int ano_criacao, int classificacao_indicativa, String imagem, long id) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoCriacao = ano_criacao;
        this.classificacaoIndicativa = classificacao_indicativa;
        this.imagem = imagem;
        temporadas = new ArrayList<Temporada>();
        playlists = new ArrayList<PlayList>();
        this.index = 0;
        this.id = id;
    }

    public long getId() {
        return id;
    }
    
    public int getAnoCriacao() {
        return anoCriacao;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public List<PlayList> getPlaylists() {
        return playlists;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void addTemporada(Temporada novaTemporada) {
        novaTemporada.setAnime(getId());
        getTemporadas().add(novaTemporada);
    }
    
    public void addPlayList(PlayList novaPlayList) {
        novaPlayList.setAnime(getId());
        getPlaylists().add(novaPlayList);
    }

    public int getIndex() {
        return index;
    }

    public boolean isFavorito() {
        return new AnimeDAO().buscaAnimeFavorito(getId(), Session.getUsuario().getId());
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

    public void setId(long id) {
        this.id = id;
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
