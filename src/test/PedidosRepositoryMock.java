package test;

import java.util.Optional;

import dominio.Vendedor;
import dominio.pedidos.IPedidosRepository;
import dominio.pedidos.models.Pedido;

public class PedidosRepositoryMock implements IPedidosRepository {

  @Override
  public void Criar(Pedido pedido) {

  }

  @Override
  public Optional<Vendedor> BuscarVendedor(Number id) {
    return Optional.of(new Vendedor(""));
  }

}
