package dominio;

public class Cliente {

     private String nome;
     private String cpf;
     private String cep;
  
    public Cliente(String nome, String cpf, String cep) {
     this.nome = nome;
     this.cpf = cpf;
     this.cep = cep;
    }

     public String nome() {
          return this.nome;
     }

     public String cpf() {
          return this.cpf;
     }

     public String cep() {
          return this.cep;    
    }


}
