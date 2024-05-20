package dominio.pedidos;

import java.util.Optional;

import dominio.Vendedor;
import dominio.pedidos.models.Pedido;

public interface IPedidosRepository {
  void Criar(Pedido pedido);

  Optional<Vendedor> BuscarVendedor(Number id);
}
