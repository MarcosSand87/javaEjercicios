public class CA_MetodosYVariables {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * ================================
         * = Variables y Tipos Primitivos =
         * ================================
         */

        // Declara una variable String que contenga tu nombre y muéstralo por pantalla.
        String nombre = "Marcos";
        System.out.println("ejercicio1= " + nombre);
        System.out.println();
        // Declara dos variables int, asígnales valores y muestra la suma de ambas.
         int num1 = 3;
         int num2 = 4;
         System.out.println("ejercicio2= " + (num1 + num2));
         System.out.println();
        // Declara dos variables int, asígnales valores y muestra la resta del primero menos el segundo.
         int num3 = 6;
         int num4 = 8;
         System.out.println("ejercicio3= " + (num3 - num4));
         System.out.println();
        // Declara dos variables int y muestra su multiplicación.
          int num5 = 7;
          int num6 = 8;
          System.out.println("ejercicio4= " + (num5 * num6));
          System.out.println();
        // Declara dos variables int y muestra la división entera entre ellas.
         int num7 = 6;
         int num8 = 2;
         System.out.println("ejercicio5= " + (num7 / num8));
         System.out.println();
        // Declara dos variables int y muestra el resultado del operador módulo %.
         int num9 = 7;
         int num10 = 2;
         System.out.println("ejercicio6= " + (num9 % num10));
         System.out.println();
        // Declara una variable String para el nombre y una variable int para la edad. 
        // Muestra un mensaje concatenando ambas.
         String nombre1 = "Marcos";
         int edad = 37;
         System.out.println("ejercicio7= " + nombre1 +": " + edad + " años");
         System.out.println();
        // Declara al menos una variable de cada tipo primitivo 
        // (byte, short, int, long, float, double, char, boolean)
        // y muestra un mensaje que confirme que todo está bien declarado.
        byte edad1 = 5;
        short saldo = 20_000;
        int kmLuna = 120_456_345;
        long kmJupiter = 526_869_856_142L;
        float num12 = 32.567F;
        double numPi = 3.141509;
        boolean nombreM = false;
        char abc = 'a';
        System.out.println( edad1 + " " + saldo + " " + " " + kmLuna + " " + kmJupiter + " " + 
                        num12 + " " + numPi + " " + nombreM + " " + abc + " Esta todo perfecto.");
        System.out.println();
        /*
         * =============================
         * = Operaciones con variables =
         * =============================
         * ** A partir de aquí todo o casi todo va a necesitar hacer un método...
         */
         // Declara dos variables int, pásalas a un método que sume y devuelva el resultado, y muéstralo.
            int number15 = 23;
            int number16 = 23;
            int resultado = sumar(number15, number16);
            System.out.println(resultado);
        // Declara un método saludar() que imprima un saludo y llámalo desde otro método.
        saludar();
        System.out.println();
        
        // Declara un método que reciba un número como parámetro y lo imprima por pantalla.
        // Llámalo con cualquier valor.
        num23(23);
        System.out.println();
        // Declara un método que reciba dos int, sume ambos y devuelva el resultado. 
        // Muestra el resultado por pantalla.
        number(20, 30);
        System.out.println();
        // Sobrecarga el método saludar para que también acepte un nombre y lo imprima. 
        // Llama ambas versiones.
        saludar ("Marcos");
        System.out.println();
        // Sobrecarga el método suma para que pueda recibir tres números. 
        // Llama a esta versión y muestra el resultado.
        number(20, 30, 50);
        System.out.println();
        // Haz una multiplicación entre dos variables double y muestra el resultado.
        double number17 = 2.5;
        double number18 = 3.4;
        System.out.println("resultado= " + (number17 * number18));
        System.out.println();


        /*
         * =============================
         * = Conversiones y Constantes =
         * ============================= 
         */
        // Declara una variable int y asígnala a una variable double. 
        // Imprime el resultado para comprobar la conversión implícita.
        int sueldo = 10_000;
        double sueldoNuevo = sueldo;
        System.out.println(sueldoNuevo);
        System.out.println(sueldo);
        System.out.println();

        // Declara una variable double y haz una conversión explícita (casting) a int. 
        // Muestra el valor convertido.
        double sueldo1 = 10_000.45;
        int sueldoNuevo1 = (int) sueldo1;
        System.out.println(sueldoNuevo1);
        System.out.println();
        // Calcula el área de un triángulo utilizando base y altura como double. 
        // Usa la fórmula (base * altura) / 2.
        double base = 12.5;
        double altura = 9.8;
        System.out.println("El area del triangulo de 12,5 y 9,8 es= " + (base * altura));
        System.out.println();
        // Declara una variable String para ciudad y una int para el año. 
        // Imprime una frase como “Aprendiendo Java...”.
        String ciudad = "Zamora";
        int año = 2025;
        System.out.println("aprendiendo java en " + ciudad + " en " + año);
        System.out.println();

        // Declara un método que reciba un número y devuelva su cuadrado. 
        // Llama al método y muestra el resultado.

        /*
         * ====================================
         * = Operaciones Compuestas y Métodos =
         * ====================================
         */
        // Declara dos variables y muestra cuál es mayor utilizando el operador ternario (? :).

        // Declara tres variables String y concaténalas en una frase completa.

        // Declara dos variables int, multiplícalas y almacena el resultado en una tercera variable. Imprime el resultado.

        // Crea un método que reciba dos enteros y devuelva su promedio como double. Imprime el resultado.

    }
    public static void saludar (){
        System.out.println("hola");
    }
    public static void num23(int numero){
            System.out.println(numero);
    }
    public static int number(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        System.out.println(resultado);
        return resultado;
    }  
public static void saludar(String nombre) {
    System.out.println("hola " + nombre + ".");    
}
public static int number(int numero1, int numero2, int numero3) {
    System.out.println("Suma= " + (numero1 + numero2 + numero3));
        return numero1 + numero2 + numero3;   
}
public static int sumar(int a, int b){
    return a + b;
}

}


    
 // Declara un método que reciba un número y devuelva su cuadrado. 
        // Llama al método y muestra el resultado.