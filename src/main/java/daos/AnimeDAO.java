package daos;

import conf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Anime;

public class AnimeDAO {
    private Connection con;
    
    public AnimeDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public int insert(Anime anime) throws SQLException {
        String sql = "INSERT INTO anime (nome, descricao, imagem, ano_criacao, classificacao_indicativa, favorito)"
                           + " VALUES(?,?,?,?,?,?)";
       
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anime.getNome());
        ps.setString(2, anime.getDescricao());
        ps.setString(3, anime.getImagem());
        ps.setInt(4, anime.getAnoCriacao());
        ps.setInt(5, anime.getClassificacaoIndicativa());
        ps.setBoolean(6, anime.isFavorito());
        ps.execute();
        ResultSet generatedKeys = ps.getGeneratedKeys();
        if (generatedKeys.next()) 
            return generatedKeys.getInt(1);
        
        return 0;
    }
    
    public void select() throws SQLException {
        String sql = "SELECT * FROM anime";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            
        }
        
    }
}
