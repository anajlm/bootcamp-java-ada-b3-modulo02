package br.com.ada.aula02.generics;

public class Main {

    public static void main(String[] args) {

        Caixa<String> box = new Caixa<>("abc");
        box.imprimir();

        Caixa<Integer> box2 = new Caixa<>(1);
        box2.imprimir();;
    }


}
