package dominio.pedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
  Number id;
  List<ItemDoPedido> itens = new ArrayList<ItemDoPedido>();
  Number clienteId;
  Number vendedorId;
  Number formaPagamentoId;

  public Pedido(List<ItemDoPedido> itens, Number clienteId, Number vendedorId, Number formaPagamentoId) {
    this.itens = itens;
    this.clienteId = clienteId;
    this.vendedorId = vendedorId;
    this.formaPagamentoId = formaPagamentoId;
  }

  public Number id() {
    return this.id;
  }
}
