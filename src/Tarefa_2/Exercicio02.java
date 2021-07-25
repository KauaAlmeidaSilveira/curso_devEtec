package Tarefa_2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		porta porta = new porta();
		
		System.out.println("A porta esta aberta? (sim/n�o)");
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
		
		System.out.println("Digite a dimens�o X");
		porta.x = sc.nextDouble();
		
		System.out.println("Digite a dimens�o Y");
		porta.y = sc.nextDouble();
		
		System.out.println("Digite a dimens�o Z");
		porta.z = sc.nextDouble();
		
		System.out.println("Informa��es da porta\n\nStatus: "+porta.aberta+"\nCor: "+ porta.cor+"\nx: "+porta.x+" "
				+ "y: "+porta.y+" z: "+porta.z);
		
		System.out.println("Altere a cor da porta:");
		String pintar = sc.next();
		porta.pintar(pintar);
		
		System.out.println("Informa��es da porta\n\nStatus: "+porta.aberta+"\nCor: "+ porta.cor+"\nx: "+porta.x+" "
				+ "y: "+porta.y+" z: "+porta.z);
		
		System.out.println("Deseja abrir a porta? (sim/n�o)");
		String abrir = sc.next();
		if(abrir.equals("sim")) {
			abrir = "aberta";
		}else {
			abrir = "fechada";
		}
		porta.abrirPorta(abrir);
		
		System.out.println("Informa��es da porta\n\nStatus: "+porta.aberta+"\nCor: "+ porta.cor+"\nx: "+porta.x+" "
				+ "y: "+porta.y+" z: "+porta.z);
		
		System.out.println("Altere as dimens�es da porta(x;y;z)");
		porta.x = sc.nextDouble();
		porta.y = sc.nextDouble();
		porta.z = sc.nextDouble();
		
		System.out.println("Informa��es da porta\n\nStatus: "+porta.aberta+"\nCor: "+ porta.cor+"\nx: "+porta.x+" "
				+ "y: "+porta.y+" z: "+porta.z);
		
		sc.close();
	}

}
