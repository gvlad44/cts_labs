package ro.ase.csie.cts.gr1093.hw2.refactored;

import ro.ase.csie.cts.gr1093.hw2.exceptions.InvalidAccountVectorException;
import ro.ase.csie.cts.gr1093.hw2.exceptions.InvalidLoanValueException;
import ro.ase.csie.cts.gr1093.hw2.exceptions.InvalidRateException;
import ro.ase.csie.cts.gr1093.hw2.services.validation.ValidationInterface;

public class LoanAccount {
	public double loanValue, rate;
	public int daysActive;
	public LoanAccountType loanAccountType;

	public final static int NO_DAYS_IN_YEAR = 365;
	public final static float BROKER_FEE = 0.0125f;

	ValidationInterface validation = null;
	
	
	public LoanAccount(double loanValue, double rate, LoanAccountType loanAccountType)
			throws InvalidLoanValueException, InvalidRateException {
		validation.validateLoanValue(loanValue);
		this.loanValue = loanValue;
		validation.validateRate(rate);
		this.rate = rate;
		this.loanAccountType = loanAccountType;
	}

	public LoanAccount(double loanValue, double rate, LoanAccountType loanAccountType, ValidationInterface validation)
			throws InvalidLoanValueException, InvalidRateException {
		if (validation == null) {
			throw new NullPointerException();
		}
		this.validation = validation;
		validation.validateLoanValue(loanValue);
		this.loanValue = loanValue;
		validation.validateRate(rate);
		this.rate = rate;
		this.loanAccountType = loanAccountType;
	}

	public double getLoanValue() {
		return this.loanValue;
	}

	public void printLoadValue() {
		System.out.println("The loan value is " + this.loanValue);
	}

	public double getRate() {
		return this.rate;
	}

	public void printRate() {
		System.out.println("The rate is " + rate);
	}

	public int getDaysActive() {
		return daysActive;
	}

	public void setDaysActive(int daysActive) {
		this.daysActive = daysActive;
	}

	public double getMonthlyRate() {
		return loanValue * rate;
	}

	public void setLoanValue(double loanValue) throws InvalidLoanValueException {
		validation.validateLoanValue(loanValue);
		this.loanValue = loanValue;
	}

	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + daysActive + "; Type: "
				+ loanAccountType + ";";
	}

	public void printStatement() {
		System.out.println("This is an account");
	}

	public static double computeInterestPrincipal(LoanAccount account) {
		double interestPrincipal = 0.0;
		interestPrincipal = account.loanValue * Math.pow(account.rate, (account.daysActive / NO_DAYS_IN_YEAR))
				- account.loanValue;
		return interestPrincipal;
	}

	public double computeBrokerTotalFee(LoanAccount[] accounts) throws InvalidAccountVectorException {
		validation.validateAccountsVector(accounts);
		double brokerTotalFee = 0.0;
		LoanAccount account;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.loanAccountType == LoanAccountType.PREMIUM
					|| account.loanAccountType == LoanAccountType.SUPER_PREMIUM)
				brokerTotalFee += BROKER_FEE * computeInterestPrincipal(account);
		}
		return brokerTotalFee;
	}

}
