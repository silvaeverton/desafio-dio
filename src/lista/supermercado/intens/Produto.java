package lista.supermercado.intens;

import java.util.Objects;

public class Produto {
    private String nome;
    private float quantidade;
    private boolean comprado;
    private double preco;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Float.compare(quantidade, produto.quantidade) == 0 && comprado == produto.comprado && Double.compare(preco, produto.preco) == 0 && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, quantidade, comprado, preco);
    }

    public Produto(String nome, float quantidade, double preco, boolean comprado) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.comprado = comprado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", comprado=" + comprado +
                ", preco=" + preco +
                '}';
    }
}
