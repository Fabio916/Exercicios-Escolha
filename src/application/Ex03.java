package application;

import java.util.Scanner;

public class Ex03 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Primeiro número: ");
			int num1 = sc.nextInt();
			
			System.out.print("Segundo número: ");
			int num2 = sc.nextInt();
			
			System.out.print("Escolha uma das opções: \n"
					+ "[1] Soma\n"
					+ "[2] Subtração\n"
					+ "[3] Multiplicação\n"
					+ "[4] Divisão\n"
					+ "Operação: ");
			int option = sc.nextInt();
			
			while (option < 1 || option > 4) {
				System.out.print("Valor inválido, selecione uma operação correta: \n"
						+ "[1] Soma\n"
						+ "[2] Subtração\n"
						+ "[3] Multiplicação\n"
						+ "[4] Divisão\n"
						+ "Operação: ");
				option = sc.nextInt();
			}
			
			double calc = 0;
			switch (option) {
			case 1 -> calc = num1 + num2; 
			case 2 -> calc = num1 - num2; 
			case 3 -> calc = num1 * num2; 
			case 4 -> calc = num1 / num2; 
			
			default ->
			throw new IllegalArgumentException("Unexpected value: " + option);
			}
			
			System.out.printf("Resultado da operação: %.1f", calc);
			
			
			sc.close();
		}
}
