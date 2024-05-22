public class ClienteEndereco {
  // Atributos
  String rua;
  Integer numero;
  String bairro;
  String cep;

  // Construtor
  public ClienteEndereco(String rua, Integer numero, String bairro, String cep) {
    this.rua = rua;
    this.numero = numero;
    this.bairro = bairro;
    this.cep = cep;
  }

  // gets e sets
  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }
}
