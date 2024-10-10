package entitiesSec9;

public class DadosCliente {

	private String nroConta;
	private String nome;
	private double depInicial;
	private double deposito;
	private double retirada;
	private double saldo = depInicial;

	public DadosCliente() {
	}

	public DadosCliente(String nroConta, String nome, double depInicial, double taxaDeposito, double deposito,
			double saldo, double valorDepositado, double valorRetirada, double retirada) {
		super();
		this.nroConta = nroConta;
		this.nome = nome;
		this.depInicial = depInicial;
		this.deposito = deposito;
		this.retirada = retirada;
	}

	public DadosCliente(String nroConta, String nome, double depInicial, double deposito, double retirada) {
		this.nroConta = nroConta;
		this.nome = nome;
		this.depInicial = depInicial;
		this.deposito = deposito;
		this.saldo = saldo;
		this.retirada = retirada;
	}

	public String getNroConta() {
		return nroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDepInicial() {
		return depInicial;
	}

	public void setDepInicial(double depInicial) {
		this.depInicial = depInicial;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getRetirada() {
		return retirada;
	}

	public void setRetirada(double retirada) {
		this.retirada = retirada;
	}

	public double getSaldo() {
		return saldo;
	}

	public void addSaldo(double saldo) {
		this.saldo += saldo;
	}

	public double totalSaldo() {
		saldo = saldo + depInicial + deposito;
		if (retirada > 0) {
			saldo = saldo - (retirada + 5.00);
		}
		return saldo;
	}

	public String toString() {
		return "Conta : " + nroConta + 
				" ,Nome: " + nome + 
				",  Saldo final: $ " + totalSaldo();
	}

}
