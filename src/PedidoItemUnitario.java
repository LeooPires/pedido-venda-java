public class PedidoItemUnitario extends PedidoItem {
  Integer quantidade;

  public PedidoItemUnitario(Integer quantidade, Produto produto) {
    super(produto);
    this.quantidade = quantidade;
  }

  @Override
  Double precoTotal() {
    return this.quantidade * this.produto.getPreco();
  }
}
