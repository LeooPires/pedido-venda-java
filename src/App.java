import dominio.FormaPagamento;        
import dominio.Cliente;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente  = new Cliente("Leonardo", "46810338802", "13835000");
        System.out.println(cliente.nome());
        System.out.println(cliente.cpf());
        System.out.println(cliente.cep());
       
        FormaPagamento formaPagamento = new FormaPagamento("Debito");

        System.out.println("Hello, World!");
    }    
}
