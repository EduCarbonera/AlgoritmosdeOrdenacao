
public class QuickSort {

    public static void quickSort(int[] values) {
        // Ja chama a funcao com os limites iniciais e finais do vetor
        quickSort(values, 0, values.length - 1);
    }

    // Caso base: se o intervalo tem um ou zero elementos, não há o que ordenar
    private static void quickSort(int[] values, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }
        // Particiona o vetor em torno de um pivô, que e basicamente o coracao do algoritimo
        int pivotIndex = partition(values, lowIndex, highIndex);

        // Ordena a parte esquerda
        quickSort(values, lowIndex, pivotIndex - 1);

        // Ordena a parte direita
        quickSort(values, pivotIndex + 1, highIndex);
    }


    // Função que realiza a partiçoes e retorna a posição final do pivô
    private static int partition(int[] values, int lowIndex, int highIndex) {

        // Define o pivô como o último elemento do intervalo
        int pivot = values[highIndex];

        // fronteira dos elementos menores ou iguais ao pivô
        int i = lowIndex - 1;

        for (int j = lowIndex; j < highIndex; j++) {
            // Se o elemento atual for menor ou igual ao pivô
            if (values[j] <= pivot) {
                i++;
                Util.swap(values, i, j);
            }
        }
        // Coloca o pivô na posição correta (entre os menores e os maiores)
        Util.swap(values, i + 1, highIndex);
        return i + 1;
    }
}
