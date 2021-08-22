package daos;

import conf.DBConnection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PlayList;

public class PlayListDAO {
    public ArrayList<PlayList> buscaPorAnime(long animeId) {
        Connection connection = DBConnection.conectar();
        String sql = "SELECT * FROM playlist WHERE aniid = ?";
        PreparedStatement pstmt;
        ArrayList<PlayList> playlists = new ArrayList<PlayList>();
        
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animeId);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                PlayList playlist = new PlayList(rs.getString("pltnom"), 
                                                 rs.getString("pltlink"),
                                                 rs.getLong("pltid"),
                                                 rs.getLong("aniid"));
                playlists.add(playlist);
            }
            rs.close();
            
            return playlists;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return playlists;
        } finally {
            DBConnection.desconectar();
        }
    }
}
