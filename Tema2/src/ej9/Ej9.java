package ej9;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		String T1;
		String T2;
		boolean condición1;
		boolean condición2;
		boolean condición3;
		boolean condición4;
		boolean condición5;
		boolean condición6;
		// Declaro la variable
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Jugador 1 escriba PIEDRA, PAPEL o TIJERA: ");
		T1 = sc.nextLine();
		System.out.println("Jugador 2 escriba PIEDRA, PAPEL o TIJERA: ");
		T2 = sc.nextLine();
		condición1 = (T1=T2);
		condición2 = (PIEDRA!=T1) && (PAPEL!=T2);
		condición2 = (T1!=PAPEL) && (T2!=PIEDRA);
		condición3 = (T1!=TIJERA) && (T2!=PAPEL);
		condición4 = (T1!=PAPEL) && (T2!=TIJERA);
		condición5 = (T1!=PIEDRA) && (T2!=TIJERA);
		condición6 = (T1!=TIJERA) && (T2!=PIEDRA);	
		if  (condición1){
			System.out.println("Empate");
		}else if (condición2) {
			System.out.println("El ganador es el jugador 2");
		}else if (condición3) {
			System.out.println("El ganador es el jugador 1");
		}else if (condición3) {
			System.out.println("El ganador es el jugador 1");
		}else if (condición4) {
			System.out.println("El ganador es el jugador 2");
		}else if (condición5) {
			System.out.println("El ganador es el jugador 1");
		}else if (condición6) {
			System.out.println("El ganador es el jugador 2");
		}else {
			System.out.println("Introduzca PIEDRA, PAPEL O TIJERA EN MAYÚSCULAS");
			
		sc.close();

	}

}}
