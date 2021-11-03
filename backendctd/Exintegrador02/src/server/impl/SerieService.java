package server.impl;

import server.Iserie;

public class SerieService extends Iserie {
    @Override
    public String getSerie(String nome) {
        String link = "www." + nome + ".com";
        System.out.println(link);
        return link;
    }
}
