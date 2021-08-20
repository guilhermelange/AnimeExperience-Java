package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class Usuario implements RowMapper<Usuario>{
    private long id;
    private String email;
    private String password;
    private String name;
    private boolean authenticates;

    public Usuario(String email, String senha, String nome) {
        this.email = email;
        this.password = senha;
        this.name = nome;
        this.authenticates = false;
    }
    
    public Usuario(String email, String senha, String nome, long id) {
        this.email = email;
        this.password = senha;
        this.name = nome;
        this.authenticates = false;
        this.id = id;
    }
    
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public boolean isAuthenticate() {
        return authenticates;
    }
    
    @Override
    public boolean equals(Object obj) {
        Usuario outroUsuario = (Usuario) obj;
        if (outroUsuario.getEmail().equals(this.getEmail()) &&
            outroUsuario.getPassword().equals(this.getPassword())) {
            return true;
        }
        return false;
    }

    public void setAuthenticates(boolean autenticado) {
        this.authenticates = autenticado;
    }

    @Override
    public String toString() {
        return String.format("Id: %d, Nome: %s, Email: %s", getId(), getName(), getEmail());
    }

    @Override
    public Usuario mapRow(ResultSet rs, int i) throws SQLException {
        Usuario usuario = new Usuario(rs.getString("usuema"),
                                      rs.getString("ususen"),
                                      rs.getString("usunom"),
                                      rs.getLong("usuid"));
        return usuario;
    }
}
