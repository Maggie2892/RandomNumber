package com.sdajava.random;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random obiekt = new Random();

        System.out.println(obiekt.nextInt(50));

        int[][] tablica   = new int[10][10];
        for(int i = 0; i < tablica.length; i++){
            for(int j=0; j<tablica[i].length;j++){
                tablica[i][j] = obiekt.nextInt()%50;
            }
        }

        for(int i=0; i < tablica.length; i++){
            for(int j=0; j < tablica.length; j++){
                System.out.printf( "%5d ",tablica[i][j]);
            }
            System.out.println();
        }


       // System.out.printf("%10d", 1234);
    }
}
