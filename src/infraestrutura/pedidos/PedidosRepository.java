package infraestrutura.pedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import dominio.Produto;
import dominio.Vendedor;
import dominio.pedidos.IPedidosRepository;
import dominio.pedidos.Item;
import dominio.pedidos.ItemDimensao;
import dominio.pedidos.ItemPeso;
import dominio.pedidos.ItemUnitario;
import dominio.pedidos.Pedido;

public class PedidosRepository implements IPedidosRepository {

  @Override
  public void inserir(Pedido pedido) {

  }

  @Override
  public Optional<Vendedor> buscarVendedor(Number id) {
    return Optional.of(new Vendedor(""));
  }

  @Override
  public List<Pedido> buscarTodos() {

    Produto barraFerro = new Produto("Barra de ferro", 1.5);
    Produto telha = new Produto("Telha", 8.6);
    Produto tijolo = new Produto("Tijolo", 1.3);

    ItemUnitario unitario = new ItemUnitario(30, tijolo);
    ItemPeso peso = new ItemPeso(1.2, barraFerro);
    ItemDimensao dimensao = new ItemDimensao(1.3, 2.1, 3, telha);

    List<Item> itens = new ArrayList<Item>();
    itens.add(unitario);
    itens.add(peso);
    itens.add(dimensao);

    Pedido pedido = new Pedido(itens, 1, 1, 1);
    Double precoTotal = pedido.precoTotal();

    List<Pedido> pedidos = new ArrayList<Pedido>();
    pedidos.add(pedido);

    return pedidos;
  }

}
