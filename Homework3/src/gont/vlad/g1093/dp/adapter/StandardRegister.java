package gont.vlad.g1093.dp.adapter;

public abstract class StandardRegister {

	protected String name;
	protected String email;
	protected int age;
	protected String phone;
	protected String facebook;
	
	public StandardRegister(String name, String email, int age, String phone, String facebook) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.facebook = facebook;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getFacebook() {
		return facebook;
	}
	
	public abstract void validate();
	
	public abstract void useRESTBackEnd(String name, String email, int age, String phone, String facebook);
	
	
}
