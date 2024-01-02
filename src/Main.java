import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean executando = true;
		double resultado = 0;
		Scanner sc = new Scanner(System.in);

		while (executando) {
			System.out.println("Calculadora em Java");
			System.out.println("Digite o Primeiro Número:");
			var n1 = sc.nextDouble();

			System.out.println("Escolha uma Operação:");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração ");
			System.out.println("3 - Multiplicação ");
			System.out.println("4 - Divisão");
			System.out.println("5 - Potenciacão");
			System.out.println("6 - Raiz Quadrada");
			Integer operacao = sc.nextInt();

			switch (operacao) {
				case 1:
					System.out.println("Digite o Segundo Número");
					resultado = n1 + sc.nextDouble();
					;
					System.out.println(" O Resultado é:" + resultado);
					break;
				case 2:
					System.out.println("Digite o Segundo Número");
					resultado = n1 - sc.nextDouble();
					System.out.println(" O Resultado é:" + resultado);
					break;
				case 3:
					System.out.println("Digite o Segundo Número");
					resultado = n1 * sc.nextDouble();
					System.out.println(" O Resultado é:" + resultado);
					break;
				case 4:
					System.out.println("Digite o Segundo Número");
					if (sc.nextDouble() != 0) {
						resultado = n1 / sc.nextDouble();
						System.out.println(" O Resultado é:" + resultado);
					} else {
						System.out.println("Erro: Não é Possivel Dividir por 0!");
						continue;
					}
					break;
				case 5:
					System.out.println("Digite o Expoente para a Potenciação");
					double expoente = sc.nextDouble();
					resultado = Math.pow(n1, expoente);
					System.out.println(" O Resultado é:" + resultado);
					break;
				case 6:
					resultado = Math.sqrt(n1);
					System.out.println(" O Resultado é:" + resultado);
					break;
				default:
					System.out.println("Erro: Operação Inválida!");
					break;
			}

			System.out.println("----------------");
			System.out.println("Deseja Realizar outra Operação?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			var resposta = sc.nextInt();

			switch (resposta) {
				case 1:
					executando = true;
					break;
				case 2:
					executando = false;
					break;
				default:
					executando = false;
					System.out.println("Erro: Opção Inválida");
					break;
			}
		}
		sc.close();
	}

}
