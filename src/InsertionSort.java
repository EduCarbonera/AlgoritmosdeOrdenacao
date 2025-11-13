public class InsertionSort {

    public static void insertionSort(int[] values) {
        // Segue o principio que o primeiro elemento já está ordenado. Começando do segundo
        for (int i = 1; i < values.length; i++) {
            int j = i;

            // Move para a esquerda, trocando com elementos maiores até encontrar a posição correta
            while (j > 0 && values[j] < values[j - 1]) {
                Util.swap(values, j, j - 1);
                j--;  // Continua verificando para a esquerda
            }
        }
    }
}
