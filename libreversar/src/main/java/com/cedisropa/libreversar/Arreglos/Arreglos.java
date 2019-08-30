package com.cedisropa.libreversar.Arreglos;

public class Arreglos {

    /**
     * Metodo encargado de invertir numeros
     * @param context contexto desde donde se vibrara el dispositivo
     * @param miliseconds Tiempo por el que vibrara el dispositivo
     *
     * @return Si la operacion fue exitosa
     */

    private static Object[] invertirNum;

    public static void invertir(Object[] array) {
        invertirNum = new Object[array.length];
        int maximo = array.length;

        for (int i = 0; i<array.length; i++) {
            invertirNum [maximo - 1] = array[i];
            maximo--;
        }
    }

    public static Object[] getArreglo_invertido() {

        Object[] arreglo = new Object[5];

        arreglo[0] = 0;
        arreglo[1] = 1;
        arreglo[2] = 2;
        arreglo[3] = 3;
        arreglo[4] = 4;

        for (int i = 0; i < arreglo.length; i++) {
            Object j = arreglo[i];
            System.out.println("Arreglo Normal: " + j);
        }

        try {
            invertir(arreglo);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (int i = 0; i < invertirNum.length; i++) {
            Object j = invertirNum[i];
            System.out.println("Arreglo invertido: " + j);
        }



        return Arreglos.invertirNum;
    }

   // public static void main(String args[]) {


    //}


}
