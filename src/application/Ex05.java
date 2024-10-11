package application;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1- Região Norte\n" + "2- Região Nordeste\n" + "3- Região Centro-Oeste\n" + "4- Região Sul\n"
				+ "Selecione: ");
		int option = sc.nextInt();

		System.out.print("Ida e Volta? (S/N) ");
		char idaVolta = sc.next().toUpperCase().charAt(0);

		double preco = 0;
		switch (option) {
		case 1:
			preco = (idaVolta == 'S') ? 900 : 500;
			
			break;
		case 2:
			preco = (idaVolta == 'S') ? 650 : 350;

			break;
		case 3:
			preco = (idaVolta == 'S') ? 600 : 350;

			break;
		case 4:
			preco = (idaVolta == 'S') ? 550 : 600;

			break;

		default:
			System.out.println("Destino Inválido!");
			break;
		}
		
		System.out.printf("Valor total da viagem: R$ %.2f", preco);

		sc.close();
	}

}
