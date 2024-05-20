package test.java.com.pedidovendajava.dominio;

import java.util.List;
import java.util.Optional;

import main.java.com.pedidovendajava.dominio.Vendedor;
import main.java.com.pedidovendajava.dominio.pedidos.IPedidosRepository;
import main.java.com.pedidovendajava.dominio.pedidos.Pedido;

public class PedidosRepositoryMock implements IPedidosRepository {

  @Override
  public void inserir(Pedido pedido) {

  }

  @Override
  public Optional<Vendedor> buscarVendedor(Number id) {
    return Optional.of(new Vendedor(""));
  }

  @Override
  public List<Pedido> buscarTodos() {
    throw new UnsupportedOperationException("");
  }

}
