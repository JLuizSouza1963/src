package EntitiesSec14;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	private double withdraw;

	private Account() {
	}

	public Account(Integer number, String holder, double balance, double withdrawLimit, double withdraw) throws DomainException {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
		this.withdraw = withdraw;
		double saldo = this.balance - this.withdrawLimit - this.withdraw; 
		if (saldo < 0) {
			throw new DomainException("O valor do saque excede o permitido");
		} else {
			this.balance = this.balance - this.withdraw;
		}
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void withDraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	@Override
	public String toString() {
		/*this.balance -= this.withdraw;*/
		return "Saldo atualizado :  " + this.balance;
	}
}
