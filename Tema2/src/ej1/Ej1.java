package ej1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int número;
		int condición;
		// Declaro la variable
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número: ");
		número = sc.nextInt();
		condición = número % 2;
		if  (condición == 0){
			System.out.println("El número es par ");
		}else {
			System.out.println("El número es impar ");
			
		sc.close();
	}

}}
