package dominio.pedidos;

import dominio.Produto;

public abstract class Item {
  public Produto produto;

  public Item(Produto produto) {
    this.produto = produto;
  }

  abstract Double preco();
}
