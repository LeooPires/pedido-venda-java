import java.util.InputMismatchException;
import java.util.Scanner;

import dominio.pedidos.PedidoInput;
import dominio.pedidos.PedidosHandler;
import infraestrutura.pedidos.PedidosRepository;

public class App {
    public static void main(String[] args) throws Exception {

        // PedidosRepository pedidosRepository = new PedidosRepository();
        // PedidoInput input = new PedidoInput();
        // PedidosHandler pedidosHandler = new PedidosHandler(pedidosRepository);
        // pedidosHandler.Criar(input);

        App app = new App();
        app.displayMenu();
    }

    public void displayMenu() {
        int option = 0;
        String etc = "";
        while (true) {
            System.out.printf("\n");
            System.out.printf("\n");
            System.out.printf("\n");
            System.out.printf("\n");
            System.out.printf("\n");
            System.out.printf("\n");
            System.out.printf("\n");
            System.out.printf("*************************************************************\n", etc);
            System.out.printf("*                                                           *\n", etc, etc);
            System.out.printf("*  Sistema Pedidos de Vendas                         1.0.0  *\n", etc);
            System.out.printf("*                                                           *\n", etc, etc);
            System.out.printf("*************************************************************\n", etc);
            System.out.printf("*  1. Incluir Pedido                                        *\n", etc, etc);
            System.out.printf("*  7. Sair                                                  *\n", etc, etc);
            System.out.printf("*  Escolha opção 1-7 : ", etc);
            option = this.getIntValue("!! Escolha opção ", 1, 7, 1);
            switch (option) {
                case 1:
                    this.incluirPedido();
                    break;

                default:
                    break;
            }
        }
    }

    public void incluirPedido() {
        String etc = "";
        System.out.printf("*************************************************************\n", etc);
        System.out.printf("*                                                           *\n", etc, etc);
        System.out.printf("*  Incluir Pedido                                           *\n", etc, etc);
        System.out.printf("*                                                           *\n", etc, etc);
        System.out.printf("*************************************************************\n", etc);
        this.waitForKeyPress();
    }

    private void waitForKeyPress() {
        String etc = "";
        System.out.printf("Pressione Enter para continuar :", etc, etc, etc);
        s.nextLine();
    }

    private int getIntValue(String error, int low, int high, int fs) {
        int option;
        while (true) {
            String etc = "";
            try {
                String temp = "";
                while (temp.equals("")) {
                    temp = s.nextLine();
                    if (temp.equals("")) {
                        String n = "%" + fs + "s*%6s%s %d to %d :";
                        System.out.printf(n, etc, etc, error, low, high);
                    }
                }

                s1 = new Scanner(temp);
                option = Integer.parseInt(s1.next());
                s1 = null;
                if (option < low || option > high) {
                    String n = "%" + fs + "s*%6s%s no intervalo: %d a %d: ";
                    System.out.printf(n, etc, etc, error, low, high);
                    continue;
                }
                return option;

            } catch (InputMismatchException e) {
                String n = "%" + fs + "s*%6s%s em formato numérico";
                System.out.printf(n, etc, etc, error);
                option = 0;
            } catch (NumberFormatException e) {
                String n = "%" + fs + "s*%6s%s em formato inteiro/número: ";
                System.out.printf(n, etc, etc, error);
                option = 0;
            }
        }

    }

    public static Scanner s = new Scanner(System.in);
    public static Scanner s1;
}
