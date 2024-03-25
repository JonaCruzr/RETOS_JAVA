/*
 * EJERCICIO:
 * Entiende el concepto de recursividad creando una función recursiva que imprima
 * números del 100 al 0.
 */

 public class Reto06{
    static void decremento(int numero){
        for(int i = numero; i >= 0; i--){
            System.out.println(i);
        }
    }

    static void decrementoRecursivo(int numero){
        if (numero >= 0){
            System.out.println(numero);
            numero -= 1;
            decrementoRecursivo(numero);
        }
    }
    
    public static void main(String[] args) {
        int numero = 100;

        System.out.println("DECREMENTO NO RECURSIVO:");
        decremento(numero); //decremento sin recursividad
        System.out.println("DECREMENTO RECURSIVO:");
        decrementoRecursivo(numero);
    }
 }