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
  public Double precoTotal() {
    Double area = altura * largura;
    return area * this.quantidade * this.produto.getPreco();
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public Double getAltura() {
    return altura;
  }

  public void setAltura(Double altura) {
    this.altura = altura;
  }

  public Double getLargura() {
    return largura;
  }

  public void setLargura(Double largura) {
    this.largura = largura;
  }

}
