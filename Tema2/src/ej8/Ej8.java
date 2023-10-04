package ej8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		double n1;
		boolean condición1;
		boolean condición2;
		boolean condición3;
		boolean condición4;
		boolean condición5;
		boolean condición6;
		// Declaro la variable
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número real: ");
		n1 = sc.nextDouble();
		condición1 = (n1>10)||(n1<0);
		condición2 = (n1>=5) && (n1<6);
		condición3 = (n1>=6) && (n1<7);
		condición4 = (n1>=7) && (n1<9);
		condición6 = (n1>=9) && (n1<=10);
		condición5 = (n1>=0) && (n1<5);
	
		if  (condición1){
			System.out.println("El número introducido no es válido");
		}else if (condición5) {
			System.out.println("Es INSUFICIENTE");
		}else if (condición2) {
			System.out.println("es SUFICIENTE");
		}else if (condición3) {
			System.out.println("es BIEN");
		}else if (condición4) {
			System.out.println("es NOTABLE");
		}else if (condición6) {
			System.out.println("es SOBRESALIENTE");
		}else {
			System.out.println("El número introducido no es válido");
			
		sc.close();

	}

}}
