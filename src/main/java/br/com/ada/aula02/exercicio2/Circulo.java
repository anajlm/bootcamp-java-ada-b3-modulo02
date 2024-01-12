package br.com.ada.aula02.exercicio2;

public class Circulo implements Shape {

    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularÁrea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
