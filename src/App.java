import dominio.pedidos.PedidoInput;
import dominio.pedidos.PedidosHandler;
import infraestrutura.pedidos.PedidosRepository;

public class App {
    public static void main(String[] args) throws Exception {

        PedidosRepository pedidosRepository = new PedidosRepository();
        PedidoInput input = new PedidoInput();
        PedidosHandler pedidosHandler = new PedidosHandler(pedidosRepository);
        pedidosHandler.Criar(input);
    }
}
