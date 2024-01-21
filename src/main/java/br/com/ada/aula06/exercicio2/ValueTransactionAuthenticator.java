package br.com.ada.aula06.exercicio2;

import java.math.BigDecimal;

public class ValueTransactionAuthenticator implements TransactionAuthenticator {
    public static final BigDecimal MAX_DAILY_LIMIT = new BigDecimal("1000");

    @Override
    public void authenticate(Transaction transaction) {
        if (transaction.getAmount().compareTo(MAX_DAILY_LIMIT) > 0) {
            throw new RuntimeException("invalid transaction: max limit");
        }
    }

}
