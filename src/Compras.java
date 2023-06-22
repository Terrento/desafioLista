public class Compras implements Comparable<Compras>{
    private String nome;
    private double preco;

    public Compras(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Compras: " + "nome = " + nome + " preço = " + preco;
    }

    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outraCompra.preco));
    }
}
