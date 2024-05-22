public class PedidoItemPeso extends PedidoItem {
  Double peso;

  public PedidoItemPeso(Double peso, Produto produto) {
    super(produto);
    this.peso = peso;
  }

  @Override
  Double precoTotal() {
    return this.peso * produto.getPreco();
  }
}
