package br.com.ada.aula03;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T extends Identified<U>, U> {

    private List<T> lista;

    public MinhaLista(){
        this.lista = new ArrayList<>();
    }
    public void adicionar(T elemento) {
        lista.add(elemento);
    }

    public T obter(int indice) {
        if(indice >= 0 && indice < lista.size()) {
            return lista.get(indice);
        }
        throw new IndexOutOfBoundsException("Posicao invalida");
    }

    public int indice(U identificador) {
       for(int i=0; i< lista.size(); i++){
           if(lista.get(i).getId().equals(identificador)){
               return i;
           }
       }
       return -1;
    }

    public boolean contem(T elemento) {
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).equals(elemento)){
                return true;
            }
        }
        return false;
    }


}
