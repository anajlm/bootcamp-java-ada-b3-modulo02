package br.com.ada.aula02.exercicio1;

public class Main {

    public static void main(String[] args) {

        VeiculoMotorizado carro = new Carro();
        VeiculoMotorizado moto = new Moto();
        Veiculo bicicleta = new Bicicleta();

        carro.ligar();
        moto.ligar();

        carro.acelerar(10);
        moto.acelerar(20);
        bicicleta.acelerar(30);

        carro.frear();
        moto.frear();
        bicicleta.frear();

        carro.desligar();
        moto.desligar();

    }
}
