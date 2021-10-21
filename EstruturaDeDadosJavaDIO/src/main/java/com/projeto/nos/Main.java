package com.projeto.nos;

public class Main {
    public static void main(String[] args) {

        No<String> noUm = new No<>("agualusa");

        No<String> noDois = new No<>("alquimista");

        noUm.setProximoNo(noDois);

        No<String> noTres = new No<>("dom casmurro");

        noDois.setProximoNo(noTres);

        No<String> noQuatro = new No<>("harry potter");

        noTres.setProximoNo(noQuatro);

        //noUm => noDois => noTres => noQuatro => null

        System.out.println(noTres.getProximoNo());
    }
}
