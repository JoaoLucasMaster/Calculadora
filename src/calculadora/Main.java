package calculadora;
import java.util.Scanner;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		calc calc = new calc();

		//Menu

		System.out.println(">>> Calculator by Jhon Lucky <<<");
		System.out.println("1- Soma");
		System.out.println("2- Subtracao");
		System.out.println("3- Divisao");
		System.out.println("4- Multiplicacao");
		System.out.println("0- Sair");

		//Seleção 

		Number firstValue;
		Number secondValue;

		Scanner readOperation = new Scanner(System.in);
		Scanner readOne = new Scanner(System.in);
		Scanner readTwo = new Scanner(System.in);
		int select;
		do {
			System.out.println("Digite um numero para escolher uma opcao do menu: ");

			select = readOperation.nextInt();

			//Soma

			if(select == 1) {
				System.out.println("Escreva o primeiro numero da conta: ");
				firstValue  =  readOne.nextInt();
				System.out.println("Escreva o segundo numero da conta: ");
				secondValue = readTwo.nextInt();
				System.out.println("Soma: " + calc.sum(firstValue, secondValue));
			}

			//Subtracao

			if(select == 2) {
				System.out.println("Escreva o primeiro numero da conta: ");
				firstValue  =  readOne.nextInt();
				System.out.println("Escreva o segundo numero da conta:  ");
				secondValue = readTwo.nextInt();
				System.out.println("Subtracao: " + calc.sub(firstValue, secondValue));
			}

			//Divisao

			if(select == 3) {
				System.out.println("Escreva o primeiro numero da conta: ");
				firstValue  =  readOne.nextInt();
				System.out.println("Escreva o segundo numero da conta:  ");
				secondValue = readTwo.nextInt();


				if(secondValue.intValue() == 0) {
					System.out.println("Operacao impossivel");
				}
				else {

					System.out.println("divisao: " + calc.div(firstValue, secondValue));
				}
			}

			//Multiplicacao

			if(select == 4) {
				System.out.println("Escreva o primeiro numero da conta: ");
				firstValue  =  readOne.nextInt();
				System.out.println("Escreva o segundo numero da conta:  ");
				secondValue = readTwo.nextInt();
				System.out.println("Multiplicacao: " + calc.mult(firstValue, secondValue));
			}


			//operacao invalida

			if(select > 4) {
				System.out.println("Operacao Invalida");
			}

			List<String> operations = calc.getLastOperation();
			System.out.println("Contas já calculadas:");
			for (String operation : operations) {
				System.out.println(operation);
			}


		}while(select != 0);
	}
}
