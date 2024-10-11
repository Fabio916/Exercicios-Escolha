package application;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cargo: \n"
				+ "1 EscrituráriO\n"
				+ "2 Secretária\n"
				+ "3 Caixa\n"
				+ "4 Gerente\n"
				+ "5 Diretor\n"
				+ "Opção desejada: ");
		int option = sc.nextInt();
		
		while (option < 0 || option > 5) {
			System.out.print("Valor inválido\n"
					+ "Insira novamente: ");
			option = sc.nextInt();
		}
		
		System.out.print("Salário: ");
		double salary = sc.nextDouble();
		
		switch (option) {
		case 1 -> salary += salary * 0.50;
		case 2 -> salary += salary * 0.35;
		case 3 -> salary += salary * 0.20;
		case 4 -> salary += salary * 0.10;
		case 5 -> salary = 0;
		default ->
		throw new IllegalArgumentException("Unexpected value: " + option);
		}
		
		if (salary != 0) {
			System.out.printf("Novo salário: R$ %.2f", salary);
		}else {
			System.out.println("Não tem aumento");
		}
		
		
		sc.close();
	}

}
