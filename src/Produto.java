public class Produto {
    // Atributos
    private String descricao;
    private Double preco;

    // Construtor
    public Produto(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    // Gets e sets
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}