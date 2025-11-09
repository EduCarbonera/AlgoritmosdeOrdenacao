import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            int[] numbers = Util.readIntegersFromCSV("testdata/aleatorio_100.csv");

            double timer = Util.measureExecutionTime(() -> BubbleSort.bubbleSort(numbers));

            for (int number : numbers) {
                System.out.println(number);
            }

            System.out.println("Execution time: " + timer + "ms");

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
