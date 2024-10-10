package entities;

public class RelRH {
	
	public String nome;
	public double salario;
	public double imposto;
	public double dissidio;
	
    public double SalLiquido () {
		return salario - (salario * (imposto/100));    	
    }
    
    public double SalCorrigido () {
    	return salario * (1+(dissidio/100));
    }
    
	public String toString() {
		return nome
			   + ", $ " + String.format("%.2f", salario)
			   + ", " + String.format("%.2f", imposto) + " %"
			   + ", " + String.format("%.2f", dissidio)
			   + ", $ " + String.format("%.2f", SalCorrigido());
	}

}
