package dominio;

public class Produtos {
    private String descricao;
    private Number preco;

    public Produtos(String descricao, Number preco){
        this.descricao = descricao;
        this.preco = preco;

    }

    public String descricao() {
        return this.descricao;
    }

    public Number preco() {
        return this.preco;  
    }

    public String descricao() {
        return descricao;
    }

    public Number preco() {
        return preco;

    }
}