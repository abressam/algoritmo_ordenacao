public class BubbleSort {

  private int passo = 1;
  private int[] lista;

  public BubbleSort(int[] lista) {
    this.lista = lista;
  }

  public int[] ordemCrescente() {
    boolean trocaOcorreu;

    // loop externo que percorre toda a lista
    for (int i = 0; i < lista.length - 1; i++) {
      // loop interno que compara os número adjacentes
      for (int j = 0; j < lista.length - i - 1; j++) {
        // compara se o item atual é maior que o próximo
        if (lista[j] > lista[j + 1]) {
          // guarda o valor do item atual
          int temp = lista[j];
          // atribui o valor do próximo elemento no item atual
          lista[j] = lista[j + 1];
          // atribui o valor temporário no próximo elemento e completa a troca
          lista[j + 1] = temp;
          trocaOcorreu = true;
        } else {
          trocaOcorreu = false;
        }

        // imprime o passo e a troca
        if (trocaOcorreu) {
          System.out.println("Passo " + passo + ", Troca: " + lista[j + 1] + " e " + lista[j]);
          passo++;
          imprimeLista();
          System.out.println("\n");
        }
      }
    }
    return lista;
  }

  public void imprimeLista() {
    for (int i = 0; i < lista.length; i++) {
      System.out.print(lista[i] + " ");
    }
  }
}
