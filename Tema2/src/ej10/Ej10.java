package ej10;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		boolean condición2;
		boolean condición3;
		boolean condición4;
		// Declaro las variables
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número entero: ");
		// System out para pregunttar por el valor de n1
		n1 = sc.nextInt();
		// n1 = scanner para introducir n1 con el teclado
		System.out.println("Introduzca otro número entero: ");
		// System out para pregunttar por el valor de n2
		n2 = sc.nextInt();
		// n2 = scanner para introducir n2 con el teclado
		System.out.println("Introduzca un número entero más: ");
		// System out para pregunttar por el valor de n3
		n3 = sc.nextInt();
		// n3 = scanner para introducir n3 con el teclado
	
		condición2 = (n1+n2==n3);
		// condición de que si n1+n2 sea igual a n3
		condición3 = (n1+n3==n2);
		// condición de que si n1+n3 sea igual a n2
		condición4 = (n3+n2==n1);
		// condición de que si n3+n2 sea igual a n31	
		if (condición2) {
			System.out.println("El primer número (" + n1 + ") más el segundo número (" + n2 + ") es igual al tercer número (" + n3 + ")");
		// if + condición2 para que si la condición2 se cumple salga el system out con el mensaje de abajo
		}else if (condición3) {
			System.out.println("El primer número (" + n1 + ") más el tercer número (" + n3 + ") es igual al segundo número (" + n2 + ")");
		// else if + condición3 para que si la condición2 no se cumple y la condición3 se cumple salga el system out con el mensaje de abajo
		}else if (condición4) {
			System.out.println("El tercer número (" + n3 + ") más el segundo número (" + n2 + ") es igual al primer número (" + n1 + ")");
		// else if + condición4 para que si la condición2 no se cumple, la condición 3 tampoco se cumple y la condición4 se cumple salga el system out con el mensaje de abajo
		}else {
			System.out.println("El/Los número/s introducido no es válido");
		// else final para por si no se cumple ningun if/else if salga el mensaje del system out
			
		sc.close();
		// cierro el scanner
		
	

	}

}}
