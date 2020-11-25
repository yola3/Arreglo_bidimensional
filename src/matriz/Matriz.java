/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

public class Matriz {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int filas, columnas;
        int[][] Matriz = null;
        System.out.println("ingrese el tamaño de la matriz:");
        System.out.println("Digete el numero de columnas:");
        columnas = leer.nextInt();
        System.out.println("Digete el numero de filas:");
        filas = leer.nextInt();
        Matriz = new int[filas][columnas];
        System.out.println();//este para que me haga un salto de linea
        llenar(Matriz); // utilizo el metodo llenar y le envio matriz
        System.out.println();
        System.out.println("los numeros de los dijitos son:");
        imprimirmatriz(Matriz);// utilizo el metood imprimirdatos y le envio la matriz que contiene mis digitos

    }

    public static void llenar(int[][] c) {
        System.out.println("ingrese los valores de la matriz");
        for (int i = 0; i < c.length; i++) {//se utiliza un bucle for para guardar los datos,y incrementarlo

            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = Integer.parseInt(leer.next());// almacena lo que el usurio ingresa desde el teclado

            }
        }
    }// se cierra el metodo de llenar valores

    public static void imprimirmatriz(int[][] x) {
        for (int i = 0; i < x.length; i++) {//se utiliza un bucle for para guardar los datos,y incrementarlo

            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]); // se imprime losdatos que hay en las posiciones i y j

            }
            System.out.println();
        }// cierra el metodo imprimir matriz
    }
}
