package dominio.pedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import dominio.Vendedor;
import dominio.comum.Erro;

public class PedidosHandler {
    private IPedidosRepository pedidosRepository;

    public PedidosHandler(IPedidosRepository pedidosRepository) {
        this.pedidosRepository = pedidosRepository;
    }

    public Optional<Erro> Criar(PedidoInput input) {
        Optional<Vendedor> vendedor = this.pedidosRepository.BuscarVendedor(input.vendedorId);
        if (vendedor.isEmpty())
            return Optional.of(new Erro("vendedor_nao_encontrado", "Vendedor não encontrado."));

        List<ItemDoPedido> itens = new ArrayList<ItemDoPedido>();
        for (PedidoInput.ItemDoPedidoInput itemInput : input.itens) {

        }

        Pedido pedido = new Pedido(itens, input.clienteId, input.vendedorId, input.formaDepagamentoId);
        pedidosRepository.Criar(pedido);

        return Optional.empty();
    }
}
