package lista.supermercado.intens;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListaDeCompra {
    int i;
    private final List<Produto> produtoList = new ArrayList<>();

    public void adicionarProduto() {
        Scanner scanner = new Scanner(System.in); // Scanner para ler entradas do usuário

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade (ou 0 se não for necessário): ");
        float quantidade = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Digite o preço (ou 0 se não for necessário): ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite true se já comprado, false se não: ");
        boolean comprado = scanner.nextBoolean();
        scanner.nextLine();

        // Cria um novo objeto Produto
        Produto produto = new Produto(nome, quantidade, preco, comprado);

        // Adiciona o produto à lista
        produtoList.add(produto);

        System.out.println("Produto adicionado com sucesso!"); // ... (implementação do método adicionarProduto() permanece a mesma)
    }

    public void exibirProdutos() {
        if (!produtoList.isEmpty()) {
            System.out.println("----------------------------------");
            System.out.println("Lista de Compras:");
            System.out.println("----------------------------------");

            for (int i = 0; i < produtoList.size(); i++) {
                Produto produto = produtoList.get(i);
                String compradoStr = produto.isComprado() ? "Comprado" : "Não comprado";
                System.out.println((i + 1) + ". " + produto.getNome() + " - " +
                        (produto.getQuantidade() > 0 ? produto.getQuantidade() + " " : "") +
                        (produto.getPreco() > 0 ? "R$ " + produto.getPreco() : "") +
                        " - " + compradoStr);
            }

            System.out.println("----------------------------------");
        } else {
            System.out.println("A lista está vazia!");

        }
    }
    


    public void rodarPrograma() {
        

        do { // Verifica se o usuário deseja continuar
            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual Operação deseja fazer?");
            System.out.println("1. Adicionar Item");
            System.out.println("2. Exibir Itens");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;

                case 2:
                    exibirProdutos();
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("Deseja Sair? 1 para continuar ou 0 para sair");
            int p = scanner.nextInt();

            i = p;

             
        }while(i== 1);

        System.out.println("Programa finalizado!");
    }

    public static void main(String[] args) {
        ListaDeCompra listaDeCompra = new ListaDeCompra();
        listaDeCompra.rodarPrograma();
    }
}