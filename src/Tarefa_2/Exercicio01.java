package Tarefa_2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		pessoa pes = new pessoa();
		
		System.out.print("Digite seu nome: ");
		pes.name = sc.next();
		
		System.out.print("Digite sua idade: ");
		pes.idade = sc.nextInt();	
		
		System.out.println("Seu nome: "+pes.name+"\nSua idade: "+ pes.idade);
		
		System.out.println("Você fez aniversario!!");
		
		double aniversario = 1;
		pes.aniversario(aniversario);
		
		System.out.print("Seu nome: "+pes.name+"\nSua idade: "+ pes.idade);
		
		System.out.println("");
		
		System.out.println("Se passaram 2 anos!!");
		aniversario = 1;
		pes.aniversario(aniversario);
		
		aniversario = 1;
		pes.aniversario(aniversario);
		
		System.out.print("Seu nome: "+pes.name+"\nSua idade: "+ pes.idade);
		
		sc.close();
	}

}
