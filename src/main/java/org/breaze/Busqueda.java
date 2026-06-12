package org.breaze;

public class Busqueda {

    public int buscar(int[] lista, int valor) {
        int bajo = 0;
        int alto = lista.length - 1;
        while (bajo <= alto) {
            int medio = bajo + (alto - bajo) / 2;
            if (lista[medio] == valor) return medio;
            if (lista[medio] < valor) bajo = medio + 1;
            else alto = medio - 1;
        }
        return -1;
    }

    public void sort(int[] arr) {
        int n = arr.length;
        boolean huboIntercambio;

        // Bucle externo para recorrer todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false;

            // Bucle interno para comparar elementos adyacentes
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    huboIntercambio = true;
                }
            }
            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!huboIntercambio) {
                break;
            }
        }
    }
    public void sort2(int[] arreglo) {
        int n = arreglo.length;
        if (n <= 1) return;

        // Arreglo auxiliar para realizar las fusiones
        int[] temp = new int[n];

        // Tamaño de los subarreglos a fusionar (1, 2, 4, 8, etc.)
        for (int currSize = 1; currSize < n; currSize = 2 * currSize) {

            // Elegir punto de inicio de diferentes subarreglos de tamaño currSize
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {

                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);

                // Fusionar los subarreglos arr[leftStart...mid] y arr[mid+1...rightEnd]
                //merge(arreglo, temp, leftStart, mid, rightEnd);
            }
        }
    }
}
