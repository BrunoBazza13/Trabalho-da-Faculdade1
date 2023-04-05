package ado_2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Lista lista = new Lista();

		int i = 0;
		int op = 0;
		int valor = 0;

		lista.geraLista();

		do {

			System.out.println("\n ----------- MENU ----------- \n");
			System.out.println("1- Inserir dados");
			System.out.println("2- Listar dados");
			System.out.println("3- Remove do inicio");
			System.out.println("4- Busca");
			System.out.println("5- Libera a Lista");
			System.out.println("6- Adiciona Ordenado");
			System.out.println("7- Tamanho da lista");

			op = entrada.nextInt();
			switch (op) {

			case 1:

				System.out.println("\n Quantos numeros deseja inserir?");
				int tamanho = entrada.nextInt();
				entrada.nextLine();

				for (i = 0; i < tamanho; i++) {
					System.out.printf("Insira o %d numero: ", i + 1);
					int num = entrada.nextInt();

					lista.adiciona(num);

				}

				break;

			case 2:

				System.out.println("\n Imprime dados");
				lista.imprimeLista();
				break;

			case 3:

				System.out.println("\n Remove do inicio");
				lista.removeInicio();
				lista.imprimeLista();
				break;

			case 4:

				System.out.println("\n Busca valores \n");

				System.out.println("Qual valor deseja buscar?");
				int num = entrada.nextInt();

				No busca = lista.busca(num);

				System.out.println("Valor encontrado: " + busca.getDado());
				break;

			case 5:

				System.out.println("\n Lista liberada! \n");
				lista.free();

				break;

			case 6:

				System.out.println("\n Quantos numeros deseja inserir?");
				int tamanho1 = entrada.nextInt();
				entrada.nextLine();

				for (i = 0; i < tamanho1; i++) {
					System.out.printf("Insira o %d numero: ", i + 1);
					int num1 = entrada.nextInt();

					lista.adicionaOrdenado(num1);

				}

				break;

			case 7:

				System.out.println("\n Tamanho da lista");

				System.out.println("A lista tem " + lista.obterTamanho() + " elementos.");

				break;

			default:
				System.out.println("\n Numero invalido");

			}

			System.out.println("\n Deseja continuar?");
			System.out.println("0- sim");
			System.out.println("8- não \n");
			valor = entrada.nextInt();
			entrada.nextLine();

		} while (valor != 8);

	}

}
