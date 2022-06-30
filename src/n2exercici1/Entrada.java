package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	static Scanner entrada = new Scanner(System.in);
	
	//Mètodes a implantar capturant l'excepció de la classe InputMismatchException 
	public static byte llegirByte(String missatge) {
		byte entradaUser = 0;
		boolean control = false;
		
		do {
			try {
				System.out.println(missatge);
				entradaUser = entrada.nextByte();
				control = true;
			} catch (InputMismatchException e) {
				System.out.println("Debe introducir un valor del tipo byte");
				entrada.next();
			}
		} while (control == false);
		return entradaUser;
	}
	
	public static int llegirInt(String missatge) {
		int entradaUser = 0;
		boolean control = false;
		
		do {
			try {
				System.out.println(missatge);
				entradaUser = entrada.nextInt();
				control = true;
			} catch (InputMismatchException e) {
				System.out.println("Debe introducir un valor del tipo integer");
				entrada.next();
			}
		} while(control == false);
		return entradaUser;
	}
	
	public static float llegirFloat(String missatge) {
		float entradaUser = 0f;
		boolean control = false;
		
		do {
			try {
				System.out.println(missatge);
				entradaUser = entrada.nextFloat();
				control = true;
			} catch (InputMismatchException e) {
				System.out.println("Debe intoducir un valor del tipo float");
				entrada.next();
			}
		} while (control == false);
		return entradaUser;
	}
	public static double llegirDouble(String missatge) {
		double entradaUser = 0d;
		boolean control = false;
		
		do {
			try {
				System.out.println(missatge);
				entradaUser = entrada.nextDouble();
				control = true;
			} catch (InputMismatchException e) { 
				System.out.println("Debe introducir un valor del tipo double");
				entrada.next();
			}
		} while (control == false);
		return entradaUser;
	}
	
	//Mètodes a implantar capturant l'excepció de la classe Exception
	public static char llegirChar(String missatge) {
		char entradaUser = 'a';
		boolean control = false;
		
		do {
			try {
				System.out.println(missatge);
				entradaUser = entrada.next().charAt(0);
				control = true;
			} catch (Exception e) {
				System.out.println("Debe introducir un valor del tipo char");
				entrada.next();
			}
		
		} while (control == false);
		return entradaUser;
	}
	
	public static String llegirString(String missatge) {
		String entradaUser = "";
		boolean control = false;
		
		do {
			try {
				System.out.println(missatge);
				entradaUser = entrada.next();
				control = true;
		} catch (Exception e) {
			System.out.println("Debe introducir un valor del tipo String");
			entrada.next();
		}
		} while (control == false);
		return entradaUser;
	}
	public static boolean llegirSiNo(String missatge) {
		String entradaUser = "";
		boolean resultat = false;
		boolean control = false;
		
		do {
			try {
		System.out.println(missatge);
		entradaUser = entrada.next();
		if (entradaUser.equalsIgnoreCase("S")) {
			resultat = true;
			control = true;
		} else if (entradaUser.equalsIgnoreCase("N")) {
			resultat = false;
			control = true;
		}
			} catch (Exception e) {
				System.out.println("Debe introducir s en caso afirmativo o n en caso negativo");
				entrada.next();
			}
		} while (control == false);
		return resultat;
	}
}