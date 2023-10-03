package ej2;

import java.util.Scanner;

public class Ej2 {

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
		if  (n1 == n2){
			System.out.println("Los números son iguales ");
		}else {
			System.out.println("Los números no son iguales ");
			
		sc.close();

	}

}}
