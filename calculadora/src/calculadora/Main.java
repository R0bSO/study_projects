package calculadora;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		char operacao;
		double val1, val2, resultado;
		String decisao; // define se sera feito novas operacoes ou se o programa pode fechar
		resultado = 0; // impedindo alocacao impropria de memoria

		Locale.setDefault(Locale.US); //substituindo virgula por ponto quando forem escritos os numeros

		Scanner op = new Scanner(System.in);

		do {

			System.out.println("Qual operação o senhor deseja realizar?");
			System.out.println("Para essa resposta, escreva M para adição, S para subtração, V para multiplicação e D para divisão");
			operacao = op.next().charAt(0); // se descobre aqui qual operacao sera feita

			switch(operacao)
			{

			case 'M': // caso o user peca por adicao

				System.out.println("Digite o valor do primeiro número:");
				val1 = op.nextDouble();
				System.out.println("Muito bem! Agora, digite o segundo número a ser calculado:");
				val2 = op.nextDouble();

				resultado = val1 + val2;

				System.out.println("O RESULTADO OBTIDO DE " + val1 + " + " + val2 + "É = " + resultado);
				break;

			case 'S': // caso o user peca por subtracao

				System.out.println("Digite o valor do primeiro número:");
				val1 = op.nextDouble();
				System.out.println("Muito bem! Agora, digite o segundo número a ser calculado:");
				val2 = op.nextDouble();

				resultado = val1 - val2;

				System.out.println("O RESULTADO OBTIDO DE " + val1 + " - " + val2 + "É = " + resultado);

				break;

			case 'V': // o pc executara esse case se o user pedir multiplicacao

				System.out.println("Digite o valor do primeiro número:");
				val1 = op.nextDouble();
				System.out.println("Muito bem! Agora, digite o segundo número a ser calculado:");
				val2 = op.nextDouble();

				resultado = val1 * val2;

				System.out.println("O RESULTADO OBTIDO DE " + val1 + " VEZES " + val2 + " É = " + resultado);
				break;

			case 'D': // pra divisao

				System.out.println("Digite o valor do primeiro número:");
				val1 = op.nextDouble();
				System.out.println("Muito bem! Agora, digite o segundo número a ser calculado:");
				val2 = op.nextDouble();

				if(val2 != 0) // Para impedir divisao por zero
				{

					resultado = val1 / val2;

					System.out.println("O RESULTADO OBTIDO DE " + val1 + " DIVIDIDO POR " + val2 + "É = " + String.format("%,4f", resultado));
				}

				else
				{
					System.out.println("Atenção! divisão por 0 não é permitida!");
				}

				break;

			default:
				System.out.println("A pergunta não foi apropriadamente respondida!");
				System.out.println();

			} // encerra o switch

			System.out.println("Deseja encerrar o programa?");
			op.nextLine(); //limpeza de buffer
			decisao = op.nextLine();

		} // encerra o do-while
		while(!decisao.equalsIgnoreCase("sim"));

		System.out.println("Obrigado por ter me escolhido e espero ter ajudado. Tenha um bom dia!");
		System.out.println();
		System.out.println("Digite ENTER para encerrar o programa...");
		op.nextLine(); // aqui, o programa ja acabou, isso serve so para o user poder ver a ultima mensagem

		op.close();

	}

}