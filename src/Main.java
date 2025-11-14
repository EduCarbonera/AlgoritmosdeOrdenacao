import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Sistema de Testes");

            System.out.println("Escolha o algoritmo de ordenação:");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Quick Sort");
            System.out.println("3 - Insertion Sort");
            System.out.println("4 - Testar todos os algoritmos");
            System.out.print("\nDigite sua escolha (1-4): ");
            int escolha = scanner.nextInt();
            System.out.println();

            switch (escolha) {
                case 1:
                    executarTestes(SortAlgorithm.BUBBLE_SORT, "Bubble Sort");
                    break;

                case 2:
                    executarTestes(SortAlgorithm.QUICK_SORT, "Quick Sort");
                    break;

                case 3:
                    executarTestes(SortAlgorithm.INSERTION_SORT, "Insertion Sort");
                    break;

                case 4:
                    executarTestes(SortAlgorithm.BUBBLE_SORT, "Bubble Sort");
                    executarTestes(SortAlgorithm.QUICK_SORT, "Quick Sort");
                    executarTestes(SortAlgorithm.INSERTION_SORT, "Insertion Sort");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    return;
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida! Por favor, digite um número.");
        } finally {
            scanner.close();
        }
    }

    private static void executarTestes(SortAlgorithm algoritmo, String nomeAlgoritmo) throws IOException {
        System.out.println("\n" + nomeAlgoritmo + " Tests:");
        System.out.println("=".repeat(50));


        System.out.println("\n[Dados Aleatórios]");
        Util.executeTest("testdata/aleatorio_100.csv", algoritmo);
        Util.executeTest("testdata/aleatorio_1000.csv", algoritmo);
        Util.executeTest("testdata/aleatorio_10000.csv", algoritmo);

        System.out.println("\n[Dados Crescentes]");
        Util.executeTest("testdata/crescente_100.csv", algoritmo);
        Util.executeTest("testdata/crescente_1000.csv", algoritmo);
        Util.executeTest("testdata/crescente_10000.csv", algoritmo);

        System.out.println("\n[Dados Decrescentes]");
        Util.executeTest("testdata/decrescente_100.csv", algoritmo);
        Util.executeTest("testdata/decrescente_1000.csv", algoritmo);
        Util.executeTest("testdata/decrescente_10000.csv", algoritmo);

        System.out.println();
    }
}