package ro.ase.csie.cts.gr1093.hw2.services.validation;

import ro.ase.csie.cts.gr1093.hw2.exceptions.InvalidAccountVectorException;
import ro.ase.csie.cts.gr1093.hw2.exceptions.InvalidLoanValueException;
import ro.ase.csie.cts.gr1093.hw2.exceptions.InvalidRateException;
import ro.ase.csie.cts.gr1093.hw2.refactored.LoanAccount;

public class ValidationService implements ValidationInterface{

	@Override
	public void validateLoanValue(double loanValue) throws InvalidLoanValueException {
		if (loanValue < 0) {
			throw new InvalidLoanValueException();
		}
	}

	@Override
	public void validateRate(double rate) throws InvalidRateException {
		if (rate < 0) {
			throw new InvalidRateException();
		}
	}

	@Override
	public void validateAccountsVector(LoanAccount[] accounts) throws InvalidAccountVectorException {
		if (accounts.length < 1) {
			throw new InvalidAccountVectorException();
		}
	}

}
