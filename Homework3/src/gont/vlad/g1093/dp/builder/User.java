package gont.vlad.g1093.dp.builder;

public class User {

	private String name;
	private String email;
	private boolean isAdmin;

	private GameInterface game;

	private int age;
	private String phone;
	private String facebook;

	private User() {

	}

	private void setAge(int age) {
		this.age = age;
	}

	private void setPhone(String phone) {
		this.phone = phone;
	}

	private void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public GameInterface getGameActions() {
		return game;
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

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", isAdmin=" + isAdmin + ", age=" + age + ", phone=" + phone
				+ ", facebook=" + facebook + "]";
	}

	public static class UserBuilder {

		User user;

		public UserBuilder(String name, String email) {
			this.user = new User();
			this.user.name = name;
			this.user.email = email;
		}

		public UserBuilder isAdmin() {
			this.user.isAdmin = true;
			return this;
		}

		public UserBuilder updateAge(int age) {
			this.user.setAge(age);
			return this;
		}

		public UserBuilder updatePhone(String phone) {
			this.user.setPhone(phone);
			return this;
		}

		public UserBuilder updateFacebook(String facebook) {
			this.user.setFacebook(facebook);
			return this;
		}

		public UserBuilder setGame(GameInterface game) {
			this.user.game = game;
			return this;
		}

		public User useBuilder() {
			return this.user;
		}

	}

}
