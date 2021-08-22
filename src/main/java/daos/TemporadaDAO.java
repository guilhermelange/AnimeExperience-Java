package daos;

import conf.DBConnection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Temporada;

public class TemporadaDAO {
    public ArrayList<Temporada> buscaPorAnime(long animeId) {
        Connection connection = DBConnection.conectar();
        String sql = "SELECT * FROM temporada WHERE aniid = ?";
        PreparedStatement pstmt;
        ArrayList<Temporada> temporadas = new ArrayList<Temporada>();
        
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animeId);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Temporada temporada = new Temporada(rs.getString("tempnom"),
                                                    rs.getString("tempdesc"),
                                                    rs.getInt("tempnum"),
                                                    rs.getLong("aniid"));
                temporadas.add(temporada);
            }
            rs.close();
            
            return temporadas;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return temporadas;
        } finally {
            DBConnection.desconectar();
        }
    }
}
