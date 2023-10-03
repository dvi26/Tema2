package ej7;

import java.util.Scanner;

public class Ej7 {||

	public static void main(String[] args) {
		int n1;
		boolean condición1;
		boolean condición2;
		boolean condición3;
		boolean condición4;
		// Declaro la variable
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número: ");
		n1 = sc.nextInt();
		condición1 = (n1>99999)||(n1<0);
		if  (condición1){
			System.out.println("El número introducido no es válido");
		}else if (n1<10) {
			System.out.println("El número tiene 1 cifra");
		}else if (n1=>10) {
			System.out.println("El número tiene 1 cifra");
		}else if (n1<10) {
			System.out.println("El número tiene 1 cifra");
		}else if (n1<10) {
			System.out.println("El número tiene 1 cifra");
		}else if (n1<10) {
			System.out.println("El número tiene 1 cifra");

	}

}
