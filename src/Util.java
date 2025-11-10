import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Util {

    public static int[] readIntegersFromCSV(String filePath) throws IOException {

        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // skip header
            while (br.readLine() != null) {
                count++;
            }
        }

        int[] values = new int[count];
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            String line;
            int index = 0;

            while ((line = br.readLine()) != null) {
                values[index++] = Integer.parseInt(line.trim());
            }
        }

        return values;
    }

    public static void swap(int[] values, int i, int x) {
        int aux = values[i];
        values[i] = values[x];
        values[x] = aux;
    }

    public static void executeTest(String filePath, SortAlgorithm algorithm) throws IOException {
        int[] numbers = Util.readIntegersFromCSV(filePath);
        Runnable task = null;

        switch (algorithm) {
            case BUBBLE_SORT:
                task = () -> BubbleSort.bubbleSort(numbers);
                break;
        }

        switch (algorithm) {
            case QUICK_SORT:
                task = () -> QuickSort.quickSort(numbers);
                break;
        }

        if (task == null) {
            return;
        }

        double timer = Util.measureExecutionTime(task);

        System.out.println("\tExecution time: " + timer + "ms (" + filePath + ") (" + algorithm + ")");
    }

    public static double measureExecutionTime(Runnable method) {
        long inicio = System.nanoTime();
        method.run();
        long fim = System.nanoTime();
        return (fim - inicio) / 1000000.0;
    }
}
