package daos;

import conf.DBConexao;
import controller.Session;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Anime;

public class AnimeDAO {
    public boolean insert(Anime anime) {
        Connection connection = DBConexao.conectar();
        String sql = "INSERT INTO anime (anianocri, aniclaind, anidesc, aniimg, aniidx, aninom) "
                   + "VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, anime.getAnoCriacao());
            pstmt.setInt(2, anime.getClassificacaoIndicativa());
            pstmt.setString(3, anime.getDescricao());
            pstmt.setString(4, anime.getImagem());
            pstmt.setInt(5, anime.getIndex());
            pstmt.setString(6, anime.getNome());
            pstmt.execute();

            final ResultSet resultado = pstmt.getGeneratedKeys();
            if (resultado.next()) {
                int id = resultado.getInt(1);
                anime. setId(id);
            }
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            DBConexao.desconectar();
        }
    }
    
    public boolean update(Anime anime) {
        Connection connection = DBConexao.conectar();
        String sql = "UPDATE anime SET anianocri=?, aniclaind=?, anidesc=?, aniimg=?, aniidx=?, aninom=?"
                   + "WHERE aniid = ?";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, anime.getAnoCriacao());
            pstmt.setInt(2, anime.getClassificacaoIndicativa());
            pstmt.setString(3, anime.getDescricao());
            pstmt.setString(4, anime.getImagem());
            pstmt.setInt(5, anime.getIndex());
            pstmt.setString(6, anime.getNome());
            pstmt.setLong(7, anime.getId());
            int rowsAfetadas = pstmt.executeUpdate();

            return (rowsAfetadas > 0);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            DBConexao.desconectar();
        }
    }
    
    public Anime buscaPorId(long id) {
        Connection connection = DBConexao.conectar();
        String sql = "SELECT * FROM anime WHERE aniid = ?";
        PreparedStatement pstmt;
        Anime anime = null;
        
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                anime = new Anime(rs.getString("aninom"), 
                                  rs.getString("anidesc"),
                                  rs.getInt("anianocri"),
                                  rs.getInt("aniclaind"), 
                                  rs.getString("aniimg"), 
                                  rs.getLong("aniid"));
                anime.setIndex(rs.getInt("aniidx"));
                break;
            }
            rs.close();
            
            return anime;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return anime;
        } finally {
            DBConexao.desconectar();
        }
    }
    
    public ArrayList<Anime> buscaTodos() {
        Connection connection = DBConexao.conectar();
        String sql = "SELECT * FROM anime";
        PreparedStatement pstmt;
        ArrayList<Anime> animes = new ArrayList<Anime>();
        
        try {
            pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Anime anime = new Anime(rs.getString("aninom"), 
                                  rs.getString("anidesc"),
                                  rs.getInt("anianocri"),
                                  rs.getInt("aniclaind"), 
                                  rs.getString("aniimg"), 
                                  rs.getLong("aniid"));
                anime.setIndex(rs.getInt("aniidx"));
                animes.add(anime);
            }
            rs.close();
            
            return animes;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return animes;
        } finally {
            DBConexao.desconectar();
        }
    }
    
    public ArrayList<Anime> buscaTodosFavoritados() {
        Connection connection = DBConexao.conectar();
        String sql = "SELECT * FROM anime a JOIN usuario_favorito b ON a.aniid = b.aniid "
                + " WHERE b.usuid = ?";
        PreparedStatement pstmt;
        ArrayList<Anime> animes = new ArrayList<Anime>();
        
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, Session.getUsuario().getId());
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Anime anime = new Anime(rs.getString("aninom"), 
                                  rs.getString("anidesc"),
                                  rs.getInt("anianocri"),
                                  rs.getInt("aniclaind"),
                                  rs.getString("aniimg"), 
                                  rs.getLong("aniid"));
                anime.setIndex(rs.getInt("aniidx"));
                animes.add(anime);
            }
            rs.close();
            
            return animes;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return animes;
        } finally {
            DBConexao.desconectar();
        }
    }
    
    public boolean buscaAnimeFavorito(long animeId, long usuarioId) {
        Connection connection = DBConexao.conectar();
        String sql = "SELECT 1 FROM usuario_favorito WHERE aniid=? AND usuid=?";
        PreparedStatement pstmt;

        boolean isFavorito = false;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animeId);
            pstmt.setLong(2, usuarioId);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                isFavorito = true;
                break;
            }
            rs.close();

            return isFavorito;       
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return isFavorito;
        } finally {
            DBConexao.desconectar();
        }
    }
    
    public boolean removeFavorito(long animeId, long usuarioId) {
        Connection connection = DBConexao.conectar();
        String sql = "DELETE FROM usuario_favorito "
                   + "WHERE aniid = ? AND usuid = ?";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animeId);
            pstmt.setLong(2, usuarioId);
            int executeUpdate = pstmt.executeUpdate();

            return (executeUpdate > 0);            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            DBConexao.desconectar();
        }
    }
    
    public boolean insertFavorito(long animeId, long usuarioId) {
        Connection connection = DBConexao.conectar();
        String sql = "INSERT INTO usuario_favorito (aniid, usuid)"
                   + " VALUES (?,?)";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animeId);
            pstmt.setLong(2, usuarioId);
            pstmt.execute();

            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            DBConexao.desconectar();
        }
    }
}
