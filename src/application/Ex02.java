package application;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Últimos 4 números da placa do veículo: ");
		String placa = sc.nextLine();
		
		char digito = placa.charAt(placa.length() - 1);
		switch (digito) {
		case '1':
		case '2': 
			System.out.println("Rodízio na segunda-feira");
			break;
		case '3': 
		case '4':
			System.out.println("Rodízio na terça-feira");
			break;
		case '5':
		case '6':
			System.out.println("Rodízio na quarta-feira"); 
			break;
		case '7':
		case '8': 
			System.out.println("Rodízio na quinta-feira"); 
			break;
		case '9':
		case '0': 
			System.out.println("Rodízio na sexta-feira"); 
			break;
		default:
			break;
		}
		
		sc.close();
	}

}
