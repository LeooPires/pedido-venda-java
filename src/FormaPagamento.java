

public class FormaPagamento {
    private String descricao;

    public FormaPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String descricao() {
        return this.descricao;
    }

    public void descricao(String value)  {
        this.descricao = value;
    }
}
