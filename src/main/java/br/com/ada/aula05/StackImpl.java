package br.com.ada.aula05;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements Stack<T>{

    private final List<T> stack;

    public StackImpl() {
        this.stack = new ArrayList<>();
    }

    @Override
    public void push(T elemento) {
        stack.add(elemento);
    }

    @Override
    public T pop() {
        return stack.remove(stack.size()-1);
    }

    @Override
    public T peek() {
        return stack.get(stack.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
