
// Realizar un programa que permita ingresar por teclado 10 números en un arreglo y debe:
// - Mostrar el número mayor
// - Mostrar el número menor
// - Mostrar los números pares
// - Mostrar los números impares
// - Ordenarlos de manera Ascendente
// - Ordenarlos de manera Descendente

import java.util.Scanner;
import java.lang.reflect.Method;
import java.util.Arrays;
public class DiezNumeros {
    public static int[] numeros = new int[10];
    public static void main(String[] args) {
        //int[] numeros = new int[10];
        Scanner scan = new Scanner(System.in);

        //int nuevoNum = scan.nextInt();
        for (int i=0; i<10; i++){
            System.out.println("Debe ingresar 10 números enteros");
            System.out.println("Ingrese un número entero: ");
            numeros[i] = scan.nextInt();
        }


        Arrays.sort(numeros);

        System.out.println("El número mayor es: " + numeros[9]);
        System.out.println("El número menor es: " + numeros[0]);
        System.out.print("Numeros pares: ");
        mostrarPar();
        System.out.println();
        System.out.print("Numeros impares: ");
        mostrarImpar();
        System.out.println();
        System.out.print("Orden ascendente: ");
        mostrarAsc();
        System.out.println();
        System.out.print("Orden descendente: ");
        mostrarDsc();
        System.out.println();
    }

    //METODOS

    //Mostrar numeros pares
    public static void mostrarPar() {
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i]%2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }

    // Mostrar numeros impares
    public static void mostrarImpar() {
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i]%2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }

    // Mostrar en orden ascendente
    public static void mostrarAsc() {
        for(int i : numeros) {
            System.out.print(i + " ");
        }
    }
    //Mostrar en orden descendente
    public static void mostrarDsc() {
        for(int i = 1; i <= numeros.length; i++) {
            System.out.print(numeros[numeros.length-i] + " ");
        }
    }
}

