package dominio.pedidos;

import dominio.Produto;

public class ItemDimensao extends Item {
  Integer quantidade;
  Double altura;
  Double largura;

  public ItemDimensao(Double altura, Double largura, Integer quantidade, Produto produto) {
    super(produto);
    this.altura = altura;
    this.largura = largura;
    this.quantidade = quantidade;
  }

  @Override
  Double preco() {
    Double area = altura * largura;
    return area * this.quantidade * this.produto.preco();
  }

}
