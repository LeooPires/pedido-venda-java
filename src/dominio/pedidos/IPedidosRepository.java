package dominio.pedidos;

import java.util.List;
import java.util.Optional;

import dominio.Vendedor;

public interface IPedidosRepository {
  void inserir(Pedido pedido);

  List<Pedido> buscarTodos();

  Optional<Vendedor> buscarVendedor(Number id);
}
