package dominio.pedidos;

public class PedidoInput {
  Number vendedorId;
  Number clienteId;
  Number formaDepagamentoId;
  ItemDoPedidoInput[] itens;

  class ItemDoPedidoInput {
    Number quantidade;
    Number pedidoId;
  }
}
