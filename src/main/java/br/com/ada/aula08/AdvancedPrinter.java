package br.com.ada.aula08;

public class AdvancedPrinter implements MultifunctionPrinter {
    @Override
    public void print() {
        System.out.println("Print as Advanced Printer");
    }

    @Override
    public void scan() {
        System.out.println("Scan as Advanced Printer");
    }

    @Override
    public void fax() {
        System.out.println("Fax as Advanced Printer");
    }

    @Override
    public void copy() {
        System.out.println("Copy as Advanced Printer");
    }
}
