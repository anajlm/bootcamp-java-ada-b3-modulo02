package br.com.ada.aula02.exercicio2;

public class Retangulo implements Shape {

    private Double altura;
    private Double largura;

    public Retangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularÁrea() {
        return this.altura * this.largura;
    }
}
