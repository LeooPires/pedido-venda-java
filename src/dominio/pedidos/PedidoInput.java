package dominio.pedidos;

import java.util.ArrayList;
import java.util.List;

public class PedidoInput {
  Number vendedorId;
  Number clienteId;
  Number formaDepagamentoId;
  List<ItemDoPedidoInput> itens = new ArrayList<ItemDoPedidoInput>();

  class ItemDoPedidoInput {
    Number quantidade;
    Number pedidoId;
  }
}
