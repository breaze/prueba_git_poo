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
}
