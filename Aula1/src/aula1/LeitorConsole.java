package aula1;

import java.util.Scanner;

public class LeitorConsole {
	public static void main(String[] args) {		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		
		String nome = leitor.next();
		
		System.out.println("Ola! " + nome);
	}
}
