package br.com.ada.aula02.exercicio1;

public class Moto implements VeiculoMotorizado {

    private int velocidade = 0;

    @Override
    public void ligar() {
        System.out.println("Ligar moto");
    }

    @Override
    public void desligar() {
        System.out.println("Desligar moto");
    }

    @Override
    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
        System.out.println("Acelerar moto - velocidade: " + this.velocidade);
    }

    @Override
    public void frear() {
        this.velocidade = 0;
        System.out.println("Frear moto");
    }
}
