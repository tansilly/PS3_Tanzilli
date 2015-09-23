
/**
 * 
 * @author Tim
 * 
 */

import java.util.Date;

public class Account {

	// creating data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	// no arg constructor
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}

	// constructor
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}

	// getters
	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// setters
	public void setId(int newId) {
		id = newId;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate/100;
	}

	// getter for date created
	public Date getDateCreated() {
		return dateCreated;
	}

	// creating monthly interest rate through complex formulae
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// withdrawal function with exception
	public void withdraw(double withdrawalAmount) throws InsufficientFundsException {
		if (withdrawalAmount <= balance) {
			balance -= withdrawalAmount;
		} else {
			double needs = withdrawalAmount - balance;
			throw new InsufficientFundsException(needs); 
		}
	}

	// deposit function no exception necessary
	public void deposit(double depositAmount){
		balance += depositAmount;
	}
}
