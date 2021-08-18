package model;

public class PlayList extends Media implements Collection {
    private String link;
    private static long currentId;

    public PlayList(String nome, String descricao, String link) {
        super(nome, descricao);
        this.link = link;
        this.setId(++currentId);
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
}