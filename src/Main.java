public class Main {
    public static void main(String[] args) {
        // Teste Bubble Sort
        int[] lista = {18, 9, 2, 4, 16, 3};
        BubbleSort bubbleSort = new BubbleSort(lista);

        System.out.print("Lista original: ");
        bubbleSort.imprimeLista();

        bubbleSort.ordemCrescente();

        System.out.print("\nLista ordenada: ");
        bubbleSort.imprimeLista();
    }
}