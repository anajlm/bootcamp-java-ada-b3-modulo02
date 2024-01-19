package br.com.ada.aula05;

public class Main {

    public static void main(String[] args) {
        StackImpl<Integer> myStack = new StackImpl<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        while(!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }

    }

}
