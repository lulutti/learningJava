package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println("intA= " + intA + "\tintB= " + intB);
        intA = 2;
        System.out.println("intA= " + intA + "\tintB= " + intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA= " + objA + "\tobjB= " + objB);
        objA.setNum(3);
        System.out.println("objA= " + objA + "\tobjB= " + objB);
    }
}
