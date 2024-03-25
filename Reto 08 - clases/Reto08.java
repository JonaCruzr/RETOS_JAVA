/*
 * EJERCICIO:
 * Explora el concepto de clase y crea un ejemplo que implemente un inicializador,
 * atributos y una función que los imprima (teniendo en cuenta las posibilidades
 * de tu lenguaje).
 * Una vez implementada, créala, establece sus parámetros, modifícalos e imprímelos
 * utilizando su función.
 */

public class Reto08{

    public static void main(String[] args) {
        // creamos un objeto de la clase estudiante,
        Student s = new Student(01, "Jonathan", "Cruz", 25);
        System.out.println(s);
    }
}

class Student {
    private int code;
    private String firstName;
    private String lastName;
    private int age;

    public Student(int code, String firstName, String lastName, int age) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int setAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    //Este metodo se llama a imprimir automáticamente cuando intentas imprimir un objeto directamente
    @Override
    public String toString() {
        return String.format("code=%d, firstName=%s, lastName=%s, age=%d ", code, firstName, lastName, age);
    }

}