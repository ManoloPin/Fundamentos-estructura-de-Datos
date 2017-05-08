package ordenamiento_1;

import java.util.Scanner;
import ordenamiento.*;// llamar el paquete ordenamiento con todas sus clases 

/**
 *
 * @author manuel
 * 
 */
public class Ordenamiento_1 {

    public static void main(String[] args){
        Scanner tec = new Scanner (System.in);// Scanner para poder pedir datos por teclado
        System.out.println("Ingrese tamaño del Array");
        int tam = tec.nextInt();// se ingresa el tamaño del array
        int A[] = new int [tam];// se crea el array de numeros enteros
        System.out.println("ingrese valores separados por comas (,)"); 
        for (int i = 0; i < A.length; i++) {// for que recorre posiciones del Array para ingresar datos 
         int num = tec.nextInt();   // se ingresan datos por twclado
            A[i]=num;              //  se guardan los datos dentro del Array
        }
        System.out.println("Array");
        for (int i = 0; i < A.length; i++) {// for que recorre posiciones del array 
            System.out.printf(A[i]+"\t");// se muestra por pantalla el Array
        }
        System.out.println("");
        int op;
        do { // se crea un menu para un mejor manejo de los elementos 
            System.out.println("MENU");// se agregan nombre de los ejercicios que se pueden realizar 
            System.out.println("1. Burbuja\n"
                    + "2. Burbuja Mejorada\n"
                    + "3. Insercion\n"
                    + "4. Seleccion\n"
                    + "5. Shel\n"
                    + "6. salir");
            System.out.println("Que operacion desea: ");
            op = tec.nextInt();// se pide por teclado el numero de operacion 
            switch (op) { // se crean una serie de casos y en cada uno se agrega una actividad

                case 1: // el caso uno llama la clase de burbuja
                    System.out.println("Burbuja");
                    Burbuja b = new Burbuja();//llamar clase
                    b.burbuja(tam, A);// llamar metodo
                    b.Mostrar(tam, A);// llamar metodo
                    break;// serrar o terminar cada caso
                            
                case 2:// el caso dos llama la clase Burbuja Mejorada
                    System.out.println("Burbuja Mejorada");
                    BurbujaMejorada Bm = new BurbujaMejorada();// llamar clase
                    Bm.bMejorada(A, tam);// llamar  metodo
                    Bm.mostrar(A, tam);//   llamar  metodo
                    break;
                case 3: //el caso tres llama la clase Insercion
                    System.out.println("Insercion");
                    Insercion i = new Insercion();//llamar clase
                    i.insertionSort(A);// llamar metodo
                    i.mostrar(A, tam);// llamar metodo
                    break;
                case 4:// el caso cuatro llama la clase Selelccion
                    System.out.println("Seleccion");
                    Seleccion s = new Seleccion();//llamar clase
                    s.seleccion(A); // llamar metodo
                    s.mostrar(A, tam); // llamar metodo 
                    break;
                case 5:// el caso cinco llama la clase shell
                    System.out.println("Shell");
                    Shell Sh = new Shell();// llamar clase
                    Sh.shell(A);// llamar metodo
                    Sh.mostrar(A, tam);// llamar metodo
                    break;
            }
        } while (op != 6);// terminar o serrar el switch con  while para generar una condicion 
    }

}
