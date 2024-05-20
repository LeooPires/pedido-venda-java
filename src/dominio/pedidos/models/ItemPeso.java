package dominio.pedidos.models;

import dominio.Produto;

public class ItemPeso extends Item {
  Double peso;

  public ItemPeso(Double peso, Produto produto) {
    super(produto);
    this.peso = peso;
  }

  @Override
  Double preco() {
    return this.peso * produto.preco();
  }
}
