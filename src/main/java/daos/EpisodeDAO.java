package daos;

import conf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Episode;

public class EpisodeDAO {
    private Connection con;
    
    public EpisodeDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public int insert(int animeId, int temporadaId, Episode episodio) throws SQLException {
        String sql = "INSERT INTO episodio (anime_id, temporada_id, nome, descricao, numero, link) "
                           + " VALUES(?,?,?,?,?,?)";
       
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, animeId);
        ps.setInt(2, temporadaId);
        ps.setString(3, episodio.getNome());
        ps.setString(4, episodio.getDescricao());
        ps.setInt(5, episodio.getNumero());
        ps.setString(6, episodio.getLink());
        ps.execute();
        ResultSet generatedKeys = ps.getGeneratedKeys();
        if (generatedKeys.next()) 
            return generatedKeys.getInt(1);
        
        return 0;
    }
}
