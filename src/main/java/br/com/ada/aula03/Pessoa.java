package br.com.ada.aula03;

public record Pessoa(long id, String nome) implements Identified<Long> {
    @Override
    public Long getId() {
        return id;
    }
}
