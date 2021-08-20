package model;

import java.util.ArrayList;
import java.util.List;

public class Temporada implements Colecao, Comparable<Temporada> {
    private int numero;
    private long animeId;
    private List<Episodio> episodios;
    private String nome;
    private String descricao;

    public Temporada(String nome, String descricao, int numero) {
        this.nome = nome;
        this.descricao = descricao;
        this.numero = numero;
        episodios = new ArrayList<Episodio>();
    }
    
    public Temporada(String nome, String descricao, int numero, long animeId) {
        this.nome = nome;
        this.descricao = descricao;
        this.numero = numero;
        this.animeId = animeId;
        episodios = new ArrayList<Episodio>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public int getQtdMidias() {
        return (int) getEpisodios().stream().count();
    }

    @Override
    public int getTotal() {
        int tempoTotal = 0;
        for (Episodio episodio : getEpisodios()) {
            tempoTotal += episodio.getDuracao() * 60;
        }
        return tempoTotal;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }
    
    public void addEpisodio(Episodio novoEpisodio) {
        novoEpisodio.setTemporada(getNumero());
        getEpisodios().add(novoEpisodio);
    }

    public int getNumero() {
        return numero;
    }

    public void setAnime(long animeId) {
        this.animeId = animeId;
    }

    @Override
    public int compareTo(Temporada o) {
        return Integer.compare(this.getNumero(), o.getNumero());
    }

    @Override
    public String toString() {
        return String.format("Temporada %d - %s", getNumero(), getNome());
    }
}
