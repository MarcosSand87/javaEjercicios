public class B_Bucles {
    
    public static void ejercicio1() {
        // suma todos los elementos de un array
        int[] numeros = {3, 5, 7, 2, 8};
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("La suma de los elementos del array es: " + suma);
    }

    public static void ejercicio2() {
        // muestra los valores de un array bidimensional
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
    }

    public static void ejercicio3() {
        // muestra cuántos elementos pares hay en un array
        int[] datos = {1, 4, 6, 9, 12, 15, 18};

    }

    public static void ejercicio4() {
        // calcula la suma de cada fila de una matriz
        int[][] numeros = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
    }

    public static void ejercicio5() {
        // pide al usuario un número e indica
        // si está dentro de una matriz de 3x3
        // si está muestra su posición (fila y columna)
    }

    public static void ejercicio6() {
        // crea una matriz de 4x4 con bucles anidados
        // en la diagonal principal tiene 1, el resto 0

    }

    public static void ejercicio7() {
        // reemplaza los valores negativos por 0
        int[] valores = {4, -3, 5, -1, 0, 6, -7};
    }

    public static void ejercicio8() {
        // imprime los elementos de esta matriz
        // como si fuera una tabla, separados por espacio
        int[][] tabla = {
            {10, 20, 30, 40},
            {50, 60, 70, 80}
        };
        
    }

    public static void ejercicio9() {
        // invierte el orden de los números del array
        // no puedes utilizar otro array
        int[] original = {1, 2, 3, 4, 5};
    }

    public static void ejercicio10() {
        // cuántas veces aparece un número en una matriz
        int[][] matriz = {
            {1,3,5},
            {8,5,2},
            {5,5,3}
        };
    }
    public static void main(String[] args) {
        ejercicio1();
    }
    
}
