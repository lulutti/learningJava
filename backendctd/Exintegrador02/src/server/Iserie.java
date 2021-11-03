package server;

import server.impl.SerieException;

public abstract class Iserie {
    public abstract String getSerie(String nome) throws SerieException;
}
