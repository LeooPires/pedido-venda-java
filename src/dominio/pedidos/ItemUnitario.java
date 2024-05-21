package dominio.pedidos;

import dominio.Produto;

public class ItemUnitario extends Item {
  Integer quantidade;

  public ItemUnitario(Integer quantidade, Produto produto) {
    super(produto);
    this.quantidade = quantidade;
  }

  @Override
  Double preco() {
    return this.quantidade * this.produto.preco();
  }
}
