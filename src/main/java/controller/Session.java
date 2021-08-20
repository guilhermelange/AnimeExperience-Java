package controller;

import model.Anime;
import model.Episodio;
import model.Usuario;

public class Session {
    private static Usuario usuario;
    private static Anime anime;
    private static Episodio episodio;

    public static Anime getAnime() {
        return anime;
    }

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setAnime(Anime anime) {
        Session.anime = anime;
    }

    public static void setUsuario(Usuario usuario) {
        Session.usuario = usuario;
    }

    public static Episodio getEpisodio() {
        return episodio;
    }

    public static void setEpisodio(Episodio episodio) {
        Session.episodio = episodio;
    }
}
