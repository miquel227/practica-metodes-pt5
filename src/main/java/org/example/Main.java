package org.example;

import java.util.Arrays;

import static org.example.Metodes.*;

public class Main {
    static void main() {
        //Exercisi 1 Sumar
        System.out.println(sumaPositius(3, 4));
        System.out.println("------------------");
        //Exercisi 2 Incrementar Array
        int[] array = {1, 2, 3};
        incrementaArray(array, 5);
        System.out.println(Arrays.toString(array));
        System.out.println("------------------");

        //Exercisi 3 copiaSense Negatius
        array = new int[]{-3, 5, -1, 7};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copiaSenseNegatius(array)));
        System.out.println(Arrays.toString(array));
        System.out.println("------------------");

        //Exercisi 4 concatena
        char[] arr = {'1', '2', '3'}, arr2 = {'4', '5'};

        System.out.println(Arrays.toString(concatena(arr, arr2)));
        System.out.print(Arrays.toString(arr) +" ");
        System.out.println(Arrays.toString(arr2));

        //Exercisi 5  aplicaDescompte

        Producte p = new Producte("Miquel", 100);

        System.out.println(p.getPreu());
        aplicaDescompte(p, 40);
        System.out.println(p.getPreu());

    }
}
