import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Produto barraFerro = new Produto("Barra de ferro", 1.5);
        Produto telha = new Produto("Telha", 8.6);
        Produto tijolo = new Produto("Tijolo", 1.3);
        
        Item itemTijolo = new ItemUnitario(30, tijolo);
        Double precoTotalItemTijolo = itemTijolo.precoTotal();

        Item peso = new ItemPeso(1.2, barraFerro);
        Double precoPeso = peso.precoTotal();

        Item dimensao = new ItemDimensao(1.3, 2.1, 3, telha);
        Double precoDimensao = dimensao.precoTotal();

        List<Item> itens = new ArrayList<Item>();
        itens.add(itemTijolo);
        itens.add(peso);
        itens.add(dimensao);

        Cliente cliente = new Cliente("Gabriel", "123456789009", "123-45678");

        Vendedor vendedor = new Vendedor("Leonardo");

        FormaPagamento formaPagamento = new FormaPagamento("A vista");

        Pedido pedido = new Pedido(itens, cliente, vendedor, formaPagamento);

        Double precototalpedido = pedido.precoTotal();

        // pq
        // Item item = new Item()
    }
}
