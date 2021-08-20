package daos;

import conf.DBConexao;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Episodio;

public class EpisodioDAO {
    public ArrayList<Episodio> buscaPorAnimeTemp(long animeId, int tempNum) {
        Connection connection = DBConexao.conectar();
        String sql = "SELECT * FROM episodio WHERE aniid = ? AND tempnum = ?";
        PreparedStatement pstmt;
        ArrayList<Episodio> episodios = new ArrayList<Episodio>();
        
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animeId);
            pstmt.setInt(2, tempNum);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Episodio episodio = new Episodio(rs.getString("epinum"),
                                                 rs.getString("epidesc"),
                                                 rs.getInt("epinum"),
                                                 rs.getInt("epidur"),
                                                 rs.getString("epilink"),
                                                 rs.getLong("aniid"),
                                                 rs.getInt("tempnum"));
                episodios.add(episodio);
            }
            rs.close();
            
            return episodios;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return episodios;
        } finally {
            DBConexao.desconectar();
        }
    }
}
