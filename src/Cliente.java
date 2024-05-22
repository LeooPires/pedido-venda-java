public class Cliente {
     // Atributos
     private String nome;
     private String razaoSocial;
     private String cpf;
     private String cnpj;
     private ClienteTipo tipo;
     private String cep;
     private ClienteEndereco endereco;

     // Sobrecarga construtor específico para cliente pessoa fisica.
     public Cliente(String nome, String cpf, String rua, Integer numero, String bairro, String cep) {
          this.nome = nome;
          this.cpf = cpf;
          this.cep = cep;
          this.tipo = ClienteTipo.Fisica;

          // Composição de ClienteEndereco com Cliente
          this.endereco = new ClienteEndereco(rua, numero, bairro, cep);
     }

     // Sobrecarga construtor específico para cliente pessoa juridica.
     public Cliente(String nome, String razaoSocial, String cnpj, String rua, Integer numero, String bairro,
               String cep) {
          this.nome = nome;
          this.razaoSocial = razaoSocial;
          this.cnpj = cnpj;
          this.cep = cep;
          this.tipo = ClienteTipo.Juridica;

          // Composição de ClienteEndereco com Cliente
          this.endereco = new ClienteEndereco(rua, numero, bairro, cep);
     }

     // Gets e sets
     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getRazaoSocial() {
          return razaoSocial;
     }

     public void setRazaoSocial(String razaoSocial) {
          this.razaoSocial = razaoSocial;
     }

     public String getCpf() {
          return cpf;
     }

     public void setCpf(String cpf) {
          this.cpf = cpf;
     }

     public String getCnpj() {
          return cnpj;
     }

     public void setCnpj(String cnpj) {
          this.cnpj = cnpj;
     }

     public ClienteTipo getTipo() {
          return tipo;
     }

     public void setTipo(ClienteTipo tipo) {
          this.tipo = tipo;
     }

     public String getCep() {
          return cep;
     }

     public void setCep(String cep) {
          this.cep = cep;
     }

     public ClienteEndereco getEndereco() {
          return endereco;
     }

     public void setEndereco(ClienteEndereco endereco) {
          this.endereco = endereco;
     }
}
