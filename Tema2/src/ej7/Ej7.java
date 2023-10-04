package ej7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		int n1;
		boolean condición1;
		boolean condición2;
		boolean condición3;
		boolean condición4;
		boolean condición5;
		// Declaro la variable
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número: ");
		n1 = sc.nextInt();
		condición1 = (n1>99999)||(n1<0);
		condición2 = (n1>=100) && (n1<=999);
		condición3 = (n1>=1000) && (n1<=9999);
		condición4 = (n1>=10000) && (n1<=99999);
		condición5 = (n1>=10) && (n1<=99);
	
		if  (condición1){
			System.out.println("El número introducido no es válido");
		}else if (n1<10) {
			System.out.println("El número tiene 1 cifra");
		}else if (condición5) {
			System.out.println("El número tiene 2 cifras");
		}else if (condición2) {
			System.out.println("El número tiene 3 cifras");
		}else if (condición3) {
			System.out.println("El número tiene 4 cifras");
		}else if (condición4) {
			System.out.println("El número tiene 5 cifras");
		}else {
			System.out.println("El número introducido no es válido");
			
		sc.close();

	}

}}
