package ro.ase.csie.cts.gr1093.hw2.refactored;

import java.util.ArrayList;

import ro.ase.csie.cts.gr1093.hw2.exceptions.InvalidAccountVectorException;
import ro.ase.csie.cts.gr1093.hw2.exceptions.InvalidLoanValueException;
import ro.ase.csie.cts.gr1093.hw2.exceptions.InvalidRateException;
import ro.ase.csie.cts.gr1093.hw2.services.validation.ValidationService;

public class Test {

	public static ArrayList<Object> services = new ArrayList<>();
	
	public static void startup() {
		services.add(new ValidationService());
	}
	
	public static void main(String[] args) {
		startup();
		
		LoanAccount loanAccount = null;
		
		try {
			loanAccount = new LoanAccount(100, 0.5, LoanAccountType.BUDGET, new ValidationService());
		} catch (InvalidLoanValueException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvalidRateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			loanAccount.setLoanValue(500);
		} catch (InvalidLoanValueException e) {
			e.printStackTrace();
		}
		loanAccount.printLoadValue();
		
		LoanAccount loanAccount2 = null;
		
		try {
			loanAccount2 = new LoanAccount(1000, 2, LoanAccountType.PREMIUM, new ValidationService());
		} catch (InvalidLoanValueException e) {
			e.printStackTrace();
		} catch (InvalidRateException e) {
			e.printStackTrace();
		}
		
		LoanAccount loanAccount3 = null;
		try {
			loanAccount3 = new LoanAccount(2000, 3, LoanAccountType.SUPER_PREMIUM, new ValidationService());
		} catch (InvalidLoanValueException e) {
			e.printStackTrace();
		} catch (InvalidRateException e) {
			e.printStackTrace();
		}
		
		System.out.println(loanAccount2.toString());
		loanAccount2.setDaysActive(10);
		loanAccount3.setDaysActive(20);
		
		LoanAccount[] accounts = {loanAccount, loanAccount2, loanAccount3};
		try {
			double var = 0;
			var = loanAccount3.computeBrokerTotalFee(accounts);
			System.out.println(var);
		} catch (InvalidAccountVectorException e) {
			e.printStackTrace();
		}
		
	}
	
}
