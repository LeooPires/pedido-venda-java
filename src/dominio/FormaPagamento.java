package dominio;

public class FormaPagamento{
    private Number id;
    private String descricao;

    public FormaPagamento(String descricao) {
        this.descricao = descricao; 
    }

    public Number id() {
        return this.id;
    }

    public String descricao() {
        return this.descricao;
    }
}
