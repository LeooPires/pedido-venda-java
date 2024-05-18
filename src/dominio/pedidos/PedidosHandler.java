package dominio.pedidos;

import java.util.List;

import dominio.Vendedor;

public class PedidosHandler {

    List<Vendedor> vendedores = List.of(new Vendedor("Vendedor 1"));

    public void CriarPedido(PedidoInput input) {

        Vendedor vendedor = this.vendedores.get(0);
        if(vendedor == null){
            // Erro
        }
        
        // Pedido pedido = new Pedido(input.vendedorId);

    }
}

class PedidoInput {
    Number vendedorId;
    Number clienteId;
    Number formaDepagamentoId;
    ItemDoPedidoInput[] itens;
}

class ItemDoPedidoInput {
    Number quantidade;
    Number pedidoId;
}
