package main.java.com.pedidovendajava.dominio.pedidos;

import java.util.List;
import java.util.Optional;

import main.java.com.pedidovendajava.dominio.Vendedor;

public interface IPedidosRepository {
  void inserir(Pedido pedido);

  List<Pedido> buscarTodos();

  Optional<Vendedor> buscarVendedor(Number id);
}
