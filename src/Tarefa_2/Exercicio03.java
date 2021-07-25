package Tarefa_2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		casa casa = new casa();
		
		String aux1,aux2,aux3;
		
		System.out.println("Qual a cor da casa?");
		casa.cor = sc.next();
		
		System.out.println("A porta 1 esta aberta? (sim/não)");
		casa.porta1 = sc.next();
		
		if(casa.porta1.equals("sim")) {
			casa.porta1 = "aberta";
		}else {
			casa.porta1 = "fechada";
		}
		
		System.out.println("A porta 2 esta aberta? (sim/não)");
		casa.porta2 = sc.next();
		
		if(casa.porta2.equals("sim")) {
			casa.porta2 = "aberta";
		}else {
			casa.porta2 = "fechada";
		}
		
		System.out.println("A porta 3 esta aberta? (sim/não)");
		casa.porta3 = sc.next();
		
		if(casa.porta3.equals("sim")) {
			casa.porta3 = "aberta";
		}else {
			casa.porta3 = "fechada";
		}
		
		System.out.println("Infomações casa: "+casa.cor+"\n"+casa.portasAbertas());
		
		if(casa.porta1.equals("aberta")) {
			aux1="fechar";
		}else {
			aux1="abrir";
		}
		
		if(casa.porta2.equals("aberta")) {
			aux2="fechar";
		}else {
			aux2="abrir";
		}
		
		if(casa.porta3.equals("aberta")) {
			aux3="fechar";
		}else {
			aux3="abrir";
		}
		
		System.out.println("Deseja "+ aux1 +" a porta 1? (sim/não)");
		String abrir1 = sc.next();
		if(abrir1.equals("sim")) {
			abrir1 = "fechada";
		}else {
			abrir1 = "aberta";
		}
		casa.abrirPorta1(abrir1);
		
		System.out.println("Deseja "+ aux2 +" a porta 1? (sim/não)");
		String abrir2 = sc.next();
		if(abrir2.equals("sim")) {
			abrir2 = "fechada";
		}else {
			abrir2 = "aberta";
		}
		casa.abrirPorta2(abrir2);
		
		System.out.println("Deseja "+ aux3 +" a porta 1? (sim/não)");
		String abrir3 = sc.next();
		if(abrir3.equals("sim")) {
			abrir3 = "fechada";
		}else {
			abrir3 = "aberta";
		}
		casa.abrirPorta3(abrir3);
		
		System.out.println("Infomações casa: "+casa.cor+"\n"+casa.portasAbertas());
		
		System.out.print("Altere a cor da casa: ");
		String pintar = sc.next();
		casa.pitarCasa(pintar);
		
		System.out.println("Infomações casa: "+casa.cor+"\n"+casa.portasAbertas());
		sc.close();
	}

}
