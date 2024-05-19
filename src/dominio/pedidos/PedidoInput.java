package dominio.pedidos;

import java.util.List;

public class PedidoInput {
  Number vendedorId;
  Number clienteId;
  Number formaDepagamentoId;
  List<ItemDoPedidoInput> itens;

  class ItemDoPedidoInput {
    Number quantidade;
    Number pedidoId;
  }
}
