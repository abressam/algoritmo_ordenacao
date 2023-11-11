public class InsertionSort {
    private int lista[];

    public InsertionSort(int[] lista) {
        this.lista = lista;
    }

    public int[] ordenaArray() {
        int tamanho = lista.length;

        for (int i = 1; i < tamanho; ++i) {
            int chave = lista[i];
            int anterior = i - 1;

            while (anterior >= 0 && lista[anterior] > chave) {
                lista[anterior + 1] = lista[anterior];
                anterior = anterior - 1;
            }
            lista[anterior + 1] = chave;

            System.out.println("Passo " + i + ", Inserção: " + chave);
            imprimeLista();
            System.out.println("\n");
        }
        return lista;
    }

    public void imprimeLista() {
        for (int j : lista) {
            System.out.print(j + " ");
        }
    }


}