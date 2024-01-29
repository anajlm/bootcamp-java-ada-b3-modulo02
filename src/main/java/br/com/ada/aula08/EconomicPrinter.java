package br.com.ada.aula08;

public class EconomicPrinter implements MultifunctionPrinter {
    @Override
    public void print() {
        System.out.println("Print as Economic Printer");
    }

    @Override
    public void scan() {
        System.out.println("Scan as Economic Printer");
    }

    @Override
    public void fax() {
        System.out.println("Fax as Economic Printer");
    }

    @Override
    public void copy() {
        System.out.println("Copy as Economic Printer");
    }
}
