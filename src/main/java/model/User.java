package model;

import exceptions.NotFoundException;
import daos.DataBase;

public class User implements Authenticate {
    private String email;
    private String password;
    private String name;
    private boolean authenticates;
    private long id;
    private static long currentId = 0;

    public User(String email, String senha, String nome) {
        this.email = email;
        this.password = senha;
        this.name = nome;
        this.id = ++currentId;
        this.authenticates = false;
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
        User outroUsuario = (User) obj;
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
    public void authenticate() throws NotFoundException {
        for (User user : DataBase.getUsuarios()) {
            if (user.equals(this)) {
                user.setAuthenticates(true);
                this.setAuthenticates(true);
            }
        }
        
        if (!isAuthenticate()) {
            throw new NotFoundException("Algo está incorreto, tente novamente!");
        }
    }

    @Override
    public String toString() {
        return String.format("Id: %d, Nome: %s, Email: %s", getId(), getName(), getEmail());
    }
}
