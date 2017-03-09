package zadaci_09_03_2017;

import java.util.Date;


public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	Loan (){
		
	}
	
	Loan(double annualInterestRate, int numberOfYears, double loanAmount)throws IllegalArgumentException{
		try{
			setAnnualInterestRate(annualInterestRate);
			setNumberOfYears(numberOfYears);
			setLoanAmount(loanAmount);
			loanDate = new Date();
		}
		catch (IllegalArgumentException ex){
			System.out.println("Wrong Argument!");
		}
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	

	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
		try{
			if (annualInterestRate <= 0){
				throw new IllegalArgumentException("Wrong Argument");
			}
			this.annualInterestRate = annualInterestRate;
		}
		catch(IllegalArgumentException ex){
			System.out.println("Annual Interest Rate cannot be less than or equal to 0!");
		}
		
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears)throws IllegalArgumentException {
		try{
			if (numberOfYears <= 0){
				throw new IllegalArgumentException("Number of years");
			}
			this.numberOfYears = numberOfYears;
		}
		catch (IllegalArgumentException ex){
			System.out.println("Number of years cannot be less than or equal to 0!");
		}
		
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount)throws IllegalArgumentException {
		try{
			if (loanAmount <= 0){
				throw new IllegalArgumentException("Wrong Argument");
			}
			this.loanAmount = loanAmount;
		}
		catch (IllegalArgumentException ex){
			System.out.println("Loan amount cannot be less than or equal to 0!");
		}
		
	}

	public Date getLoanDate() {
		return loanDate;
	}
	
	public double getMonthlyPayment(){
		double x = loanAmount * annualInterestRate / 1200;
		double e = numberOfYears * 12;
		double y = 1 / Math.pow(1 + annualInterestRate / 1200, e);
		
		double monthlyPayment = x / (1 - y);
		return monthlyPayment;
	}
	
	public double getTotalPayment(){
		double monthlyPayment = getMonthlyPayment();
		return monthlyPayment * numberOfYears * 12;
	}
	
	@Override
	public String toString() {
		return "Loan [annualInterestRate=" + annualInterestRate + ", numberOfYears=" + numberOfYears + ", loanAmount="
				+ loanAmount + ", loanDate=" + loanDate + "]";
	}
}
