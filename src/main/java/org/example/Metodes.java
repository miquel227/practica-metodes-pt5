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
        if (arr == null || arr.length == 0) return;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + valor;
        }
        System.out.println(Arrays.toString(arr));
    }
    //Exercisi 3 copiaSense Negatius
    public static int[] copiaSenseNegatius(int[] arr){
        if (arr == null || arr.length == 0) return null;

        int[] copia = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            copia[i] = arr[i];

            if (arr[i] < 0) {
                copia[i] = 0;
            }
        }
        return copia;
    }
    //Exercisi 4 concatena
    public static char[] concatena(char[] a, char[] b){
        if (a == null || a.length == 0 || b == null || b.length == 0 ) return null;

        char[] copiaA = new char[a.length];
        char[] copiaB = new char[b.length];

        for (int i = 0; i < a.length; i++) {
            copiaA[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            copiaB[i] = b[i];
        }
        //No sabia com fer-ho i he torbat aixo per internet.
        // https://stackoverflow.com/questions/17060992/how-to-concat-two-char-arrays-in-java
        StringBuilder sb = new StringBuilder(64);

        sb.append(copiaA);
        sb.append(copiaB);

        return sb.toString().toCharArray();
    }

    //Exercisi 5  aplicaDescompte
    public static void aplicaDescompte(Producte p, double percent){
        if (p == null) return;

        double preuActual = p.getPreu();

        double preuFinal = preuActual * (1 - percent / 100);

        p.setPreu(preuFinal);
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

