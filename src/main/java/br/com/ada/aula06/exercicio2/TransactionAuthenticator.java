package br.com.ada.aula06.exercicio2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface TransactionAuthenticator {

    public void authenticate(Transaction transaction);

}
