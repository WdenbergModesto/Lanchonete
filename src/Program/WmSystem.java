package Program;

import java.util.Scanner;

public class WmSystem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int codigo, quantidade;
		float valorPago = 0;
		char opcao;
		char resp = 'N';

		do {
			System.out.println("\n\n1. LANCHONETE WM\n" 
					+ "ESCOLHA UMA OPÇÃO\n" 
					+ "\nCódigo 1 - Valor R$5,00 \n"
					+ "Código 2 - Valor R$3,50 \n" 
					+ "Código 3 - Valor R$4,80 \n" 
					+ "Código 4 - Valor R$8,90 \n"
					+ "Código 5 - Valor R$7,92 \n" 
					+ "6 - Sair do programa");
			opcao = scan.next().charAt(0);
			System.out.println("Qual a quantidade do produto: ");
			quantidade = scan.nextInt();
			switch (opcao) {
			case '1':
				valorPago1(valorPago, quantidade);
				break;
			case '2':
				valorPago2(valorPago, quantidade);
				break;
			case '3':
				valorPago3(valorPago, quantidade);
				break;
			case '4':
				valorPago4(valorPago, quantidade);
				break;
			case '5':
				valorPago5(valorPago, quantidade);
				break;
			case '6':
				System.out.println("Deseja realmente sair do programa? S/N");
				resp = Character.toUpperCase(scan.next().charAt(0));
				break;
			default:
				System.out.println("opção inválida. Tente novamente.");
				break;
			}

		} while (resp != 'S');
		System.exit(0);
	}

	static void valorPago1(double v, int q) {
		v = 5 * q;
		System.out.printf("Valor a pagar R$: %.2f", v);
	}

	static void valorPago2(double v, int q) {
		v = 3.5 * q;
		System.out.printf("Valor a pagar R$: %.2f", v);
	}

	static void valorPago3(double v, int q) {
		v = 4.8 * q;
		System.out.printf("Valor a pagar R$: %.2f", v);
	}

	static void valorPago4(double v, int q) {
		v = 8.9 * q;
		System.out.printf("Valor a pagar R$: %.2f", v);
	}

	static void valorPago5(double v, int q) {
		v = 7.92 * q;
		System.out.printf("Valor a pagar R$: %.2f", v);
	}

}
