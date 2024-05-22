public class PedidoItemUnitario extends PedidoItem {
  Integer quantidade;

  public PedidoItemUnitario(Integer quantidade, Produto produto) {
    super(produto);
    this.quantidade = quantidade;
  }

  @Override
  public Double precoTotal() {
    return this.quantidade * this.produto.getPreco();
  }

  public Integer getQuantidade() {
    return this.quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  
}
