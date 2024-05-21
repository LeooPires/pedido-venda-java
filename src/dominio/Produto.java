package dominio;

public class Produto {
    private String descricao;
    private Double preco;

    public Produto(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String descricao() {
        return this.descricao;
    }

    public Double preco() {
        return this.preco;
    }

    public void descricao(String value) {
        this.descricao = value;
    }

    public void preco(Double value) {
        this.preco = value;
    }
}