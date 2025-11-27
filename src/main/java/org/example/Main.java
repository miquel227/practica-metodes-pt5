package org.example;

import java.util.Arrays;

import static org.example.Metodes.incrementaArray;
import static org.example.Metodes.sumaPositius;

public class Main {
    static void main() {
        //Exercisi 1 Sumar
        System.out.println(sumaPositius(3, 4));

        //Exercisi 2 Incrementar Array
        int[] arr = {1, 2, 3};
        incrementaArray(arr, 5);
    }
}
