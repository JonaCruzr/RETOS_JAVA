/*
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * 
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * 
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * 
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * 
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 */


public class Reto00 {
    public static void main(String[] args){
        // Sitio oficial: https://www.java.com/

        // Comentario de una sola linea

        /*
         * Comentario 
         * de varias
         * lineas
         * 
         */

        String variable = "variable";
        final String cte = "constante";

        //datos primitivos
        byte tipoByte = 20;
        short tipoShort = 100;
        int tipoInt = 1000;
        long tipoLong = 10000;
        float tipoFloat = 3.14f;
        double tipoDouble = 3.14;
        boolean tipoBoolean = true;
        char caracter = 'a';

        String lenguaje = "Java";
        System.out.println("¡Hola, " + lenguaje + "!");

    }
}