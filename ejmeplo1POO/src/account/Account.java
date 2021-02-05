package account;

public class Account {
	private Double balance;
	public Account(Double balance) {
		this.balance = balance;
	}
	//Ingresar datos
	public void addBalance(Double money) {
		this.balance = this.balance + money;
	}
	public Boolean extracBalance(Double money) {
		if (this.balance >= money) {
			this.balance = this.balance - money;
			return true;
		}
		return false;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}
