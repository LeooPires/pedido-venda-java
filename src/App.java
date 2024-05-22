import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class App {

    // Instância lista de pedidos
    List<Pedido> pedidos = new ArrayList<Pedido>();
    List<Produto> produtos = new ArrayList<Produto>();
    List<Vendedor> vendedores = new ArrayList<Vendedor>();
    List<Cliente> clientes = new ArrayList<Cliente>();
    List<FormaPagamento> formasPagamento = new ArrayList<FormaPagamento>();

    // Instância produtos
    Produto cimento = new Produto("Cimento", 4.97);
    Produto telha = new Produto("Telha de brasilit", 18.00);
    Produto tijolo = new Produto("Tijolo baiano", 0.90);

    // Instância clientes
    Cliente clienteGabriel = new Cliente("Gabriel", "123456789009", "Rua Paulo Evaristo", 123, "Bairro Palmeiras", "12345-678");
    Cliente clienteEmpresaBrasil = new Cliente("Empresa Brasil", "Empresa Brasil S.A", "12.345.678/9123-45", "Rua Paulo Evaristo", 123, "Bairro Palmeiras", "12345-678");

    // Instância vendedores
    Vendedor vendedorLeonardo = new Vendedor("Leonardo");
    Vendedor vendedorPedro = new Vendedor("Pedro");

    // Instância formas de pagamento
    FormaPagamento formaPagamentoAvista = new FormaPagamento("A vista");
    FormaPagamento formaPagamentoBoleto = new FormaPagamento("Boleto");

    public static void main(String[] args) throws Exception {
        // Instância a apliação
        App app = new App();

        // Chama as operações
        app.imprimirProdutos();
        app.imprimirVendedores();
        app.imprimirClientes();
        app.imprimirFormaPagamento();
        app.criarPedidoClienteGabriel();
        app.criarPedidoClienteEmpresaBrasil();
        app.imprimirPedidos();
    }

    // Função da aplicação de criar pedido para cliente Gabriel
    public void criarPedidoClienteGabriel(){
        // Instância item pedidos
        PedidoItem itemTijolo = new PedidoItemUnitario(3000, tijolo);
        PedidoItem itemCimentoPeso = new PedidoItemPeso(260.50, cimento);
        PedidoItem itemDimensao = new PedidoItemDimensao(2.10, 1.60, 300, telha);

        // Adicione item pedidos em uma lista
        List<PedidoItem> itens = new ArrayList<PedidoItem>();
        itens.add(itemTijolo);
        itens.add(itemCimentoPeso);
        itens.add(itemDimensao);

        // Instância pedido
        Pedido pedido = new Pedido(itens, clienteGabriel, vendedorLeonardo, formaPagamentoAvista);
        this.pedidos.add(pedido);
    }

    // Função da aplicação de criar pedido para cliente Empresa Brasil
    public void criarPedidoClienteEmpresaBrasil(){
        // Instância item pedidos
        PedidoItem itemTijolo = new PedidoItemUnitario(1200, tijolo);
        PedidoItem itemCimentoPeso = new PedidoItemPeso(160.50, cimento);
        PedidoItem itemDimensao = new PedidoItemDimensao(2.10, 1.60, 300, telha);

        // Adicione item pedidos em uma lista
        List<PedidoItem> itens = new ArrayList<PedidoItem>();
        itens.add(itemTijolo);
        itens.add(itemCimentoPeso);
        itens.add(itemDimensao);

        // Instância pedido
        Pedido pedido = new Pedido(itens, clienteEmpresaBrasil, vendedorPedro, formaPagamentoBoleto);
        this.pedidos.add(pedido);
    }

    // Função da aplicação para imprimir os produtos
    public void imprimirProdutos() {
        this.produtos.add(cimento);
        this.produtos.add(telha);
        this.produtos.add(tijolo);
        System.out.printf("*************************************************************\n");
        System.out.printf("*  Produtos                                                 *\n");
        System.out.printf("*************************************************************\n");
        for (Produto produto : this.produtos) {
            System.out.println("Produto: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("");
        }
        System.out.println("\n");
        System.out.println("\n");
    }

    // Função da aplicação para imprimir os vendedores
    public void imprimirVendedores() {
        vendedores.add(vendedorLeonardo);
        vendedores.add(vendedorPedro);
        System.out.printf("*************************************************************\n");
        System.out.printf("*  Vendedores                                               *\n");
        System.out.printf("*************************************************************\n");
        for (Vendedor vendedor : vendedores) {
            System.out.println("Vendedor: " + vendedor.getNome());
        }
        System.out.println("\n");
        System.out.println("\n");
    }
    
    // Função da aplicação para imprimir os clientes
    public void imprimirClientes() {
        clientes.add(clienteGabriel);
        clientes.add(clienteEmpresaBrasil);
        System.out.printf("*************************************************************\n");
        System.out.printf("*  Clientes                                                 *\n");
        System.out.printf("*************************************************************\n");
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNome());
            if (cliente.getTipo() == ClienteTipo.Fisica) {
                System.out.println("  CPF: " + cliente.getCpf());
            } else if (cliente.getTipo() == ClienteTipo.Juridica) {
                System.out.println("  Razão Social: " + cliente.getRazaoSocial());
                System.out.println("  CNPJ: " + cliente.getCnpj());
            }
            System.out.println("  Endereço: " + cliente.getEndereco().getRua());
            System.out.println("  Numero: " + cliente.getEndereco().getNumero());
            System.out.println("  Bairro: " + cliente.getEndereco().getBairro());
            System.out.println("  CEP: " + cliente.getCep());
        }
        System.out.println("\n");
        System.out.println("\n");
    }
    
    // Função da aplicação para imprimir as formas de pagamento
    public void imprimirFormaPagamento() {
        formasPagamento.add(formaPagamentoAvista);
        formasPagamento.add(formaPagamentoBoleto);
        System.out.printf("*************************************************************\n");
        System.out.printf("*  Formas de Pagamento                                      *\n");
        System.out.printf("*************************************************************\n");
        for (FormaPagamento formaPagamento : formasPagamento) {
            System.out.println("Forma de Pagamento: " + formaPagamento.getDescricao());
        }
        System.out.println("\n");
        System.out.println("\n");
    }

    // Função da aplicação para imprimir os pedidos
    public void imprimirPedidos() {
        System.out.printf("*************************************************************\n");
        System.out.printf("*  Pedidos                                                  *\n");
        System.out.printf("*************************************************************\n");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Integer i = 1;
        for (Pedido pedido : this.pedidos) {
            String dataFormatada = dateFormat.format(pedido.getData());

            System.out.println("Pedido n°: " + i);
            System.out.println("Data do Pedido: " + dataFormatada);
            if (pedido.getCliente().getTipo() == ClienteTipo.Fisica) {
                System.out.println("Cliente Pessoa Fisica: ");
                System.out.println("  Nome: " + pedido.getCliente().getNome());
                System.out.println("  CPF: " + pedido.getCliente().getCpf());
            } else if (pedido.getCliente().getTipo() == ClienteTipo.Juridica) {
                System.out.println("Cliente Pessoa Jurídica: ");
                System.out.println("  Nome: " + pedido.getCliente().getNome());
                System.out.println("  Razão Social: " + pedido.getCliente().getRazaoSocial());
                System.out.println("  CNPJ: " + pedido.getCliente().getCnpj());
            }
            System.out.println("Vendedor: " + pedido.getVendedor().getNome());
            System.out.println("Forma de Pagamento: " + pedido.getFormaPagamento().getDescricao());
            System.out.println("Itens:");
            for (PedidoItem item : pedido.getItens()) {
                System.out.println("- Produto: " + item.getProduto().getDescricao());
                if (item instanceof PedidoItemDimensao) {
                    PedidoItemDimensao itemDimensao = (PedidoItemDimensao) item;
                    System.out.println("  Altura: " + itemDimensao.getAltura() + " m");
                    System.out.println("  Largura: " + itemDimensao.getLargura() + " m");
                    System.out.println("  Quantidade: " + itemDimensao.getQuantidade());
                    System.out.println("  Preço Total: R$" + String.format("%.2f", itemDimensao.precoTotal()));
                } else if (item instanceof PedidoItemPeso) {
                    PedidoItemPeso itemPeso = (PedidoItemPeso) item;
                    System.out.println("  Peso: " + itemPeso.getPeso() + " kg");
                    System.out.println("  Preço Total: R$" + String.format("%.2f", itemPeso.precoTotal()));
                } else if (item instanceof PedidoItemUnitario) {
                    PedidoItemUnitario itemUnitario = (PedidoItemUnitario) item;
                    System.out.println("  Quantidade: " + itemUnitario.getQuantidade());
                    System.out.println("  Preço Total: R$" + String.format("%.2f", itemUnitario.precoTotal()));
                }
            }
            System.out.println("Preço Total do Pedido: R$" + String.format("%.2f", pedido.precoTotal()));
            System.out.println("");
            i++;
        }
    }
}
