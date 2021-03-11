package ro.ase.csie.cts.gr1093.lab3;

import ro.ase.csie.cts.gr1093.lab3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.gr1093.lab3.exceptions.InvalidPriceException;
import ro.ase.csie.cts.gr1093.lab3.stage1.Product;
import ro.ase.csie.cts.gr1093.lab3.stage1.ProductType;

public class TestProduct {

	public static void main(String[] args) {
		Product product = new Product();
		
		try {
			product.getFinalPrice(ProductType.NEW, 0, 0);
		} catch (InvalidPriceException | InvalidAccountAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
