package br.com.ada.aula02.exercicio2;

public class Main {

    public static void main(String[] args) {
        Shape circulo = new Circulo(3.0);
        Shape retangulo = new Retangulo(2.0, 4.0);
        Shape triangulo = new Triangulo(2.0, 1.0);

        System.out.println("Area do circulo: " + circulo.calcularÁrea());
        System.out.println("Area do retangulo: " + retangulo.calcularÁrea());
        System.out.println("Area do triangulo: " + triangulo.calcularÁrea());

    }




}
