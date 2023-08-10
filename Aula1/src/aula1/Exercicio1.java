package aula1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner gets = new Scanner(System.in);
		
		String nome = "";	
		int idade = 0;
		String data = "";
		
		System.out.println("Digite o seu nome: ");
	
		nome = gets.next();
		
		System.out.println("Digite a sua idade: ");
		
		idade = gets.nextInt();
		
		System.out.println("Digite a sua data de nascimento: ");
		
		data = gets.next();
		
		System.out.println("Nome do usuario: "
							+ nome + " tem "+ idade 
							+ " de idade e nasceu no dia "
							+ data);
		
		gets.close();
		
	}
}
