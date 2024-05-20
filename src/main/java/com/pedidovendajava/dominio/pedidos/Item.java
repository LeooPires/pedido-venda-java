package main.java.com.pedidovendajava.dominio.pedidos;

import main.java.com.pedidovendajava.dominio.Produto;

public abstract class Item {
  public Produto produto;

  public Item(Produto produto) {
    this.produto = produto;
  }

  abstract Double preco();
}
