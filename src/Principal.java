import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o limite do seu cartão?");
        double limite = ler.nextDouble();
        Cartao cartao = new Cartao(limite);

        int sair = 1;
        while(sair != 0) {
            System.out.println("Digite o nome do produto");
            String nome = ler.next();

            System.out.println("Digite o valor");
            double valor = ler.nextDouble();

            Compras compra = new Compras(nome, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada){
                System.out.println("Compra feita!");
                System.out.println("Quer fazer mais compras? 1 pra sim, 0 para não");
                sair = ler.nextInt();
            } else {
                System.out.println("Saldo insuficiente");
                sair = 0;
            }
        }

        System.out.println("**********");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartao.getCompras());
        for (Compras c : cartao.getCompras()) {
            System.out.println(c.getNome() + " - " + c.getPreco());
        }
        System.out.println("\n**********");

        System.out.println("Saldo restante: " + cartao.getSaldo());
    }
}
