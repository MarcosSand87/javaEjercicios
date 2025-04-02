public class D_Condiciones {

    // 1. Verificar si un número es positivo
    public static void ejercicio1() {
     int num = 5;
     if(num > 0){
        System.out.println("el numero: " + num + " es positivo");
     }
    }

    // 2. Verificar si un número es negativo
    public static void ejercicio2() {
        int num = -1;
        if(num < 0){
            System.out.println("el numero " + num + " es negativo");
        } else {
            System.out.println("el numero " + num + " es mayor que negativo");
        }

    }

    // 3. Verificar si un número es cero
    public static void ejercicio3() {
        int num = 0;
        if(num == 0){
            System.out.println("el numero " + num + " es igual a cero");
        } else{
            System.out.println("el numero " + num + " es diferente a cero");
        }
    }

    // 4. Comprobar si un número es par
    public static void ejercicio4() {
        int num = 60;
        if (num % 2 == 0) {
            System.out.println("el numero " + num + " es par");
        }else {
            System.out.println("el numero " + num + " no es par");
        }
    }

    // 5. Comprobar si un número es impar
    public static void ejercicio5() {
        int num = 13;
        if(num % 1 == 0){
            System.out.println("el numero " + num + " es impar");
        } else{
            System.out.println("el numero " + num + " no es impar");
        }
    }

    // 6. Verificar si una persona es mayor de edad
    public static void ejercicio6() {
         int edad = 18;
         if(edad >= 18){
            System.out.println("eres mayor de edad.");
         }else{
            System.out.println("no eres mayor de edad.");
         }
    }

    // 7. Comparar dos números
    public static void ejercicio7() {
        // int num1 = 6;
        // int num2 = 4;
        // if(num1 == num2){
        //     System.out.println("true");
        // }else if(num1 != num2){
        //     System.out.println("true");
        // }else if(num1 < num2){
        //     System.out.println("true");
        // }else if(num1 > num2){
        //     System.out.println("true");
        // }else if(num1 <= num2){
        //     System.out.println("true");
        // }else if(num1 >= num2){
        //     System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }
        int num1 =6;
        int num2 = 4;
        if(num1 > num2){
             System.out.println("");
    }

    // 8. Validar si un número está en un rango
    public static void ejercicio8() {
       int min = 1;
       int max = 100;
       int numero =2;
       if(numero >= min && numero <= max){
        System.out.println("el numero " + numero + " esta entre " + min + " y " + max + " entonces es true");
       }else{
        System.out.println("el numero " + numero + " no esta entre " + min + " y " + max + " entonces es false");
       }
    }

    // 9. Verificar si un carácter es una vocal
    public static void ejercicio9() {
      char caracter = 'A';
      if(letra == 'a' || letra == 'e')
    }

    

    // 10. Determinar si un año es bisiesto
    public static void ejercicio10() {
        int anio = 2025;
        int bisiesto = 0;
        if(anio % 4 == bisiesto){
            System.out.println("el " + anio + "si es bisiesto");
        }else{
            System.out.println("el " + anio + "no es bisiesto");
        }

    }

    // 11. Evaluar si un número es positivo, negativo o cero
    public static void ejercicio11() {
        int numero = -4;
        if(numero > 0  ){
            System.out.println("es positivo");
        }else if (numero < 0){
            System.out.println("es negativo");
        }else{
            System.out.println("el numero es 0");
        }

    }

    // 12. Determinar si se puede acceder a un evento (mayor de edad y con entrada)
    public static void ejercicio12() {
        int edad = 18;
        int edadFija = 18;
        boolean entrada = true;
        if(edad >= edadFija && entrada){
            System.out.println("si puedes entrar");
        }else{
            System.out.println("no puedes entrar");
        }
    }

    // 13. Verificar si un número es divisible entre 3 y 5
    // public static void ejercicio13() {
    //     int num= 35;
    //     if(num % 5 == 0 && num % 10 == 0){
    //         System.out.println("es divisible entre 5");
    //     }else if(num % 3 == 0){
    //         System.out.println("es divisible entre 3");
    //     }else {
    //         System.out.println("no es divisible");
    //     }
    // }

    // 14. Comprobar si un número no está en un rango
    public static void ejercicio14() {

    }

    // 15. Determinar el mayor de tres números
    public static void ejercicio15() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

    }

    // 16. Verificar si una persona puede votar (edad >= 18)
    public static void ejercicio16() {
        int edad = 18;
        int edadFija = 18;
        if(edad >= edadFija){
            System.out.println("si puedes votar");
        }else{
            System.out.println("no puedes votar");
        }
    }

    // 17. Clasificar un número como positivo par, positivo impar, negativo par o negativo impar
    public static void ejercicio17() {

    }

    // 18. Validar si una persona tiene acceso VIP (edad > 21 o paga extra)
    public static void ejercicio18() {
        int edad = 22;
        boolean pagaExtra = true || false;
        boolean acceso = (edad > 21 || pagaExtra);
        if(edad > 21 || pagaExtra){
            System.out.println("tiene acceso vip");
        }else {
            System.out.println("no tiene acesso vip");
        }
    }

    // 19. Evaluar si dos variables booleanas son verdaderas
    public static void ejercicio19() {

    }

    // 20. Clasificar la nota de un examen
    public static void ejercicio20() {

    }

    // 21. Determinar si una letra es mayúscula
    public static void ejercicio21() {

    }

    // 22. Verificar si una letra es minúscula
    public static void ejercicio22() {

    }

    // 23. Validar si dos contraseñas son iguales
    public static void ejercicio23() {

    }

    // 24. Verificar si un número está dentro de varios rangos posibles
    public static void ejercicio24() {

    }

    // 25. Llamar todos los ejercicios desde el main
    public static void main(String[] args) {
       // ejercicio1();
       //ejercicio2();
      // ejercicio3();
    // ejercicio4();
       // ejercicio5();
       //ejercicio6(); 
       //ejercicio7(); preguntar a alex, es que no tiene sentido lo que e puesto.
       //ejercicio8(); preguntar a ver si asi vale.
       //ejercicio9(); no se lo que hay que poner.
       //ejercicio10(); preguntar si esta bien.
       //ejercicio11();
       //ejercicio12(); preguntar a ver si esta bien
       //ejercicio13(); no esta hecho
       //ejercicio14(); no esta hecho
        //ejrcicio15(); no esta hecho
        //ejercicio16();
        //ejercicio17(); sin hacer
        //ejercicio18();
        
    }    
}  
