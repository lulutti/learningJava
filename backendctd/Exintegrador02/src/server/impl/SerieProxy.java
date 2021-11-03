package server.impl;

import server.Iserie;

public class SerieProxy extends Iserie {
    private SerieService serieService = new SerieService();
    private Integer qtdeViews = 0;

    @Override
    public String getSerie(String nome) throws SerieException{
        qtdeViews++;
        if(qtdeViews <= 5){
            return serieService.getSerie(nome);
        } else {
            throw new SerieException("Quantidade de reproduções acima do permitido");
        }
    }
}
