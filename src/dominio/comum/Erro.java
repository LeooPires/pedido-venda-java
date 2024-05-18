package dominio.comum;

public class Erro {
  String codigo;
  String mensagem;

  public Erro(String codigo, String mensagem) {
    this.codigo = codigo;
    this.mensagem = mensagem;
  }
}
