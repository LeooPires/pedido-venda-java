

public class Produto {
    private String descricao;
    private Double preco;

    public Produto(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String value) {
        this.descricao = value;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double value) {
        this.preco = value;
    }
}