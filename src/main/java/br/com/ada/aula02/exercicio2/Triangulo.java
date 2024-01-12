package br.com.ada.aula02.exercicio2;

public class Triangulo implements Shape {

    private Double altura;
    private Double base;

    public Triangulo(Double altura, Double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularÁrea() {
        return (this.base * this.altura)/2;
    }
}
