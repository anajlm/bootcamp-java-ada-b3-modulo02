package br.com.ada.aula02.exercicio1;

public class Bicicleta implements Veiculo {

    private int velocidade = 0;

    @Override
    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
        System.out.println("Acelerar bicicleta - velocidade: " + this.velocidade);
    }

    @Override
    public void frear() {
        this.velocidade = 0;
        System.out.println("Frear bicicleta");
    }
}
