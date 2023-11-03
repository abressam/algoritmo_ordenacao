public class Main {
    public static void main(String[] args) {
        // Teste Bubble Sort
        int[] lista = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        BubbleSort bubbleSort = new BubbleSort(lista);

        System.out.print("Lista original: ");
        bubbleSort.imprimeLista();

        System.out.println("\n\n----- Bubble Sort ----- ");
        bubbleSort.ordemCrescente();
    }
}