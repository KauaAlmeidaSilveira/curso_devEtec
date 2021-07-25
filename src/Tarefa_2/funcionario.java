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
		return "Dados do funcionário:\n Nome: "+ name +"\n Departamento: "+ departamento+ "\n Salário: "+slr+"\n RG: "+ rg;
	}
}

