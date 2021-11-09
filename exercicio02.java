package pkglacosderepeticao;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		int a,b,c;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: ");
		a = ler.nextInt();
		
		System.out.print("Informe o valor de B: ");
		b = ler.nextInt();
		
		System.out.print("Informe o valor de C: ");
		c = ler.nextInt();
		
		
		if(a<=b && b<=c) {
			System.out.printf("A Ordem Crescente é: %d - %d - %d",a,b,c);
		}
		else if(a<=c && c<=b) {
			System.out.printf("A Ordem Crescente é: %d - %d - %d",a,c,b);
		}
		else if(b<=a && a<=c) {
			System.out.printf("A Ordem Crescente é: %d - %d - %d",b,a,c);
		}
		else if(b<=c && c<=a) {
			System.out.printf("A Ordem Crescente é: %d - %d - %d",b,c,a);
		}
		else if(c<=a && a<=b) {
			System.out.printf("A Ordem Crescente é: %d - %d - %d",c,a,b);
		}else /*c<=b && b<=a*/{
			System.out.printf("A Ordem Crescente é: %d - %d - %d",c,b,a);
		}
	}

}
