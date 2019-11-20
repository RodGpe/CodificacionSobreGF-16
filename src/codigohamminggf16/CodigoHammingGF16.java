/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigohamminggf16;

import java.util.Arrays;

/**
 *
 * @author root
 */
public class CodigoHammingGF16 {

    /**
     * @param args the command line arguments
     */
    static int[][] suma = { //de tamaño 16 X 16 es para la suma en el campo
        {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
        {1, 0, 3, 2, 5, 4, 7, 6, 9, 8, 11, 10, 13, 12, 15, 14},
        {2, 3, 0, 1, 6, 7, 4, 5, 10, 11, 8, 9, 14, 15, 12, 13},
        {3, 2, 1, 0, 7, 6, 5, 4, 11, 10, 9, 8, 15, 14, 13, 12},
        {4, 5, 6, 7, 0, 1, 2, 3, 12, 13, 14, 15, 8, 9, 10, 11},
        {5, 4, 7, 6, 1, 0, 3, 2, 13, 12, 15, 14, 9, 8, 11, 10},
        {6, 7, 4, 5, 2, 3, 0, 1, 14, 15, 12, 13, 10, 11, 8, 9},
        {7, 6, 5, 4, 3, 2, 1, 0, 15, 14, 13, 12, 11, 10, 9, 8},
        {8, 9, 10, 11, 12, 13, 14, 15, 0, 1, 2, 3, 4, 5, 6, 7},
        {9, 8, 11, 10, 13, 12, 15, 14, 1, 0, 3, 2, 5, 4, 7, 6},
        {10, 11, 8, 9, 14, 15, 12, 13, 2, 3, 0, 1, 6, 7, 4, 5},
        {11, 10, 9, 8, 15, 14, 13, 12, 3, 2, 1, 0, 7, 6, 5, 4},
        {12, 13, 14, 15, 8, 9, 10, 11, 4, 5, 6, 7, 0, 1, 2, 3},
        {13, 12, 15, 14, 9, 8, 11, 10, 5, 4, 7, 6, 1, 0, 3, 2},
        {14, 15, 12, 13, 10, 11, 8, 9, 6, 7, 4, 5, 2, 3, 0, 1},
        {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}
    };
    static int[][] multiplicar = { //es de tamaño 16 X 16 es para la multiplicacion en el campo
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
        {0, 2, 4, 6, 8, 10, 12, 14, 3, 1, 7, 5, 11, 9, 15, 13},
        {0, 3, 6, 5, 12, 15, 10, 9, 11, 8, 13, 14, 7, 4, 1, 2},
        {0, 4, 8, 12, 3, 7, 11, 15, 6, 2, 14, 10, 5, 1, 13, 9},
        {0, 5, 10, 15, 7, 2, 13, 8, 14, 11, 4, 1, 9, 12, 3, 6},
        {0, 6, 12, 10, 11, 13, 7, 1, 5, 3, 9, 15, 14, 8, 2, 4},
        {0, 7, 14, 9, 15, 8, 1, 6, 13, 10, 3, 4, 2, 5, 12, 11},
        {0, 8, 3, 11, 6, 14, 5, 13, 12, 4, 15, 7, 10, 2, 9, 1},
        {0, 9, 1, 8, 2, 11, 3, 10, 4, 13, 5, 12, 6, 15, 7, 14},
        {0, 10, 7, 13, 14, 4, 9, 3, 15, 5, 8, 2, 1, 11, 6, 12},
        {0, 11, 5, 14, 10, 1, 15, 4, 7, 12, 2, 9, 13, 6, 8, 3},
        {0, 12, 11, 7, 5, 9, 14, 2, 10, 6, 1, 13, 15, 3, 4, 8},
        {0, 13, 9, 4, 1, 12, 8, 5, 2, 15, 11, 6, 3, 14, 10, 7},
        {0, 14, 15, 1, 13, 3, 2, 12, 9, 7, 6, 8, 4, 10, 11, 5},
        {0, 15, 13, 2, 9, 6, 4, 11, 1, 14, 12, 3, 8, 7, 5, 10}
    };

    public static void main(String[] args) {

        int[][] H = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0, 1}};

        //char[] hex = {'0', 'a', 'a', '1', '9', 'e', 'f', 'c', '3', 'f', 'f', 'd', '2', '1', 'c'};
        //char[] hex = {'2', '5', '7', '9', '2', '2', '0', '4', '2', '1', '8', '2', 'e', 'e', 'c'};
        //char[] hex = {'4', '6', 'e', 'd', '7', 'a', '5', '0', 'd', '2', '9', '5', 'f', 'a', '5'};
        //char[] hex = {'5', '4', 'f', '9', '3', '8', 'e', 'f', '8', 'f', '9', '0', '2', '2', 'c'};
        //areglos de la tarea----------------------
        //char[] hex = {'3', 'b', '6', '9', '3', '6', '9', '7', '0', 'a', 'a', '6', 'b', 'b', '2'};
        //char[] hex = {'3', 'c', 'c', 'c', 'a', '6', 'e', '0', '3', 'f', '9', '0', 'b', 'c', 'b'};
        //char[] hex = {'4', '3', 'e', '2', '5', 'b', 'e', 'b', 'c', 'd', '9', '9', '8', '9', 'c'};
        //char[] hex = {'5', '2', '4', 'f', '8', '0', 'f', '1', '9', 'b', '8', '7', '7', '2', '3'};
        //char[] hex = {'3', '5', 'a', '7', '6', '9', 'c', '9', '6', '3', 'd', '8', 'e', 'd', 'c'};
        //char[] hex = {'d', '8', '7', 'd', '0', 'b', 'f', '8', 'b', '5', '3', '1', '0', '6', '7'};
        //char[] hex = {'5', '9', '2', '4', '9', '2', '5', '7', '3', '9', '3', '5', '5', '1', '7'};
        //char[] hex = {'f', 'd', '9', '7', '9', 'd', '0', 'a', 'a', 'b', '5', '9', '3', '9', '0'};
        //char[] hex = {'6', '0', '2', '2', '0', '0', '9', 'd', '1', '4', '0', '3', 'd', '9', 'b'};
        char[] hex = {'0', 'b', '5', '3', '6', '2', '3', 'a', 'c', '2', 'f', '2', '6', '7', '1'};

        CodigoHammingGF16 tarea = new CodigoHammingGF16();

        int[] hexInt = new int[hex.length];
        hexInt = tarea.convertirHexAInt(hex);
        System.out.println(Arrays.toString(hexInt));
        int[] GF16 = new int[16];
        int a = (2 * 7) % 16;
        //a = 100;
        //int[] mensaje = {0, 10, 10, 1, 9, 14, 15, 12, 3, 15, 15, 13, 2, 1, 12}; //longitud del mensaje es de 15
        int[] mensaje;
        mensaje = hexInt;
        //int[] mensaje = {2, 5, 7, 9, 2, 2, 0, 4, 2, 1, 8, 2, 14, 14, 12};
        //int[] mensaje = {4, 6, 14, 13, 7, 10, 5, 0, 13, 2, 9, 5, 15, 10, 5};
        //int[] mensaje = {5, 4, 15, 9, 3, 8, 14, 15, 8, 15, 9, 0, 2, 2, 12};
        int[] vectorCodificado = new int[mensaje.length + 2]; //reserva espacio para el mensaje y los bits de redundancia
        for (int i = 0; i < mensaje.length; i++) {
            vectorCodificado[i] = mensaje[i];
        }
        System.out.println("vector codificado " + Arrays.toString(vectorCodificado));
        //int [] vector= {0,a ,a ,1,9, e, f, c,3, f, f, d,2,1, c};
        int x16 = 0; //variable que almacena el valor del primer bit de redundancia
        for (int i = 0; i < mensaje.length; i++) {
            x16 = suma[mensaje[i]][x16]; //se suman en el campo los  bits del mensaje
        }
        System.out.println("la suma de los primeros numeros es " + x16);
        //x16 = x16 % 16;
        vectorCodificado[mensaje.length] = x16;
        System.out.println("vector codificado " + Arrays.toString(vectorCodificado));
        System.out.println("x16 =  " + String.format("%x", x16));
        System.out.println(Arrays.toString(mensaje));
        tarea.printHex(hexInt);
        //----------------------------------------
        System.out.println("----------------");
        int x17 = 0; //variable que almacena el segundo bit de redundancia
        for (int i = 0; i < mensaje.length; i++) {
            x17 = suma[(multiplicar[i + 1][mensaje[i]])][x17]; //se suman los bits del mensaje multiplicador con los valores del 1 al 15 en hexadecimal
        }
        System.out.println(x17);
        //x17 = x17 % 16;
        System.out.println("x17 = " + String.format("%x", x17));
        vectorCodificado[mensaje.length + 1] = x17;
        //System.out.println("vector codificado " + Arrays.toString(vectorCodificado));
        System.out.print("vector codificado   ");
        tarea.printHex(vectorCodificado);
        System.out.println("------------------inicia decodificacion---------------------");
        //---------------calculo del sindrome----------
        //char[] hexConError = {'0', 'a', 'a', '1', '9', 'e', 'f', 'f', '3', 'f', 'f', 'd', '2', '1', 'c', '4', 'd'};
        //char[] hexConError = {'5', '4', 'f', '9', '3', '8', 'e', 'f', '8', 'f', '9', '0', '2', '2', 'c', 'f', '4'};
        //arreglos de la tarea
        //char[] hexConError = {'b', '3', 'e', 'a', '0', '9', '4', 'f', '0', '0', '3', '8', 'e', '1', 'c', '7', '8'};
        //char[] hexConError = {'c', '4', '9', '7', 'c', 'f', 'e', 'b', 'c', 'c', '8', '4', '6', '5', '5', '0', 'f'};
        //char[] hexConError = {'5', 'd', '7', '4', '8', 'b', '8', '2', '4', 'b', '2', '9', '8', '7', '3', 'e', '9'};
        //char[] hexConError = {'1', '0', '3', '7', '0', '8', '7', '1', 'c', '9', 'c', 'd', '8', 'f', 'd', '5', '1'};
        //char[] hexConError = {'0', 'c', '2', 'a', '9', 'd', 'a', '5', '6', '3', '9', '2', '4', 'e', '1', '7', '7'};
        //char[] hexConError = {'2', '1', '3', 'a', '6', '7', '3', 'a', '1', '5', '0', '1', '5', '4', 'f', '3', '8'};
        //char[] hexConError = {'b', '6', 'a', '6', 'e', 'f', '2', '9', '7', 'e', '4', '3', '5', '3', '3', '2', '7'};
        //char[] hexConError = {'e', '8', '1', '7', '5', 'e', 'd', '6', '7', 'd', 'e', 'c', 'e', '7', '1', 'c', '6'};
        //char[] hexConError = {'3', '8', '8', '0', 'd', '1', 'a', '5', 'a', '7', 'e', 'b', 'd', 'a', '0', 'a', 'b'};
        char[] hexConError = {'f', '9', 'b', 'e', '7', '9', '4', 'b', '1', '3', '6', '4', 'f', 'b', '3', 'd', '9'};
        System.out.println("Vector con error    " + Arrays.toString(hexConError));
        int[] sindrome = new int[H.length];
        int[] hexIntConError = new int[hexConError.length];
        hexIntConError = tarea.convertirHexAInt(hexConError);
        sindrome = tarea.calcularSindrome(hexIntConError, H);
        //System.out.println(Arrays.toString(sindrome));
        //tarea.calcularSindrome(hexIntConError, H);
        tarea.decodificar(sindrome, hexIntConError);
    }

    public int[] convertirHexAInt(char[] hex) {
        int[] salidaInt = new int[hex.length];
        for (int i = 0; i < salidaInt.length; i++) {
            switch (hex[i]) {
                case '0':
                    salidaInt[i] = 0;
                    break;
                case '1':
                    salidaInt[i] = 1;
                    break;
                case '2':
                    salidaInt[i] = 2;
                    break;
                case '3':
                    salidaInt[i] = 3;
                    break;
                case '4':
                    salidaInt[i] = 4;
                    break;
                case '5':
                    salidaInt[i] = 5;
                    break;
                case '6':
                    salidaInt[i] = 6;
                    break;
                case '7':
                    salidaInt[i] = 7;
                    break;
                case '8':
                    salidaInt[i] = 8;
                    break;
                case '9':
                    salidaInt[i] = 9;
                    break;
                case 'a':
                    salidaInt[i] = 10;
                    break;
                case 'b':
                    salidaInt[i] = 11;
                    break;
                case 'c':
                    salidaInt[i] = 12;
                    break;
                case 'd':
                    salidaInt[i] = 13;
                    break;
                case 'e':
                    salidaInt[i] = 14;
                    break;
                case 'f':
                    salidaInt[i] = 15;
                    break;

            }
        }
        return salidaInt;
    }

    public void printHex(int[] matrizDecimal) {
        System.out.print("[");
        for (int i = 0; i < matrizDecimal.length; i++) {
            System.out.print(String.format("%x", matrizDecimal[i]));
            if (i == matrizDecimal.length - 1) {
                System.out.println("]");
            } else {
                System.out.print(", ");

            }
        }
    }

    public int[] calcularSindrome(int[] vector, int[][] matrizH) {
        int suma = 0;
        int[] resultado = new int[matrizH.length];
        for (int i = 0; i < matrizH.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                suma = this.suma[this.multiplicar[vector[j]][matrizH[i][j]]][suma];
            }
            resultado[i] = suma;
            System.out.println("sindrome " + i + ":  " + String.format("%x", resultado[i]));
            suma = 0;
        }
        return resultado;
    }

    public void decodificar(int[] sindrome, int[] vector) {
        if (sindrome[0] != 0) {

            int posicionDelError = 0;
            for (int i = 0; i < this.multiplicar[0].length; i++) { //buscamos por renglon en la tabla de suma
                if (this.multiplicar[sindrome[0]][i] == sindrome[1]) { // if 
                    System.out.println(this.multiplicar[sindrome[0]][i]);
                    System.out.println("posicion del error " + i);
                    posicionDelError = i - 1;
                }
            }
            vector[posicionDelError] = this.suma[vector[posicionDelError]][sindrome[0]];
            System.out.print("vector decodificado ");
            printHex(vector);
        } else {
            vector[vector.length - 1] = suma[vector[vector.length - 1]][sindrome[1]];
            printHex(vector);
        }
    }

}
