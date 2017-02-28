package zadaci_28_02_2017;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account (){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	Account (int id, double balance){
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest(){
		double monthlyInterestRate = getMonthlyInterestRate();
		return balance * (monthlyInterestRate / 100);
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
	}
	
	public void deposit(double amount){
		balance = balance + amount;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
				+ ", dateCreated=" + dateCreated + "]";
	}

	public static void main(String[] args) {
		//new account object
		Account ac1 = new Account(1122, 20000);
		ac1.setAnnualInterestRate(4.5);
		ac1.withdraw(2500);
		ac1.deposit(3000);
		System.out.println(ac1.toString());
		System.out.println("Balance is: " + ac1.getBalance() + "$.");
		System.out.println("Monthly interest is: " + ac1.getMonthlyInterest() + "$.");
		System.out.println("Account is created: " + ac1.getDateCreated() + ".");
	}
}
