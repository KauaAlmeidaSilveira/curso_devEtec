package Tarefa_2;

public class funcionario {
			
	public String name;
	public String departamento;
	public double slr;
	public double rg;
	
	public double ganhoAnual() {
		return slr*12;
	}

	public void aumentoSlr(double aumentoSlr) {
		slr+=aumentoSlr;
	}

	public String toString() {
		return "Dados do funcion�rio:\n Nome: "+ name +"\n Departamento: "+ departamento+ "\n Sal�rio: "+slr+"\n RG: "+ rg;
	}
}

