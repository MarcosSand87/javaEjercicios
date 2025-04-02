/*
 * ====VARIABLE====
 * En una variable podemos almacenar información.
 * Java es de tipado estático: cada variable tiene un tipo asignado.
 * El tipo que tiene asignado una variable es invariable, no puede cambiarse.
 * Cuidado si se hacen operaciones y es necesario almacenar el resultado en una nueva variable.
 * Hay que asignar el tipo de esa variable según vaya a ser el resultado.
 * 
 * ----JERARQUIA----
 * double > float > long > int > short = char > byte
 * 
 * ----OPERACIONES----
 * En operaciones aritméticas va a ganar siempre el tipo de dato mayor.
 * int + long = long
 * float * int = float
 * Es importante tener en cuenta esto cuando alojamos el resultado en una nueva variable.
 * int / int = int --> ¿qué pasa si el resultado tiene que ser double?
 * No es suficiente con que la variable del resultado se declare como double.
 * La operación es entre dos enteros y el resultado tendrá la parte entera, perdiendo los decimales.
 * 
 * Para solucionar esto se necesita castear uno de los números a un tipo decimal.
 * Como ganará el decimal el resultado sí tendrá la parte decimal.
 * 
 * ----CASTING----
 * Para cambiar de un número de menor tamaño a otro de mayor tamaño no hay problema.
 * Para hacerlo al revés, de uno mayor a otro menor necesitamos hacer el casteo.
 * Es como forzar la conversión de un tipo de dato a otro.
 * 
 * (float) int / int = float --> si esto se almacena en una variable double
 *                               el resultado será float, pero al ser double la variable
 *                               no hay problema y no es necesario el casteo.
 * 
 * =================
 * =   EJERCICIO   =
 * =================
 * Se trata de que os familiaricéis con el uso de variables.
 * Vamos a hacer diferentes acciones con ellas.
 * 
 * 1. Declarar variables de cada tipo sin valor.
 * 2. Asignarles un valor.
 * 3. Declarar nuevas variables asignándoles valores de las variables ya existentes.
 * 4. Declarar nuevas variables asignánoles un valor directamente.
 * 5. Practicar el uso de comentarios indicando en todo momento qué se está haciendo.
 * 6. Realiza operaciones entre variables numéricas
 *     - Operador de suma +
 *     - Operador de resta -
 *     - Operador de multiplicación *
 *     - Operador de división /
 *     - Operador de módulo % --> (opcional)
 * 7. Operaciones entre variables de diferentes tipos, cuidado con el tipo resultante.
 * 8. Operaciones entre números enteros (byte, short, int, long) cuyo resultado sea decimal (float, double)
 * 
 * ----BONUS----
 * 9. ¿Se puede operar con char? ¿Cómo?
 * 
 * 
 * ====REALIZACION====
 * Para ver los resultados y comprobar que es lo correcto y esperado
 * System.out.println(); --> ve haciendo prints
 * Añade comentarios
 * // --> comentario de una línea
 * /* --> abre comentario multilínea
 * */ // cierra comentario multilínea


// No te olvides de la clase...

    // Necesitas método main...

        // Declara variables: byte, short, int, long, float, double, char, boolean

        // Asigna valor a las variables creadas

        // Declara NUEVAS variables, asignándoles el valor de variables creadas anteriormente
        // Reasigna el tipo mediante casteo en alguna de ellas, de ser necesario

        // Declara NUEVAS variables asignándoles valor, puedes hacer más de una de cada tipo

        // Experimenta con los operadores (+, -, *, /)
        // Recuerda que necesitas hacer ajustes en los tipos mediante casteo
        // Crea variables para los resultados, ejemplo: resultadoSuma


        public class B_VariablesYTipos {
            public static void main(String[] args) {
                boolean tieneO = false;
                String texto = "Hola";
        
                for (char l : texto.toUpperCase().toCharArray()) {
                    if (l == 'o') {
                        tieneO = true;
                    }
                }
        
                if (tieneO == true) {
                    System.out.println("Tiene la letra 'O'");
                } else {
                    System.out.println("No contiene la 'O'");
                }
            }
        }
