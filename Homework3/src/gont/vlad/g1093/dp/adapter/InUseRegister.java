package gont.vlad.g1093.dp.adapter;

public class InUseRegister extends StandardRegister{

	public InUseRegister(String name, String email, int age, String phone, String facebook) {
		super(name, email, age, phone, facebook);
		
	}

	@Override
	public void validate() {
		System.out.println("Input passed validations");
	}

	@Override
	public void useRESTBackEnd(String name, String email, int age, String phone, String facebook) {
		System.out.println(String.format("A new user will be registered in the db: %s, %s, %d, %s, %s", 
				name, email, age, phone, facebook));
	}

}
