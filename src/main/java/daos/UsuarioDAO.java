package daos;

import conf.DBConexao;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import model.Usuario;

public class UsuarioDAO {
    public boolean insert(Usuario usuario) {
        Connection connection = DBConexao.conectar();
        String sql = "INSERT INTO usuario (usuema, usunom, ususen) "
                   + "VALUES (?,?,?)";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, usuario.getEmail());
            pstmt.setString(2, usuario.getName());
            pstmt.setString(3, usuario.getPassword());
            pstmt.execute();

            final ResultSet resultado = pstmt.getGeneratedKeys();
            if (resultado.next()) {
                int id = resultado.getInt(1);
                usuario.setId(id);
            }
            return true;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            DBConexao.desconectar();
        }
    }
    
    public boolean update(Usuario usuario) {
        Connection connection = DBConexao.conectar();
        String sql = "UPDATE usuario SET usuema=?,usunom=?,ususen=?"
                   + "WHERE usuid = ?";
        PreparedStatement pstmt;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, usuario.getEmail());
            pstmt.setString(2, usuario.getName());
            pstmt.setString(3, usuario.getPassword());
            pstmt.setLong(4, usuario.getId());
            int rowsAfetadas = pstmt.executeUpdate();

            return (rowsAfetadas > 0);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            DBConexao.desconectar();
        }
    }
    
    public Usuario buscaPorId(long id) {
        Connection connection = DBConexao.conectar();
        String sql = "SELECT * FROM usuario WHERE usuid = ?";
        PreparedStatement pstmt;
        Usuario usuario = null;
        
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String email = rs.getString("usuema");
                String nome = rs.getString("usunom");
                String senha = rs.getString("ususen");
                usuario = new Usuario(email, senha, nome);
                break;
            }
            rs.close();
            
            return usuario;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return usuario;
        } finally {
            DBConexao.desconectar();
        }
    }
    
    public Usuario buscaUsuario(String email, String senha) {
        Connection connection = DBConexao.conectar();
        String sql = "SELECT * FROM usuario WHERE usuema=? AND ususen=?";
        PreparedStatement pstmt;
        Usuario usuario = null;
        
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, senha);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String usuema = rs.getString("usuema");
                String usunom = rs.getString("usunom");
                String ususen = rs.getString("ususen");
                long usuid = rs.getLong("usuid");
                usuario = new Usuario(usuema, ususen, usunom, usuid);
                break;
            }
            rs.close();
            
            return usuario;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return usuario;
        } finally {
            DBConexao.desconectar();
        }
    }
    
    public Usuario buscaUsuario(String email) {
        Connection connection = DBConexao.conectar();
        String sql = "SELECT * FROM usuario WHERE usuema=?";
        PreparedStatement pstmt;
        Usuario usuario = null;
        
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String usuema = rs.getString("usuema");
                String usunom = rs.getString("usunom");
                String ususen = rs.getString("ususen");
                long usuid = rs.getLong("usuid");
                usuario = new Usuario(usuema, ususen, usunom, usuid);
                break;
            }
            rs.close();
            
            return usuario;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return usuario;
        } finally {
            DBConexao.desconectar();
        }
    }
}
