package br.com.ada.aula06.exercicio2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TimeTransactionAuthenticator implements TransactionAuthenticator {

    @Override
    public void authenticate(Transaction transaction) {
        if (isAfterWorkingHours(transaction)) {
            throw new RuntimeException("invalid transaction: after working hours");
        }
    }

    private boolean isAfterWorkingHours(Transaction transaction){
        LocalDateTime limit = LocalDateTime.of(2024, 1, 21, 17, 0, 0);
        return transaction.getCreated().isAfter(limit);
    }

}
