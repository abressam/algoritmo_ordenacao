public class BubbleSort {
    private int lista[];

    public BubbleSort(int[] lista) {
        this.lista = lista;
    }

    public int[] ordemCrescente() {
        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] >= lista[j]) {
                    int aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
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
