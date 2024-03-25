/*
 * EJERCICIO:
 * Muestra ejemplos de todas las operaciones que puedes realizar con cadenas de caracteres
 * en tu lenguaje. Algunas de esas operaciones podrían ser (busca todas las que puedas):
 * - Acceso a caracteres específicos, subcadenas, longitud, concatenación, repetición,
 *   recorrido, conversión a mayúsculas y minúsculas, reemplazo, división, unión,
 *   interpolación, verificación...
 */

 import java.util.Arrays;

public class Reto04{

    private static void opStrins() {
        String string = "Hello World, RoadMap 2024"; // crea una variable de tipo string
        String anotherString = new String("Hello World, Roadmap 2024"); // crea una variable de tipo string utiizando el constructor
        // length(), devuelve la longitud de la cadena (numero de caracteres)
        System.out.println("longitud:" + string.length());
        // charAt - Devuelve el valor del carácter en el índice especificado
        System.out.println("Carácter en el indice 1: " + string.charAt(1));
    
        // compareTo(String anotherString) Compara dos cadenas lexicográficamente.

        // la comparación lexicográfica se realiza comparando los caracteres de las cadenas uno a uno, de izquierda a derecha. 
        // si en algún punto de la comparación dos caracteres difieren, el carácter con el valor Unicode más bajo se considera "menor" 
        // y la cadena que lo contiene se considera "menor" lexicográficamente.

        // devuelve un entero Menor que 0 si "string" es lexicográficamente menor que "anotherString".
        // devuelve igual a 0 si "string" es lexicográficamente igual a "anotherString".
        //devuelve Mayor que 0 si "string" es lexicográficamente mayor que "anotherString".
        System.out.println("Comparacion : " + string.compareTo(anotherString)); //se compara "string" con "anotherString"

        // compareToIgnoreCase(String anotherString) hace lo mismo que compareTo pero
        // ignora diferencias mayúsculas y minúsculas
        System.out.println("Comparacion IgnoreCase : " + string.compareToIgnoreCase(anotherString));

        // concat(String str) , Concatena la cadena especificada al final de esta cadena
        System.out.println("Concatenacion : " + string.concat("!!!"));

        // contains(CharSequence s), Devuelve verdadero si y sólo si esta cadena
        // contiene la secuencia especificada de valores de caracteres
        System.out.println("Contiene? :" + string.contains("2024"));

        // contentEquals(CharSequence s) se utiliza para comparar dos cadenas
        System.out.println("Comparar : " + string.contentEquals(anotherString));

        // endsWith(String suffix) Prueba si esta cadena termina con el sufijo
        // especificado
        System.out.println("Termina con 2024? : " + string.endsWith("2024"));

        // equals(Object anObject), Compara dos cadenas con el objeto especificado
        // verifica si dos objetos son iguales en contenido
        System.out.println("Es igual? : " + string.equals(anotherString));

        // equalsIgnoreCase(Object anObject), Compara dos cadenas con el objeto
        // especificado, ignora mayúsculas de minúsculas
        System.out.println("Es igual IgnoreCase? : " + string.equalsIgnoreCase(anotherString));

        // format(String format, Object... args), Devuelve una cadena formateada
        // utilizando la cadena de formato y los argumentos especificados.
        System.out.println("Formateo: " + String.format("Inicio %s final!!!", string));

        // indexOf(String str), Devuelve el índice dentro de esta cadena de la primera
        // aparición de la sub cadena especificada
        System.out.println("Indice de 'W' : " + string.indexOf("W"));

        // join(CharSequence delimiter, CharSequence... elements)
        // Devuelve una nueva cadena compuesta por copias de los elementos CharSequence
        // unidas con una copia del delimitador especificado
        System.out.println("Union: " + String.join(" - ", string, anotherString));

        // matches(String regex), Indica si esta cadena coincide o no con la expresión
        // regular dada
        System.out.println("Uso de expresiones regulares : " + string.matches("[A-Z].*"));

        // replace(char oldChar, char newChar), Devuelve una cadena resultante de
        // reemplazar todas las apariciones de oldChar en esta cadena con newChar.
        System.out.println("Reemplazo:  " + string.replace("o", "0"));

        // replaceAll(String regex, String replacement)
        // Reemplaza cada sub cadena de esta cadena que coincide con la expresión
        // regular dada con el reemplazo dado
        System.out.println("Reemplazo regex: " + string.replaceAll("[0-9]", "-"));

        // replaceFirst(String regex, String replacement)
        // Reemplaza la primera sub cadena de esta cadena que coincide con la expresión
        // regular dada con el reemplazo dado.
        System.out.println("Reemplazo regex primera aparicion: " + string.replaceFirst("o", "#"));

        // split(String regex)
        // Divide la cadena entre coincidencias de la expresión regular dada
        String[] strings = string.split(" ");
        System.out.println("Division: " + Arrays.toString(strings));

        // startsWith(String prefix), Prueba si esta cadena comienza con el prefijo
        // especificado
        System.out.println("Empieza con ?: " + string.startsWith("H"));

        // substring(int beginIndex, int endIndex)
        // Devuelve una cadena que es una sub cadena de esta cadena. endIndex(exclusivo)
        System.out.println("Sub cadena: " + string.substring(0, 5));

        // toLowerCase(), Convierte todos los caracteres de esta cadena a minúsculas
        // utilizando las reglas de la configuración regional predeterminada.
        System.out.println("A minusculas: " + string.toLowerCase());

        // toUpperCase(), Convierte todos los caracteres de esta cadena a mayúsculas
        // utilizando las reglas de la configuración regional predeterminada.
        System.out.println("A mayusculas: " + string.toUpperCase());

        // trim(), elimina espacios al inicio y al final
        System.out.println("Sin espacios inicio y final:" + string.trim());
    }

    public static void main(String[] args) {
        opStrins();
    }

}