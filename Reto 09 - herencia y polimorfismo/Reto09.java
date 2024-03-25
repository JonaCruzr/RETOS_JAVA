/*
 * EJERCICIO:
 * Explora el concepto de herencia según tu lenguaje. Crea un ejemplo que
 * implemente una superclase Animal y un par de subclases Perro y Gato,
 * junto con una función que sirva para imprimir el sonido que emite cada Animal.
 */

public class Reto09{
    public static void main(String[] args) {
        // Polimorfismo: El polimorfismo permite tratar un objeto de una subclase como si fuera un objeto de su clase base.
        // Esto se logra a través de la herencia
        Animal perro = new Dog("Firulais");
        perro.sound();

        Animal gato = new Cat("Michi");
        gato.sound();
    }
}

class Animal {
    private String name;

    public Animal() {
    }
    
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound() {
        System.err.println("emite sonido");
    }
}

class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name); // llama al constructor de la clase padre o super clase
    }

    @Override
    public void sound() {
        System.err.println("El gato Hace Miau Miau");
    }
}

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name) {
        super(name); // llama al constructor de la clase padre o super clase
    }

    @Override
    public void sound() {
        System.err.println("El perro Hace Wau Wau");
    }
}