import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean executando = true;
		Scanner sc = new Scanner(System.in);
		while(executando) {
			System.out.println("Calculadora em Java");
			System.out.println("Digite o Primeiro Número");
			var numero1 = sc.nextInt();
			
			System.out.println("Escolha uma Operação");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
		    var operacao = sc.nextInt();
		    
			System.out.println("Digite o Segundo Número");
			var numero2 =sc.nextInt();
			Integer resultado= 0;
			
			switch(operacao){
			 case 1:
			  resultado =  numero1 + numero2;
			   break;
			 case 2:
			  resultado =  numero1 - numero2;
			    break;
			 case 3:
				 resultado = numero1 * numero2;
				 break;
			 case 4:
				 resultado = numero1 / numero2;
				 break;
				 default:
					 System.out.println("Operação Inválida");
			}
			System.out.println("-------");
			System.out.println(resultado);
			System.out.println("-------");
			System.out.println("Deseja Realizar outra operação?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			var resposta =sc.nextInt();
			
			switch(resposta) {
			case 1:
				executando = true;
				break;
			case 2:
				executando = false;
				break;
				default:
					System.out.println("Opção Inválida");
					break;
			}
			
	
		}
		sc.close();
	}

}
