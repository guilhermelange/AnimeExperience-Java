package daos;

import conf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Season;

public class SeasonDAO {
    private Connection con;
    
    public SeasonDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public int insert(int animeId, Season temporada) throws SQLException {
        String sql = "INSERT INTO temporada (anime_id, nome, descricao, numero) "
                           + " VALUES(?,?,?,?)";
       
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, animeId);
        ps.setString(2, temporada.getNome());
        ps.setString(3, temporada.getDescricao());
        ps.setInt(4, temporada.getNumero());
        ps.execute();
        ResultSet generatedKeys = ps.getGeneratedKeys();
        if (generatedKeys.next()) 
            return generatedKeys.getInt(1);
        
        return 0;
    }
}
