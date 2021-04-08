package ro.ase.csie.cts.gr1093.hw2.services.validation;

import ro.ase.csie.cts.gr1093.hw2.exceptions.InvalidAccountVectorException;
import ro.ase.csie.cts.gr1093.hw2.exceptions.InvalidLoanValueException;
import ro.ase.csie.cts.gr1093.hw2.exceptions.InvalidRateException;
import ro.ase.csie.cts.gr1093.hw2.refactored.LoanAccount;

public interface ValidationInterface {

	public void validateLoanValue(double loanValue) throws InvalidLoanValueException;
	
	public void validateRate(double rate) throws InvalidRateException;
	
	public void validateAccountsVector(LoanAccount[] accounts) throws InvalidAccountVectorException;
	
}
