package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int n1;
		int n2;
		// Declaro la variable
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca otro número: ");
		n2 = sc.nextInt();
		if  (n1 > n2){
			System.out.println("El primer número: " + n1 + ", es mayor que el segundo número: " + n2);
		}else {
			System.out.println("El segundo número: " + n2 + ", es mayor que el primer número: " + n1 );
			
		sc.close();

	}

}}
