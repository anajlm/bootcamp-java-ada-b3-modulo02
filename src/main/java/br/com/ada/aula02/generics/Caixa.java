package br.com.ada.aula02.generics;

public class Caixa<T> {

    /**
     * E - Element (usado exclusivamente pelo Java Collections Framework)
     * K - Key
     * N - Number
     * T - Type
     * V - Value
     * S,U,V etc. - 2nd, 3rd, 4th types
     */

    private T obj;

    public Caixa(T obj) {
        this.obj = obj;
    }
    public T getObj() {
        return obj;
    }

    public void imprimir(){
        System.out.println(this.obj);
    }
}
