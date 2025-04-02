// EJERCICIOS BÁSICOS DE CREACIÓN DE ARRAYS EN JAVA SIN USAR BUCLES

public class E_Array {
    public static void main(String[] args) {

        // 1. Crear un array de 5 enteros e imprimirlos uno a uno.
            int[] numeros = {1, 2, 3, 4, 5};
            System.out.println(numeros[0]);
            System.out.println(numeros[1]);
            System.out.println(numeros[2]);
            System.out.println(numeros[3]);
            System.out.println(numeros[4]);
        // 2. Crear un array de 3 Strings con nombres e imprimirlos.
        String[] nombres = {"Marcos", "Irina", "Eray"};
            System.out.println(nombres[0]);
            System.out.println(nombres[1]);
            System.out.println(nombres[2]);
        // 3. Crear un array de 4 booleanos con valores alternos y mostrarlos.
        boolean[] verdaderoFalso = {true, false, true, false};
            System.out.println(verdaderoFalso[0]);
            System.out.println(verdaderoFalso[1]);
            System.out.println(verdaderoFalso[2]);
            System.out.println(verdaderoFalso[3]);
        // 4. Crear un array de caracteres que contenga las vocales.
        char[] caracteres = {'a', 'e', 'i', 'o', 'u',};
            System.out.println(caracteres[0]);
            System.out.println(caracteres[1]);
            System.out.println(caracteres[2]);
            System.out.println(caracteres[3]);
            System.out.println(caracteres[4]);
            System.err.println("---------------------------------------------------------");
        // 5. Crear un array de 10 enteros sin inicializar, asignar los valores del 1 al 10 y mostrarlos.
        int[] numeros1;
        numeros1 = new int[10];
        numeros1[0] = 1;
        numeros1[1] = 2;
        numeros1[2] = 3;
        numeros1[3] = 4;
        numeros1[4] = 5;
        numeros1[5] = 6;
        numeros1[6] = 7;
        numeros1[7] = 8;
        numeros1[8] = 9;
        numeros1[9] = 10;
        System.out.println(numeros1[5]);
        
        // 6. Crear un array de 6 números dobles e imprimir el doble de cada valor.
        int[] numerosDobles = {20, 32, 45, 58, 65, 84,};
        numerosDobles[0] *= 2;
        System.out.println(numerosDobles[0]);
        numerosDobles[1] *= 2;
        System.out.println(numerosDobles[1]);
        numerosDobles[2] *= 2;
        System.out.println(numerosDobles[2]);
        numerosDobles[3] *= 2;
        System.out.println(numerosDobles[3]);
        numerosDobles[4] *= 2;
        System.out.println(numerosDobles[4]);
        numerosDobles[5] *= 2;
        System.out.println(numerosDobles[5]);
        numerosDobles[6] *= 2;
        System.out.println(numerosDobles[6]);
        numerosDobles[7] *= 2;
        System.out.println(numerosDobles[7]);
        numerosDobles[8] *= 2;
        System.out.println(numerosDobles[8]);
        numerosDobles[9] *= 2;
        System.out.println(numerosDobles[9]);
     
        // 6.1 Al array de 6 números que acabas de crear ahora le vas a cambiar el valor
        // de cada uno de sus elementos. (Tienen que seguir siendo del mismo tipo). 
        int[] numerosDobles1 = {20, 32, 45, 58, 65, 84,};
        numerosDobles1[0] += 2;
        System.out.println(numerosDobles1[0]);
        numerosDobles1[1] += 2;
        System.out.println(numerosDobles1[1]);
        numerosDobles1[2] += 2;
        System.out.println(numerosDobles1[2]);
        numerosDobles1[3] += 2;
        System.out.println(numerosDobles1[3]);
        numerosDobles1[4] += 2;
        System.out.println(numerosDobles1[4]);
        numerosDobles1[5] += 2;
        System.out.println(numerosDobles1[5]);
        numerosDobles1[6] += 2;
        System.out.println(numerosDobles1[6]);
        numerosDobles1[7] += 2;
        System.out.println(numerosDobles1[7]);
        numerosDobles1[8] += 2;
        System.out.println(numerosDobles1[8]);
        numerosDobles1[9] += 2;
        System.out.println(numerosDobles1[9]);
        // 7. Crear un array con los días de la semana e imprimir solo los días laborables.
        String[] dias = {"Lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo",};
        System.out.println(dias[5]);
        System.out.println(dias[6]);
        // 8. Crear un array de 5 elementos de tipo byte e inicializarlos con valores del 10 al 50.
        byte[] valor = {10, 20, 30, 40, 50,};
        System.out.println(valor[0]);
        System.out.println(valor[1]);
        System.out.println(valor[2]);
        System.out.println(valor[3]);
        System.out.println(valor[4]);
        // 9. Crear un array de 4 float y mostrar solo los mayores a 2.5.
        float[] numeros2 = {10.5f, 56.7f, 1.3f, 2.2f};
        
        
        // 10. Crear un array de enteros con valores negativos y contar cuántos hay.
        int[] numeros3 = {-10, -35, 43, 23, -25,};

    }
}