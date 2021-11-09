package pkglacosderepeticao;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Categoria Infantil");
		}else if(idade>=15 && idade<=17) {
			System.out.println("Categoria Juvenil");
		}else if(idade>=18 && idade<=25) {
			System.out.println("Categoria Adulto");
		}else {
			System.out.println("Idade não corresponde a nenhuma das categorias");
		}
	}

}
