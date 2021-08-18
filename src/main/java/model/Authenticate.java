package model;

import exceptions.NotFoundException;

public interface Authenticate {
    public void authenticate() throws NotFoundException;
}
