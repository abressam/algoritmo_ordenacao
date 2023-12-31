import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] lista = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};    

    BubbleSort bubbleSort = new BubbleSort(Arrays.copyOf(lista, lista.length));
    InsertionSort insertionSort = new InsertionSort(Arrays.copyOf(lista, lista.length));
    QuickSort quickSort = new QuickSort(Arrays.copyOf(lista, lista.length));

    

    System.out.print("Lista original: ");
    bubbleSort.imprimeLista();

    System.out.println("\n\n----- Bubble Sort ----- ");
    bubbleSort.ordemCrescente();

    System.out.println("\n\n----- Insertion Sort ----- ");
    insertionSort.ordenaArray();

    System.out.println("\n\n----- Quick Sort ----- ");
    quickSort.sort();

  }
}