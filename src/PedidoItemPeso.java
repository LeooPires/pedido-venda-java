public class PedidoItemPeso extends PedidoItem {
  Double peso;

  public PedidoItemPeso(Double peso, Produto produto) {
    super(produto);
    this.peso = peso;
  }

  @Override
  public Double precoTotal() {
    return this.peso * produto.getPreco();
  }

  public Double getPeso() {
    return peso;
  }

  public void setPeso(Double peso) {
    this.peso = peso;
  }

  
}
