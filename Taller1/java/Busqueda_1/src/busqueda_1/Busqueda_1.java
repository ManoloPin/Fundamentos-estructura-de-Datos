package busqueda_1;

import java.util.Scanner;
import busqueda.*;

/**
 *
 * @author manuel
 */
public class Busqueda_1 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);// Scanner para poder pedir datos por teclado
        System.out.println("Ingrese tamaño del Array");
        int tam = tec.nextInt();// se ingresa el tamaño del array
        int A[] = new int[tam];// se crea el array de numeros enteros
        System.out.println("ingrese valores separados por comas (,)");
        for (int i = 0; i < A.length; i++) {// for que recorre posiciones del Array para ingresar datos 
            int num = tec.nextInt();   // se ingresan datos por twclado
            A[i] = num;              //  se guardan los datos dentro del Array
        }
        System.out.println("Array");
        for (int i = 0; i < A.length; i++) {// for que recorre posiciones del array 
            System.out.printf(A[i] + "\t");// se muestra por pantalla el Array
        }

        System.out.println("");
        int op, dato, dato2;
        do { // se crea un menu para un mejor manejo de los elementos 
            System.out.println("MENU");// se agregan nombre de los ejercicios que se pueden realizar 
            System.out.println("1. Busqueda Lineal\n"
                    + "2. Busqueda Binaria\n"
                    + "3. Busqueda \n"
                    + "4. salir");
            System.out.println("Que operacion desea: ");
            op = tec.nextInt();// se pide por teclado el numero de operacion 
            switch (op) { // se crean una serie de casos y en cada uno se agrega una actividad

                case 1: // el caso uno llama la clase de burbuja
                    System.out.println("Lineal");
                    Lineal l = new Lineal();
                    dato = tec.nextInt();
                    System.out.println("en la posicion: " + l.lineal(A, dato));
                    break;// serrar o terminar cada caso

                case 2:// el caso dos llama la clase Burbuja Mejorada
                    System.out.println("Binaria");
                    binaria bi = new binaria();
                    dato = tec.nextInt();
                    int izq = 0;
                    int der = A.length - 1;

                    System.out.println("en la posicion: " + bi.busBinaria(A, dato, izq, der));

                    break;

                case 3: //el caso tres llama la clase Insercion
                    System.out.println("Interpolacion");
                    Interpolacion in = new Interpolacion();
                    dato = tec.nextInt();
                    int izq1 = 0;
                    int der1 = A.length - 1;
                    System.out.println("en la posicion: " + in.busInterpolacion(A, dato, izq1, der1));
                    break;
            }
        } while (op != 4);// terminar o serrar el switch con  while para generar una condicion 
    }

}
