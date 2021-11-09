package pkglacosderepeticao;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		int x;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Descobrindo se um número é par ou ímpar");
		
		System.out.print("Informe um número: ");
		x = ler.nextInt();
		
		if(x%2 ==0) {
			System.out.println("O número " + x + " é par");
			System.out.println("A raiz quadrada deste número é: " + Math.sqrt(x));
		}else {
			System.out.println("O número " + x + " é ímpar");
			System.out.println("Elevando ao quadrado o resultado é: " + Math.pow(x, 2));
		}
	}

}
