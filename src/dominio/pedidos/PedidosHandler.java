package dominio.pedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import dominio.Produto;
import dominio.Vendedor;
import dominio.comum.Erro;
import dominio.pedidos.models.Item;
import dominio.pedidos.models.ItemDimensao;
import dominio.pedidos.models.ItemPeso;
import dominio.pedidos.models.ItemUnitario;
import dominio.pedidos.models.Pedido;

public class PedidosHandler {
    private IPedidosRepository pedidosRepository;

    public PedidosHandler(IPedidosRepository pedidosRepository) {
        this.pedidosRepository = pedidosRepository;
    }

    public Optional<Erro> Criar(PedidoInput input) {
        Optional<Vendedor> vendedor = this.pedidosRepository.BuscarVendedor(input.vendedorId);
        if (vendedor.isEmpty())
            return Optional.of(new Erro("vendedor_nao_encontrado", "Vendedor não encontrado."));

        List<Item> itens = new ArrayList<Item>();
        for (PedidoInput.ItemDoPedidoInput itemInput : input.itens) {

        }

        Produto barraFerro = new Produto("Barra de ferro", 1.5);
        Produto telha = new Produto("Telha", 8.6);
        Produto tijolo = new Produto("Tijolo", 1.3);

        ItemUnitario unitario = new ItemUnitario(30, tijolo);
        ItemPeso peso = new ItemPeso(1.2, barraFerro);
        ItemDimensao dimensao = new ItemDimensao(1.3, 2.1, 3, telha);

        itens.add(unitario);
        itens.add(peso);
        itens.add(dimensao);

        Pedido pedido = new Pedido(itens, input.clienteId, input.vendedorId, input.formaDepagamentoId);

        Double precoTotal = pedido.precoTotal();

        pedidosRepository.Criar(pedido);

        return Optional.empty();
    }
}
