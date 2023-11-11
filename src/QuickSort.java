public class QuickSort {
  private int step = 1;
  private int[] array;

  public QuickSort(int[] array) {
    this.array = array;
  }

  private void swap(int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;

    System.out.println("Passo " + step + ", Troca: " + array[i] + " e " + array[j]);
    step++;
    System.out.println();
    printArray();
    System.out.println();
  }

  private int partition(int low, int high) {
    // O pivot é o último elemento da partição
    int pivot = array[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        i++;

        swap(i, j);
      }
    }

    swap(i + 1, high);

    return i + 1;
  }

  private void sort(int low, int high) {
    if (low < high) {
      int pi = partition(low, high);

      sort(low, pi - 1);
      sort(pi + 1, high);
    }
  }

  public void sort() {
    sort(0, array.length - 1);
  }

  public void printArray() {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
