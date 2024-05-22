public class ItemUnitario extends Item {
  Integer quantidade;

  public ItemUnitario(Integer quantidade, Produto produto) {
    super(produto);
    this.quantidade = quantidade;
  }

  @Override
  Double precoTotal() {
    return this.quantidade * this.produto.getPreco();
  }
}
