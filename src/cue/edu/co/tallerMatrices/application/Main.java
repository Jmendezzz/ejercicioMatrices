package cue.edu.co.tallerMatrices.application;

import cue.edu.co.tallerMatrices.model.Punto1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Punto1 punto1=new Punto1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 1 para ver el ejercicio numero 1");
        int option = sc.nextInt();

        switch (option){
            case 1:
                System.out.println("Esta en el ejercicio 1");
//                punto1.llenarMatriz();
//                punto1.numeroMayor();
                break;
            case 2:

        }
    }
}