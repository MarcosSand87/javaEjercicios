// EJERCICIOS BÁSICOS DE CREACIÓN DE ARRAYS EN JAVA

/*
 * Estos ejercicios están diseñados para trabajar únicamente la creación y el acceso básico a arrays en Java,
 * sin usar estructuras más avanzadas o clases adicionales. Luego se incluyen ejercicios con métodos básicos del array.
 */

 public class FA_BucleArray {
    public static void main(String[] args) {

        // 1. Crear un array de 5 enteros e imprimirlos uno a uno.
        int[] numero ={1, 2, 3, 4, 5};
        System.out.println(numero[0]);
        System.out.println(numero[1]);
        System.out.println(numero[2]);
        System.out.println(numero[3]);
        System.out.println(numero[4]);
        System.out.println("-----------------------------------------------------");

        // 2. Crear un array de 3 Strings con nombres e imprimirlos.
        String[] nombres = {"Marcos", "Irina", "Eray", };
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println("-----------------------------------------------------");

        // 3. Crear un array de 4 booleanos con valores alternos y mostrarlos.
        boolean[] verdaderoFalso ={true, false, false, true};
        System.out.println("hay fruta " + verdaderoFalso[0]);
        System.out.println("hay manzana " + verdaderoFalso[1]);
        System.out.println("hay peras " + verdaderoFalso[2]);
        System.out.println("hay platanos " + verdaderoFalso[3]);
        System.out.println("-----------------------------------------------------");


        // 4. Crear un array de caracteres que contenga las vocales.
        char[] Caracter = {'a', 'e', 'i', 'o', 'u'};

        // 5. Crear un array de 10 enteros sin inicializar, asignar los valores del 1 al 10 y mostrarlos.
        int[] numerosA = new int [10];
        numerosA[0] = 1;
        numerosA[1] = 2;
        numerosA[2] = 3;
        numerosA[3] = 4;
        numerosA[4] = 5;
        numerosA[5] = 6;
        numerosA[6] = 7;
        numerosA[7] = 8;
        numerosA[8] = 9;
        numerosA[9] = 10;
        System.out.println(numerosA[3]);
        System.out.println("---------------------------------------------------------------");

        // 6. Crear un array de 6 números dobles e imprimir el doble de cada valor.
        int[] numeroDo = {10, 20, 30, 40, 50, 60,};
        System.out.println(numeroDo[0] *= 2);
        System.out.println(numeroDo[1] *= 2);
        System.out.println(numeroDo[2] *= 2);
        System.out.println(numeroDo[3] *= 2);
        System.out.println(numeroDo[4] *= 2);
        System.out.println(numeroDo[5] *= 2);
        System.out.println("--------------------------------------------------------------------");
        // 7. Crear un array con los días de la semana e imprimir solo los días laborables.
        String[] dias ={"lunes", "martes", "miercoles", "jueves", "viermes", "sabado", "domingo"};
        System.out.println(dias[0]);
        System.out.println(dias[1]);
        System.out.println(dias[2]);
        System.out.println(dias[3]);
        System.out.println(dias[4]);
        System.out.println("__________________________________________________________________");
        
        // 8. Crear un array de 5 elementos de tipo byte e inicializarlos con valores del 10 al 50.
        byte[] valor = {10, 20, 30, 40, 50,};
        System.out.println(valor[0]);
        System.out.println(valor[1]);
        System.out.println(valor[2]);
        System.out.println(valor[3]);
        System.out.println(valor[4]);
        System.out.println("___________________________________________________________-_________");
        // 9. Crear un array de 4 float y mostrar solo los mayores a 2.5.
        float[] numeroS ={2.54f, 5.65f, 1.2f, 2.3f};
        if (numeroS[0] > 2.5f) {
        System.out.println("si es mayor a 2.5 " + numeroS[0]);
    }
    if (numeroS[1] > 2.5f){
        System.out.println("si es mayor a 2.5 " + numeroS[1]);
    }
    if (numeroS[2] > 2.5f){
        System.out.println("si es mayor a 2.5 " + numeroS[2]);
    }
    if (numeroS[3] > 2.5f){
        System.out.println("si es mayor a 2.5 " + numeroS[3]);
    }
      System.out.println("--------------------------------------------------------------------");

        // 10. Crear un array de enteros con valores negativos y contar cuántos hay.
        int[] enteros ={-10, -20, -30, -54,};
        int length = enteros.length;
        System.out.println(length);  
        System.out.println("--------------------------------------------------------------------");


        // EJERCICIOS USANDO MÉTODOS BÁSICOS DE ARRAYS

        // 11. Usar length para mostrar el tamaño del array declarado en el ejercicio 10.
        int[] enteros ={-10, -20, -30, -54,};
        int length = enteros.length;
        System.out.println(length);  
        System.out.println("--------------------------------------------------------------------");

        // 12. Buscar un número dentro de un array usando un bucle.
        int[] numeroB ={12, 34, 21, 65, 76};
        System.out.println("voy a buscar la posicion 3 del array");
        for(int numeroB : 3){
            System.out.println("es la pisicon 3");

        }

        // 13. Encontrar el valor máximo en un array.
        

        // 14. Calcular la suma de todos los elementos de un array.
        

        // 15. Mostrar los elementos de un array en orden inverso.
        

        // 16. Duplicar los valores de un array en otro nuevo.
        

        // 17. Comprobar si dos arrays son iguales (elemento a elemento).
        

        // 18. Contar cuántos valores son pares en un array.
        

        // 19. Reemplazar todos los valores menores que 5 con un 0.
        

        // 20. Copiar manualmente los elementos de un array a otro.
        
    }
}