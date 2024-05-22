// Classe abstrata
public abstract class PedidoItem {
  // Atributos
  public Produto produto;

  // Construtor
  public PedidoItem(Produto produto) {
    this.produto = produto;
  }

  // Método abstrato
  public abstract Double precoTotal();

  // Gets e sets
  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

}
