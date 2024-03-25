/*
 * EJERCICIO:
 * - Muestra ejemplos de asignación de variables "por valor" y "por referencia", según
 *   su tipo de dato.
 * - Muestra ejemplos de funciones con variables que se les pasan "por valor" y 
 *   "por referencia", y cómo se comportan en cada caso en el momento de ser modificadas.
 *  (Entender estos conceptos es algo esencial en la gran mayoría de lenguajes)
 */

//CONCEPTOS:

/*
 * Variables "Por valor": 
 * - Cuando una variable se pasa "por valor" a una función, se pasa una copia del valor almacenado en la variable, no la variable en sí misma.
 * - En este caso, cualquier modificación realizada dentro de la función no afectará a la variable original fuera de ella.
 * - Este es el comportamiento estándar para tipos de datos primitivos como enteros, caracteres, booleanos, etc.,
 */

 /*
  * Variables "Por referencia":
  * - Cuando una variable se pasa "por referencia" a una función, se pasa una referencia o dirección de memoria 
  *   de la variable en lugar del valor en sí mismo.
  * - En este caso, cualquier modificación realizada dentro de la función afectará directamente a la variable 
  *   original fuera de ella, ya que ambas apuntan a la misma ubicación de memoria.
  * - Este es el comportamiento comúnmente asociado con tipos de datos compuestos, como matrices, objetos o estructuras
  */

public class Reto05{

    static void changeAge(int age) {
        age = 40;
    }

    static void changeArray(double[] prices) {
        for (int i = 0; i < prices.length; i++) {
            prices[i] = prices[i] + 10;
        }
    }

    static void changeAge(Double d) {
        d = 23.00;
    }

    static void changePerson(Person person) {
        System.out.println(person);
    }

    public static void main(String[] args) {
        /*
         * Todos los tipos primitivos se pasan por valor
         */
        int age;
        age = 35;
        System.out.println(age);
        changeAge(age); // pasamos a una función que asigna otro valor
        System.out.println(age); // observamos que no cambia por se pasa copia (valor)

        /*
         * Todos los arreglos y objetos se pasan por referencia
         */
        // Ejemplo con arreglo
        double[] prices = { 10.23, 34.00, 12.00 };
        System.out.println("Precios");
        for (double price : prices) {
            System.out.println(price);
        }

        changeArray(prices); // Se pasa a una función donde se cambia

        System.out.println("Precios despues de cambio");
        for (double price : prices) {
            System.out.println(price);
        }

        // Ejemplo con objeto
        Person person = new Person();
        person.setName("Amador");
        person.setAge(29);

        System.out.println(person);
        changePerson(person);

        /*
         * las clases Wrappers(String, Integer, Double...) son inmutables, quiere decir
         * que una vezasignado no su valor no se puede cambiar
         */
        Double d = 89.00;
        System.out.println(d);
        changeAge(d);
        System.out.println("post " + d);
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}