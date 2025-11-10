import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {

            System.out.println("\nBubble Sort Tests:");

            Util.executeTest("testdata/aleatorio_100.csv", SortAlgorithm.BUBBLE_SORT);
            Util.executeTest("testdata/aleatorio_1000.csv", SortAlgorithm.BUBBLE_SORT);
            Util.executeTest("testdata/aleatorio_10000.csv", SortAlgorithm.BUBBLE_SORT);
            System.out.println(" ");

            Util.executeTest("testdata/crescente_100.csv", SortAlgorithm.BUBBLE_SORT);
            Util.executeTest("testdata/crescente_1000.csv", SortAlgorithm.BUBBLE_SORT);
            Util.executeTest("testdata/crescente_10000.csv", SortAlgorithm.BUBBLE_SORT);
            System.out.println(" ");

            Util.executeTest("testdata/decrescente_100.csv", SortAlgorithm.BUBBLE_SORT);
            Util.executeTest("testdata/decrescente_1000.csv", SortAlgorithm.BUBBLE_SORT);
            Util.executeTest("testdata/decrescente_10000.csv", SortAlgorithm.BUBBLE_SORT);
            System.out.println(" ");

            Util.executeTest("testdata/aleatorio_100.csv", SortAlgorithm.QUICK_SORT);
            Util.executeTest("testdata/crescente_1000.csv", SortAlgorithm.QUICK_SORT);
            Util.executeTest("testdata/decrescente_100.csv", SortAlgorithm.QUICK_SORT);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
