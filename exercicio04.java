package pkglacosderepeticao;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		int x;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Descobrindo se um n�mero � par ou �mpar");
		
		System.out.print("Informe um n�mero: ");
		x = ler.nextInt();
		
		if(x%2 ==0) {
			System.out.println("O n�mero " + x + " � par");
			System.out.println("A raiz quadrada deste n�mero �: " + Math.sqrt(x));
		}else {
			System.out.println("O n�mero " + x + " � �mpar");
			System.out.println("Elevando ao quadrado o resultado �: " + Math.pow(x, 2));
		}
	}

}
