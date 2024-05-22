

import java.util.ArrayList;
import java.util.List;

public class Pedido {
  List<Item> itens = new ArrayList<Item>();
  Cliente cliente;
  Vendedor vendedor;
  FormaPagamento formaPagamento;

  public Pedido(List<Item> itens, Cliente cliente, Vendedor vendedor, FormaPagamento formaPagamento) {
    this.itens = itens;
    this.cliente = cliente;
    this.vendedor = vendedor;
    this.formaPagamento = formaPagamento;
  }

  public Double precoTotal() {
    double total = 0;
    for (Item item : itens) {
      total += item.precoTotal();
    }
    return total;
  }
}
