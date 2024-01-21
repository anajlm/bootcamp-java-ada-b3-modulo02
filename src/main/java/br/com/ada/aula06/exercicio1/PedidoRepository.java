package br.com.ada.aula06.exercicio1;

public class PedidoRepository {
    public void buscarPedido(long id) { /* Violação do SRP */ }
    public void salvar(Pedido pedido) { /* Violação do SRP */ }
    public void atualizar(long id, Pedido pedido) { /* Violação do SRP */ }
    public void deletar(long id) { /* Violação do SRP */ }
}
