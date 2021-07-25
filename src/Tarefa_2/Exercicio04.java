package Tarefa_2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		funcionario func = new funcionario();
		
		System.out.print("Digite o nome do funcionario: ");
		func.name = sc.nextLine();
		
		System.out.print("Digite o departamento do funcionario: ");
		func.departamento = sc.nextLine();
		
		System.out.println("Digite o salário do funcionario: ");
		func.slr = sc.nextDouble();
		
		System.out.println("Digite o rg do funcionario: ");
		func.rg = sc.nextDouble();
		
		System.out.println(func);
		
		System.out.println("Digite a quantidade de aumento do salário: ");
		double aumentoSlr = sc.nextDouble();
		func.aumentoSlr(aumentoSlr);
		
		System.out.println(func);
		
		System.out.println("Ganho Anual: "+ func.ganhoAnual());
		
		sc.close();
	}

}

