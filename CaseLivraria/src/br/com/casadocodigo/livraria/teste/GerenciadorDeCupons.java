package br.com.casadocodigo.livraria.teste;

import java.util.*;

public class GerenciadorDeCupons {

    private Map<String, Double> cupons;

    public GerenciadorDeCupons() {
        this.cupons = new HashMap<>();

        cupons.put("CUPOM10", 10.00);
        cupons.put("CUPOM20", 20.00);
        cupons.put("CUPOM30", 30.00);
        cupons.put("CUPOM40", 40.00);
        cupons.put("CUPOM50", 50.00);
    }

    public Double validaCupom(String cupom) {
        return this.cupons.get(cupom);
    }
}
