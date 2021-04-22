package ro.ase.csie.cts.g1093.dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		
		ScreenData soldier = new ScreenData(100, 100, 0, "Soldier 1 red");
		ScreenData soldier2 = new ScreenData(100, 50, 0, "Soldier 2 blue");
		
		ScreenData building1 = new ScreenData(10, 10, 5, "Building 1 blue");
		ScreenData building2 = new ScreenData(20, 50, 5, "Building 2 black");
		
		Model3DInterface soldierModel = ModelsFactory.getModel(ModelType.SOLDIER);
		soldierModel.display(soldier);
		soldierModel.display(soldier2);
		
		Model3DInterface buildingModel = ModelsFactory.getModel(ModelType.BUILDING);
		buildingModel.display(building1);
		buildingModel.display(building2);
		
		
		
		
	}

}
