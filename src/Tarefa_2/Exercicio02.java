package Tarefa_2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		porta porta = new porta();
		
		System.out.println("A porta esta aberta? (sim/não)");
		porta.aberta = sc.next();

		if(porta.aberta.equals("sim")) 
		{
			porta.aberta = "aberta";
		}
		else 
		{
			porta.aberta = "fechada";
		}
		
		System.out.println("Qual a cor da porta?");
		porta.cor = sc.next();
		
		System.out.println("Digite a dimensão X");
		porta.x = sc.nextDouble();
		
		System.out.println("Digite a dimensão Y");
		porta.y = sc.nextDouble();
		
		System.out.println("Digite a dimensão Z");
		porta.z = sc.nextDouble();
		
		System.out.println("Informações da porta\n\nStatus: "+porta.aberta+"\nCor: "+ porta.cor+"\nx: "+porta.x+" "
				+ "y: "+porta.y+" z: "+porta.z);
		
		System.out.println("Altere a cor da porta:");
		String pintar = sc.next();
		porta.pintar(pintar);
		
		System.out.println("Informações da porta\n\nStatus: "+porta.aberta+"\nCor: "+ porta.cor+"\nx: "+porta.x+" "
				+ "y: "+porta.y+" z: "+porta.z);
		
		System.out.println("Deseja abrir a porta? (sim/não)");
		String abrir = sc.next();
		if(abrir.equals("sim")) {
			abrir = "aberta";
		}else {
			abrir = "fechada";
		}
		porta.abrirPorta(abrir);
		
		System.out.println("Informações da porta\n\nStatus: "+porta.aberta+"\nCor: "+ porta.cor+"\nx: "+porta.x+" "
				+ "y: "+porta.y+" z: "+porta.z);
		
		System.out.println("Altere as dimensões da porta(x;y;z)");
		porta.x = sc.nextDouble();
		porta.y = sc.nextDouble();
		porta.z = sc.nextDouble();
		
		System.out.println("Informações da porta\n\nStatus: "+porta.aberta+"\nCor: "+ porta.cor+"\nx: "+porta.x+" "
				+ "y: "+porta.y+" z: "+porta.z);
		
		sc.close();
	}

}
