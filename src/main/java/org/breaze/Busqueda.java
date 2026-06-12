package org.breaze;

public class Busqueda {

    public int buscar(int[] lista, int valor) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == valor) {
                return i;
            }
        }
        return -1;
    }

}
