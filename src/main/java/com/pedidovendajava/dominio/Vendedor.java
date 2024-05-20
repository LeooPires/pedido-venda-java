package main.java.com.pedidovendajava.dominio;

public class Vendedor {
    private Number id;
    private String nome;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public Number id() {
        return this.id;
    }

    public String nome() {
        return this.nome;
    }

    public void nome(String value) {
        this.nome = value;
    }
}