package pkglacosderepeticao;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		int a,b,c, maior;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: ");
		a = ler.nextInt();
		
		System.out.print("Informe o valor de B: ");
		b = ler.nextInt();
		
		System.out.print("Informe o valor de C: ");
		c = ler.nextInt();

		
		if(a>b && a>c) {
			System.out.println("O valor de A: " + a + " � o maior valor inserido");
		}else if(b>a&&b>c) {
			System.out.println("O valor de B " + b + " � o maior valor inserido");
		}else{
			System.out.println("O valor de C: " + c + " � o maior valor inserido");
		}
	}

}
