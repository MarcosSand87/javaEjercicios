package MarcosSandin; 
// sección imports

import java.util.Scanner;
// declaración de la
public class ENTREGABLE_Blackjack {

    // Variables de clase
    static String[] deck = new String[52];                              // array de 52 cartas para almacenarlas
    static int deckIndex = 0;

    // método main
    public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);                         // sirve para ingresar datos por teclado.
         
        // Inicializar y barajar el mazo
        crearBaraja();
        barajarMazo(deck);
        
        // Manos de jugador y dealer (se asume máximo 12 cartas por mano)
        String[] jugador = new String[12];                          //crea una array para jugador tipo String para 12 cartas como maximo
        String[] dealer = new String[12];                            //crea una array para dealer tipo String para 12 cartas como maximo
        int cartasJugador = 0;                                     // variable inicializada en 0 por que el jugador no tiene cartas todavia.
        int cartasDealer = 0;                                     // variable inicializada en 0 por que el dealer no tiene cartas todavia.
        
        // Repartir dos cartas a cada uno
        for (int i = 0; i < 2; i++) {                                     // el bucle se ejecuta mientras que i sea menor que 2 
            jugador[cartasJugador++] = reparteCartas();
        }
        for (int i = 0; i < 2; i++) {                                     // el bucle se ejecuta mientras que i sea menor que 2 
            dealer[cartasDealer++] = reparteCartas();
        }
        
        // Muestra mensajes de inicialización del juego
        System.out.println("\n___________________ BLACKJACK ___________________\n");                        // imprime el titulo
        System.out.println("Empiezas a jugar: ");                                 // indica al jugador o que la partida va a comenzar
        printMano(jugador, cartasJugador);                                      // llma al metodo enseñar para mostrar las cartas actuales
        System.out.println("Tienes: " + calcularValorMano(jugador, cartasJugador));// imprime valor total de las cartas que tiene jugador
        
        // Turno del jugador: ve mostrando mensajes para poder controlar la dinámica y el avance de la partida por la consola.
        boolean turnoJugador = true;            // declara la variable boolean con valor true, esta activo permitiendo que while comience.
        while (turnoJugador) {                                      //Inicia un bucle while que se ejecuta mientras turnoJugador sea true.
            System.out.println("\n¿Quieres seguir jugando?\nsi-(pide carta),\nno-(se planta))\n");
            String seleciona = in.next();                                           // lee la entrada de teclado que introduzca el jugador
            
            if (seleciona.equalsIgnoreCase("si")) { //comprueba con (si). y distingue mayusculas y minusculas equalsIgnoreCase
                jugador[cartasJugador++] = reparteCartas();                                                  // añade una carta al jugador 
                System.out.println("Volvemos a jugar:");                       // como a selecionado si imprime mensaje volvemos a jugar
                printMano(jugador, cartasJugador);                                  // enseña las cartas al jugador 
                int valorJugador = calcularValorMano(jugador, cartasJugador);                     //guarda el valor total en valorJugador
                System.out.println("Tienes: " + valorJugador);                         // imprime por pantalla el valor total del jugador
                
                if (valorJugador > 21) {                                               // compureba si el valorJugador se pasa de 21
                    System.out.println("¡Te has pasado de 21. Perdiste");              // imprime por pantalla mensaje
                    return;                                                              // termina el metodo main saliendo del programa
                }
            } else if (seleciona.equalsIgnoreCase("no")) { // y si el jugador escribe no termina jugada comprueba con (no No)
                turnoJugador = false;                                           // cambia la condicion del while a false saliendo del bucle.
            }else{                                            // te hace escribir si o no no podiendo poner otra palabra diferente o numero
                System.err.println("Introduce si o no");                                // si el jugador tiene que introducir si y no 
            } 
        }
        // Muestra la primera carta y oculta la segunda
		System.out.println("\n Cartas del dealer: ");                                              //imprime mensaje las cartas del dealer
        System.out.println("\n" + dealer[0] + " [es la carta boca abajo] ");                                // te dice la carta boca abajo del dealer
        
        // Turno del dealer: debe pedir cartas hasta alcanzar al menos 17
        System.out.println("\nTurno del dealer:");                                     // imprime en consola que es el turno del dealer
        printMano(dealer, cartasDealer);                                        //llama al metodo enseña para muestra todas cartas del dealer
        int valorDealer = calcularValorMano(dealer, cartasDealer);//Calcula el valor total de la mano del dealer y lo almacena en la variable pedirCartasDealer.
        System.out.println("Valor del dealer: " + valorDealer);       // imprime el total de la mano del dealer

        while (valorDealer < 17) {                           // bucle while que se ejecuta mientras pedircartasdealer sea menor que 17
            dealer[cartasDealer++] = reparteCartas();               // como el valor es menor a 17 añade una carta desde el mazo de cartas
            System.out.println("El dealer pide carta:");           // imprime el mensaje por pantalla
            printMano(dealer, cartasDealer);                                                // muestra las cartas que tiene 
            valorDealer = calcularValorMano(dealer, cartasDealer);           // calculavalormano actual llamando al metodo mas abajo
            System.out.println("Tienes: " + valorDealer); // imprime el valor actual que tiene la mano del dealer
        }
        
        // Mostrar resultados finales
        int valorjugador = calcularValorMano(jugador, cartasJugador); // calcula valor final del dealer y lo amacena en la variable valorjugador
        System.out.println("\n=== RESULTADO FINAL ===\n");             // imprime partida terminada 
        System.out.println("Tu valor: " + valorjugador);                //imprime el valordeljugador en total
        System.out.println("Valor del dealer: " + valorDealer);   // imprime el valor total del dealer

        if (valorDealer > 21) {                                    // si pedircartasdealer es mayor a 21 el dealer se paso
            System.out.println("¡El dealer se pasó! Ganaste jugador.");         // imprime el dealer se paso 
        } else if (valorjugador > valorDealer) {     // y si no se paso de 21  ejecuta este bloque 
            System.out.println("¡Ganaste!");   // imprime mensaje ganastes al jugador
        } else if (valorDealer > valorjugador) { // y si no comprueba si el valor del dealer es mayor que el del jugador.
            System.out.println("Gana el dealer."); // imprime mensaje el dealer gana
        } else {                               //Si ninguna de las condiciones anteriores es verdadera, ejecuta este bloque por defecto.
            System.out.println("Empate.");  // imprime empate por consola
        }

    }
    
    // ===METODOS===
    // Inicializa el mazo con 52 cartas (combinando rangos y palos)
    public static void crearBaraja() {                                                            // publico estatico sin valor de retorno
        String[] palos = {" de picas", " de corazones", " de diamantes", " de tréboles"};                                         //inicializa un array de String con los cuatro palos
        String[] rangos = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};//inicializa un array de String con los 13 rangos
        int indice = 0; //verifica dónde se coloca cada carta en el array deck desde la primera posición (índice 0).
        
        for (int i = 0; i < palos.length; i++){ //sirve para mezclar los palos con rangos de forma externa
            for (int j = 0; j < rangos.length; j++) {//sirve para mezclar los palos con rangos de forma interna
                deck[indice++] = rangos[j] + palos[i]; //Crea una carta combinando un rango y un palo, y la almacena en la posición indice del array deck, incrementando indice después.            
            }
        }
    }

    // Baraja el mazo utilizando el algoritmo de Fisher-Yates
    public static void barajarMazo(String[] mazo) {//Define un método público, estático y sin valor de retorno (void) que baraja un array de String.
        for (int i = mazo.length - 1; i > 0; i--) {//Inicia un bucle que recorre el array desde el último elemento hasta el segundo (índices 51 a 1).
            int j = (int) (Math.random() * (i + 1));                                //Genera un índice aleatorio j entre 0 y i (inclusive).
            String temp = mazo[i];                                   //Almacena temporalmente el elemento en la posición i del array mazo.
            mazo[i] = mazo[j];                                   //Mueve una carta aleatoria de las posiciones 0 a i hacia la posición i.
            mazo[j] = temp;                                    //Completa el intercambio, asegurando que las dos cartas cambien de lugar.
        }
    }
    
    // Devuelve la siguiente carta del mazo
    public static String reparteCartas() {// devolver la próxima carta disponible del mazo barajado.
        return deck[deckIndex++]; //Devuelve la carta en la posición actual de deckIndex y luego incrementa deckIndex.
    }
    
    // Devuelve el valor inicial de la carta (A se considera 11; se ajustará luego)
        // Se asume que card es algo como "A♠", "10♥", "J♦", etc.
		public static int DevuelveValorCarta(String carta) {//un método público, estático, que retorna un entero (int) representando el valor inicial de una carta.
			String rango = carta.split(" de ")[0];//divide la cadena carta en el separador " de" y tomando la primera parte.
			switch (rango) {                                                    //evalua el rango para devolver el valor correspondiente.
				case "A":                                                       // si cuincide con a retorna el valor 11
                return 11;
				case "J":                                                      // si cuincide con j, q, k, retorna el valor de 10
                return 10;
                case "Q": 
                return 10;
                case "K": 
                return 10;
				default: return Integer.parseInt(rango);               //asigna el valor de 2 a 10 y retorna los demas numeros a enteros.
			}
		}
    // Calcula el valor total de una mano, ajustando el valor de los ases si es necesario
	public static int calcularValorMano(String[] mano, int numCartas) {//Define un método público, estático, que retorna un entero (int)
        int valor = 0;  //Declara e inicializa una variable para acumular el valor total de una mano.
        int ases = 0;   //Declara e inicializa una variable para contar el número de Ases en la mano.

        for (int i = 0; i < numCartas; i++) { //Inicia un bucle que recorre todas las cartas en la mano y cuenta los ases 
            int valorCarta = DevuelveValorCarta(mano[i]); // Obtiene el valor inicial de la carta actual llamando a DevuelveValorCarta.
            valor += valorCarta;                                                 // Suma el valor de la carta actual al total acumulado.
            if (mano[i].startsWith("A")) {                    // verifica si la carta es un as. con el emtodo de String starsWith.
                ases++;                                              // incrementa el contador de ases en 1 si la carta es un as
            }
        }
         // Ajustar el valor de los ases si se excede 21
        while (valor > 21 && ases > 0) { //Inicia un bucle que se ejecuta mientras el valor total supere 21 y haya Ases disponibles para ajustar
            valor -= 10;                                                      //Reduce el valor total en 10, cambiando un As de 11 a 1.
            ases--;                                                          //Disminuye el contador de Ases en 1.
        }
        return valor;                                                       // Devuelve el valor total ajustado de la mano.
    }

    // Imprime las cartas de una mano
	public static void printMano(String[] mano, int numCartas) {// //Define un método público, estático, sin valor de retorno 
        for (int i = 0; i < numCartas; i++) { //Recorre el array desde la posición 0 hasta numCartas-1
            System.out.println(mano[i] + " "); // imprime la carta en posicion i luego con un espacio
        }
        System.out.println();   // imprimer un salto de linea para que sea mas vistoso.
    }
}
    
