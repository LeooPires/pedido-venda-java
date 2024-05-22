import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
  // Atributos
  Date data;
  List<PedidoItem> itens = new ArrayList<PedidoItem>();
  Cliente cliente;
  Vendedor vendedor;
  FormaPagamento formaPagamento;

  // Construtor
  public Pedido(List<PedidoItem> itens, Cliente cliente, Vendedor vendedor, FormaPagamento formaPagamento) {
    this.itens = itens;
    this.cliente = cliente;
    this.vendedor = vendedor;
    this.formaPagamento = formaPagamento;
    this.data = new Date();
  }

  // Funções
  public Double precoTotal() {
    double total = 0;
    for (PedidoItem item : itens) {
      total += item.precoTotal();
    }
    return total;
  }

  public void InserirPedidoItem(PedidoItem item) {
    this.itens.add(item);
  }

  // Gets e sets
  public void RemovePedidoItem(PedidoItem item) {
    this.itens.remove(item);
  }

  public List<PedidoItem> getItens() {
    return itens;
  }

  public void setItens(List<PedidoItem> itens) {
    this.itens = itens;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Vendedor getVendedor() {
    return vendedor;
  }

  public void setVendedor(Vendedor vendedor) {
    this.vendedor = vendedor;
  }

  public FormaPagamento getFormaPagamento() {
    return formaPagamento;
  }

  public void setFormaPagamento(FormaPagamento formaPagamento) {
    this.formaPagamento = formaPagamento;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }
  
}
