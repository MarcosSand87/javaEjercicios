

import java.util.Scanner;

/*
 * Calcula el área de un rectángulo, triángulo o círculo.
 * [1] rectángulo
 * [2] triángulo
 * [3] círculo
 * [4] cerrar
 * 
 * Área rectángulo: base * altura
 * Área triángulo: (base * altura) / 2
 * Área círculo: PI * radio^2
 */
public class B_CalcularArea {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		  int[] numeros = {3, 5, 7, 2, 8};
          int suma = 0;// declaramos una variable en 0 sin darle valor

          for (int numero : numeros) {// se suma el valor de numero a la variable suma
              suma += numero;// en cada pasada se suma el valor de numero a la variable suma
          }

          System.out.println("La suma es: " + suma);
		int figura = 0;

		do {
			System.out.println("________________________________________________________________________");
			System.out.println("Calculadora");
			System.out.println("elije la forma que quieres");
			System.out.println("[1] rectángulo");
			System.out.println("[2] triángulo");
			System.out.println("[3] círculo");
			System.out.println("[4] cerrar");
			figura = in.nextInt();

			switch (figura) {
			case 1:
				rectangulo();
				break;
			case 2:
				triangulo();
				break;
			case 3:
				circulo();
				break;
			case 4:
				cerrar();
				break;

			default:
				System.out.println("ingrese un numero de 1 al 4 gracias");
			}

		} while (figura != 4);

	}

	private static void rectangulo() {
		System.out.println("area de un rectángulo");
		System.out.println("introduce la base");
		int base = in.nextInt();
		System.out.println("introduce la altura");
		int altura = in.nextInt();
		System.out.println("calcular area del rectángulo");
		double area = base * altura;
		System.out.println("El area del rectángulo es: " + area);

	}

	private static void triangulo() {
		System.out.println("area de un triángulo");
		System.out.println("introduce la base");
		int base = in.nextInt();
		System.out.println("introduce la altura");
		int altura = in.nextInt();
		System.out.println("calcular area del triángulo");
		double area = (base * altura) / 2;
		System.out.println("El area del triángulo es: " + area);

	}

	private static void circulo() {
		System.out.println("area de un círculo");
		System.out.println("introduce el radio");
		double radio = in.nextDouble();
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El area del circulo es: " + area);

	}

	private static void cerrar() {
		System.out.println("cerrado el programa");
	}
}

