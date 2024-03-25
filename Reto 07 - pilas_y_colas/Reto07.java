/*
 * EJERCICIO:
 * Implementa los mecanismos de introducción y recuperación de elementos propios de las
 * pilas (stacks - LIFO) y las colas (queue - FIFO) utilizando una estructura de array
 * o lista (dependiendo de las posibilidades de tu lenguaje).
 */

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Reto07{

    public static void examplePilas(){
        // Pilas con la clase Stack
        // Crear una pila de libros
        Stack<String> books = new Stack<>();

        // Agregando elementos a la pila
        books.push("Book 1");
        books.push("Book 2");
        books.push("Book 3");

        // Mostrando la pila
        System.out.println(books);

        // Ver el ultimo elemento
        System.out.println("ultimo elemento: " + books.peek());

        // Eliminar el ultimo elemento
        System.out.println("ultimo elemento eliminado: " + books.pop());

        // ver luego de eliminar
        System.out.println(books);

        // buscar elemento
        System.out.println("ubicacion de Book 1 respecto a la parte superior: " + books.search("Book 1"));
    }

    public static void exampleColas(){
        // Colas con la clase Dequeue
        Queue<String> colas = new ArrayDeque<>();
        // agrega un elemento al final de la cola. Si la operación tiene éxito, devuelve true. Sin embargo, 
        // si no se puede agregar el elemento lanzará una excepción 
        colas.add("Jona");
        colas.add("Alex");

        // Al igual que add(), este método agrega un elemento al final de la cola. Sin embargo, 
        // si la operación no puede completarse simplemente devuelve false en lugar de lanzar una excepción.
        colas.offer("Pedro");
        colas.offer("Daniel");

        System.out.println(colas);
        // Eliminar el primer elimento
        System.out.println(colas.poll());

        // ver luego de eliminar
        System.out.println(colas);
    }

    public static void main(String[] args) {
        examplePilas();
        exampleColas();
    }

}