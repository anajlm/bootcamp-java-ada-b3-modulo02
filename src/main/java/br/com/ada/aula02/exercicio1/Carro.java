package br.com.ada.aula02.exercicio1;

public class Carro implements VeiculoMotorizado {

    private int velocidade = 0;

    @Override
    public void ligar() {
        System.out.println("Ligar carro");
    }

    @Override
    public void desligar() {
        System.out.println("Desligar carro");
    }

    @Override
    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
        System.out.println("Acelerar carro - velocidade: " + this.velocidade);
    }

    @Override
    public void frear() {
        this.velocidade = 0;
        System.out.println("Frear carro");
    }
}
