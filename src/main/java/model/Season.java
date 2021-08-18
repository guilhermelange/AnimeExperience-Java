package model;

import java.util.ArrayList;

public class Season extends Media implements Collection, Comparable<Season> {
    private int numero;
    private static long currentId;
    private ArrayList<Episode> episodios;

    public Season(String nome, String descricao, int numero) {
        super(nome, descricao);
        this.numero = numero;
        this.setId(++currentId);
        episodios = new ArrayList<Episode>();
    }

    @Override
    public int getQtdMidias() {
        return (int) getEpisodios().stream().count();
    }

    @Override
    public int getTotal() {
        int tempoTotal = 0;
        for (Episode episodio : getEpisodios()) {
            tempoTotal += episodio.getDuracao() * 60;
        }
        return tempoTotal;
    }

    public ArrayList<Episode> getEpisodios() {
        return episodios;
    }
    
    public void addEpisodio(Episode novoEpisodio) {
        getEpisodios().add(novoEpisodio);
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Season o) {
        return Integer.compare(this.getNumero(), o.getNumero());
    }

    @Override
    public String toString() {
        return String.format("Temporada %d - %s", getNumero(), getNome());
    }
}
