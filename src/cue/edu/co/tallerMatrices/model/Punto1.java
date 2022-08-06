package cue.edu.co.tallerMatrices.model;
public class Punto1 {
    Funciones funciones = new Funciones();
    int matriz[][]= funciones.llenarMatriz();
    int filas = funciones.getFilas();
    int columnas = funciones.getColumnas();

    public  void numeroMayor(){
        int numeroMayor = 0;
        for (int i = 0;i<filas;i++){
            for (int j = 0;j<columnas;j++){
                if(matriz[i][j]>numeroMayor){
                    numeroMayor=matriz[i][j];
                }
            }
        }
    }
}
