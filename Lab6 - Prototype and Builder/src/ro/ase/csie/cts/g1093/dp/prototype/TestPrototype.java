package ro.ase.csie.cts.g1093.dp.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Char3DModel mickeymouse = new Char3DModel(CharacterType.DISNEY, "red");
//		Char3DModel mickeymouse2 = new Char3DModel(CharacterType.DISNEY, "red");
//		Char3DModel mickeymouse3 = new Char3DModel(CharacterType.DISNEY, "red");

		Char3DModel mickeymouse2 = (Char3DModel) mickeymouse.clone();
		Char3DModel mickeymouse3 = (Char3DModel) mickeymouse.clone();
	}

}
