package entities;

public class Notas {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double notaFinal () {
		return n1 + n2 +n3;
	}

	public double faltaFinal () {
		return 6 - (n1 + n2 +n3);
	}
	
	public String toString() {
		return "Nome do aluno - " + nome
				+ " Nota 1 bimestre " + String.format("%.2f", n1)
				+ " Nota 2 bimestre " + String.format("%.2f", n2)
				+ " Nota 1 bimestre " + String.format("%.2f", n3);
	}

}
