package cue.edu.co.tallerMatrices.model;

import java.util.Scanner;

public class Funciones {
    int matriz[][];
    int filas;
    int columnas;
    Scanner sc = new Scanner(System.in);
    public int[][] llenarMatriz(){
        System.out.println("Ingrese el numero de filas ");
        filas  = sc.nextInt();
        System.out.println("Ingrese el numero de columnas");
        columnas = sc.nextInt();
        matriz = new int[filas][columnas];
        for (int i = 0;i<filas;i++){
            for(int j = 0; j<columnas;j++){
                System.out.println("Ingrese un numero");
                matriz[i][j]=sc.nextInt();
            }
        }
        return matriz;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
}
