package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Metodes{
    //Poseu els mètodes demanats dins el cos de la classe

    //Exercisi 1 Sumar
    public static int sumaPositius(int a, int b){
        if (a <= 0 || b <= 0) return 0;

        return a + b;
    }
    //Exercisi 2 Incrementar Array
    public static void incrementaArray(int[] arr, int valor){
        if (arr == null || arr.length == 0) ;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + valor;
        }
        System.out.println(Arrays.toString(arr));
    }
}

class Producte {
    private String nom;
    private double preu;

    public Producte(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
}

