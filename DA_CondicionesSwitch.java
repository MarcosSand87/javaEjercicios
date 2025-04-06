
public class DA_CondicionesSwitch {
    // 1. Indica numéricamente (del 1 al 7) el día de la semana
    // según el número que sea que muestre por pantalla 
    // el día de la semana en palabras (Lunes, Martes, Miércoles...)
    public static void ejercicio1() {
            int dia = 8;
            switch (dia) {
              case 1:
                System.out.println("Lunes");
                break;
              case 2:
                System.out.println("Martes");
                break;
              case 3:
                System.out.println("Miercoles");
                break;
              case 4:
                System.out.println("Jueves");
                break;
              case 5:
                System.out.println("Viernes");
                break;
              case 6:
                System.out.println("Sabado");
                break;
              case 7:
                System.out.println("Domingo");
                break;
                default:
    System.err.println("no existe");
        }
    }

    // 2. Calificación con letra
    // A = Excelente, B = Notable, C = Aprobado, D = Insuficiente
    public static void ejercicio2() {
        char nota = 'A';
        switch(nota){
            case 'A':
            System.out.println("excelente");
            break;
            case 'B':
            System.out.println("Notable");
            break;
            case 'C':
            System.out.println("Aprobado");
            break;
            case 'D':
            System.out.println("Insuficiente");
            break;
        }
        
    }

    // 3. Menú de opciones: genera un menú para iniciar un juego
    // que tenga varias opciones:
    // 1 -> Seleccionaste Nueva partida
    // 2 -> Seleccionaste Cargar partida
    // 3 -> Seleccionaste Salir
    // Opción inválida

    public static void ejercicio3() {
        int num = 0;
     switch(num){
            case 1:
            System.out.println("nueva partida");
            break;
            case 2:
            System.out.println("Cargar partida");
            break;
            case 3:
            System.out.println("salir");
            break;
            case 0, 4, 5, 6, 7, 8, 9:
            System.out.println("opcion invalida");
            break;

     }
    }

    // 4. Estación del año: verifica en qué estación estás
    // declara una variable que contenga el nombre de la estación
    // verifica el nombre de la estación y cuando se dé el caso correcto
    // que muestre por pantalla: "Estás en [estacion]" 
    // [estacion] --> hace referencia al valor de la variable que 
    //                contiene el nombre de la estación
    public static void ejercicio4() {
        String nombre = "invierno";
        switch (nombre) {
            case "invierno":
            System.out.println("Estás en" + nombre + "." );
                break;
                case "primavera":
                System.out.println("Estás en" + nombre + "." );
                    break;
                    case "verano":
                    System.out.println("Estás en" + nombre + "." );
                        break;
                        case "otoño":
                        System.out.println("Estás en" + nombre + "." );
                            break;
        }
    }

    // 5. Tipo de figura geométrica
    // 3 -> triángulo
    // 4 -> cuadrado o rectángulo
    // 5 -> pentágono
    // 6 -> hexágono
    public static void ejercicio5() {
        int num = 3;
        switch(num){
            case 3:
            System.out.println("triangulo");
            break;
            case 4:
            System.out.println("cuadrado o rectángulo");
            break;
            case 5:
            System.out.println("pentágono");
            break;
            case 6:
            System.out.println("hexágono");
            break;
    }
    }

    // 6. Tipo de moneda
    // USD -> Dolar
    // EUR -> Euro
    // GBP -> Libra
    // JPY -> Yen
     public static void ejercicio6() {
        String tipoMoneda;
        String moneda = switch(tipoMoneda){
            case USD -> "Dolar";
            case EUR -> "Euro";
            case GBP -> "Libra";
            case JPY -> "Yen";
            default -> "otras";
        };
        System.out.println("el tipo de moneda es " + moneda);
    }

    // 7. Número de mes: verifica el mes según su número (del 1 al 12)
    // Enero, Febrero...
     public static void ejercicio7() {
         int numeroMes = 3;
                   String meses = switch(numeroMes){
                                      case 1 -> "enero";
                                      case 2 -> "febrero";
                                      case 3 -> "marzo";
                                      case 4 -> "abril";
                                      case 5 -> "mayo";
                                      case 6 -> "junio";
                                      case 7 -> "julio";
                                      case 8 -> "agosto";
                                      case 9 -> "septiembre";
                                      case 10 -> "octubre";
                                      case 11 -> "noviembre";
                                      case 12 -> "diciembre";
                                      default -> "no existe";
                                  };
                                  System.out.println("Es el mes de "+ meses);
     }

    // 8. Clasificación por edad y periodo escolar
    // de 3 a 5 años: Infantil
    // de 6 a 11 años: Primaria
    // de 12 a 15 años: ESO
    // de 16 a 17 años: Bachillerato
    // de 18 a 21 años: Universidad
    // de 22 en adelante: Persona formada
    public static void ejercicio8() {
        int anos = 3;
        String periodoEscolar = switch(anos){
            case 3, 4, 5 ->            "infantil";
            case 6, 7, 8, 9, 10, 11 -> "primaria";
            case 12, 13, 14, 15 ->     "ESO";
            case 16, 17 ->             "bachillerato";
            case 18, 19, 20, 21 ->     "universidad";
            default ->                 "persona formada";
        };
        System.out.println("estas en el curso " + periodoEscolar);
    }

    // 9. Letra del DNI para un número fijo
    // Para calcular la letra se divide el número del DNI
    // entre 23 y el resto indica la letra, según la tabla
    // que encontraréis en este link:
    // https://www.interior.gob.es/opencms/es/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/#:~:text=Por%20ejemplo%2C%20si%20el%20n%C3%BAmero,n%C3%BAmeros%20y%20d%C3%ADgito%20de%20control.
    public static void ejercicio9() {
        

        
    }

    // 10. Estado de un semáforo
    public static void ejercicio10() {
        
    }

    // Método main para ejecutar todos los ejercicios
    public static void main(String[] args) {
        //ejercicio1(); 
        //ejercicio2(); 
        //ejercicio3(); 
        //ejercicio4(); 
        //ejercicio5();
        ejercicio6(); 
        //ejercicio7(); 
        //ejercicio8(); 
        //ejercicio9(); 
        //ejercicio10();
        // String cadena1 = "Hola";
        // String cadena2 = "Adiós";
        // boolean sonIguales = cadena1.equals(cadena2);
        // System.out.println("La cadena: " + cadena1
        // + "\nLa cadena: " + cadena2
        // + "\nSon iguales: " + sonIguales);
    }
}  