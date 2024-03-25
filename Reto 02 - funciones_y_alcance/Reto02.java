/*
 *   EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL.
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 * 
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 * - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 * - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 * - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 * - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 */
public class Reto02{
    /*
     * Variable global o "atributo de clase" (los atributos de clase llevan el modificador "static"). 
     * Estas variables están disponibles para todos los métodos de la clase y 
     * pueden ser accedidas desde cualquier parte de la misma.
     * 
     * Siempre iran precedidas del mosificador static. Y hay que evitar usarlas.
     */
    //variables globales
    static String texto = "Soy una variable global";
    static int numero = 10; 
    static int numero_2 = 15;
    static double decimal = 1.5;

    //función sin parametros ni retorno
    public void imprimeTexto(){
        System.out.println(texto);
    }

    //funcion con un parametro y sin retorno
    public void imprimeParametro(int x){
        System.out.println("El parametro recibido es: " + x);
    }

    //función con mas de un parametro y con retorno
    public double sumaNumeros(int x, int y, double z){
        double suma = 0; //variable local
        suma = x + y + z;
        return suma;
    }

    public void funEnfun(){
        System.out.println("En Java no se permiten funciones anidadas");
    }

    //Función extra, función que recibe dos parametros de tipo cadena de texto y retorna un entero
    public int funcionExtra(String cadena_1, String cadena_2){
        int contador = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 15 == 0){ //multiplo de 3 y 5
                System.out.println(cadena_1 + cadena_2);
            }else if(i % 3 == 0){ //multiplo de 3
                System.out.println(cadena_1);
            }else if(i % 5 == 0){ //multiplo de 5
                System.out.println(cadena_2);
            }else{
                contador++;
            }
        }
        return contador;
    }

    public static void main (String[] args){
        /* Lo siguiento no es valido: no se puede llamar el metodo así solo, mandaria una error, debido a que no se puede llamar
         * a metodos no estatícos desde un metodo estatico, recordemos lo siguiente: En Java, los métodos estáticos pertenecen 
         * a la clase en sí misma, mientras que los métodos no estáticos (también llamados métodos de instancia) pertenecen a 
         * instancias individuales de la clase.
         */
        //imprimeTexto(); 
        
        Reto02 inst = new Reto02(); //instancia de la clase

        inst.imprimeTexto();

        inst.imprimeParametro(numero);

        double resultado = inst.sumaNumeros(numero, numero_2, decimal);
        System.out.println("Resultado de la suma: " + resultado);
        
        //NOTA: En Java no es posible definir funciones directamentede otras funciones 
        inst.funEnfun();

        //Ejercicio extra
        int numImpresiones = inst.funcionExtra("hola", "mundo");
        System.out.println("Se imprimieron " + numImpresiones + " numeros.");
    }
}