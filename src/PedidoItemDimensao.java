public class PedidoItemDimensao extends PedidoItem {
  Integer quantidade;
  Double altura;
  Double largura;

  public PedidoItemDimensao(Double altura, Double largura, Integer quantidade, Produto produto) {
    super(produto);
    this.altura = altura;
    this.largura = largura;
    this.quantidade = quantidade;
  }

  @Override
  Double precoTotal() {
    Double area = altura * largura;
    return area * this.quantidade * this.produto.getPreco();
  }

}
