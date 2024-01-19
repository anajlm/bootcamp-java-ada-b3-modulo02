package br.com.ada.aula05;

public interface Stack<T> {
    void push(T elemento);
    T pop();
    T peek();
    boolean isEmpty();
}
