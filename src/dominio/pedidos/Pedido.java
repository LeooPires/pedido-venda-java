package dominio.pedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
  Number id;
  List<Item> itens = new ArrayList<Item>();
  Number clienteId;
  Number vendedorId;
  Number formaPagamentoId;

  public Pedido(List<Item> itens, Number clienteId, Number vendedorId, Number formaPagamentoId) {
    this.itens = itens;
    this.clienteId = clienteId;
    this.vendedorId = vendedorId;
    this.formaPagamentoId = formaPagamentoId;
  }

  public Number id() {
    return this.id;
  }

  public Double precoTotal() {
    double total = 0;
    for (Item item : itens) {
      total += item.preco();
    }
    return total;
  }
}
