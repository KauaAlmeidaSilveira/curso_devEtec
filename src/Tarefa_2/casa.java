package Tarefa_2;

public class casa {

	public String cor;
	public String porta1;
	public String porta2;
	public String porta3;

	public void pitarCasa(String pintar) {
		cor = pintar;
	}

	public String portasAbertas(){
		String port1;
		String port2;
		String port3;
		
		if(porta1.equals("aberta")) {
			port1 = "aberta";
		}else {
			port1 = "fechada";
		}
		
		if(porta2.equals("aberta")) {
			port2 = "aberta";
		}else {
			port2 = "fechada";
		}
		
		if(porta3.equals("aberta")) {
			port3 = "aberta";
		}else {
			port3 = "fechada";
		}
		
		return "Porta1: "+port1+"\nPorta2: "+port2+"\nPorta3: "+port3;
	}

	public void abrirPorta1(String abrir1) {
		porta1 = abrir1;
	}
	
	public void abrirPorta2(String abrir2) {
		porta2 = abrir2;
	}
	
	public void abrirPorta3(String abrir3) {
		porta3 = abrir3;
	}
}

