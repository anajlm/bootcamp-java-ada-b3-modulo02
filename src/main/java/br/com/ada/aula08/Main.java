package br.com.ada.aula08;

public class Main {
    public static void main(String[] args) {
        MultifunctionPrinter economic = new EconomicPrinter();
        MultifunctionPrinter advanced = new AdvancedPrinter();

        economic.print();
        economic.scan();
        economic.fax();
        economic.copy();

        advanced.print();
        advanced.scan();
        advanced.fax();
        advanced.copy();
    }
}
