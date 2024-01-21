package br.com.ada.aula06.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private List<TransactionAuthenticator> authenticators = new ArrayList<>();

    public void executeTrade(Transaction transaction){

        for(int i=0; i<authenticators.size(); i++) {
            try {
                authenticators.get(i).authenticate(transaction);
            } catch (RuntimeException exception){
                System.out.println(exception.getMessage());
                return;
            }
        }
        transact(transaction);
    }

    private void transact(Transaction transaction) {
        System.out.println("Transaction succeed: " + transaction);
    }

    public void addAuthenticator(TransactionAuthenticator authenticator){
        this.authenticators.add(authenticator);
    }



}
