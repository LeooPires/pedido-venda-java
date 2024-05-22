public class ItemPeso extends Item {
  Double peso;

  public ItemPeso(Double peso, Produto produto) {
    super(produto);
    this.peso = peso;
  }

  @Override
  Double precoTotal() {
    return this.peso * produto.getPreco();
  }
}
