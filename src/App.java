import dominio.FormaPagamento;

public class App {
    public static void main(String[] args) throws Exception {
        FormaPagamento formaPagamento = new FormaPagamento("Debito");
        System.out.println(formaPagamento.descricao());
         
        System.out.println("Hello, World!");
    }
}
