package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		double n1;
		boolean condición;
		// Declaro la variable
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número decimal: ");
		n1 = sc.nextDouble();
		condición = (n1 < -1) || (n1 >1);
		if  (n1 == 0){
			System.out.println("El número no es un casi 0 ");
		}else if (n1 == -1){
			System.out.println("El número no es un casi 0 ");
		}else if (n1 == 1){
			System.out.println("El número no es un casi 0 ");
		}else if (n1 == -1){
			System.out.println("El número no es un casi 0 ");
		}else if (condición) {
			System.out.println("El número no es un casi 0 ");
		}else if (n1 < 1){
			System.out.println("El número es un casi 0 ");
		}else if (n1 < -1){
			System.out.println("El número es un casi 0 ");
		}else {
			System.out.println("El número no es un casi 0 ");
		}
		
			
		sc.close();

	}

}
