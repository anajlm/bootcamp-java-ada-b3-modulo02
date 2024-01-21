package br.com.ada.aula06.exercicio2;

import java.math.BigDecimal;

public class TransactionTest {
    public static void main(String[] args) {
        TransactionAuthenticator timeAuthenticator = new TimeTransactionAuthenticator();
        TransactionAuthenticator valueAuthenticator = new ValueTransactionAuthenticator();

        TransactionManager manager = new TransactionManager();
        manager.addAuthenticator(timeAuthenticator);
        manager.addAuthenticator(valueAuthenticator);

        var t1 = new Transaction(new BigDecimal("1000"), "ADA");

        manager.executeTrade(t1);

    }
}
