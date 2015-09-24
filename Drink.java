package Order;

public class Drink {
	IceCubes iceCubes = new IceCubes();
	Lemon lemon = new Lemon();
	IceCubesPlusLemon iceCubesPlusLemon = new IceCubesPlusLemon();

	public String getIceCubes() {

		return iceCubes.make();

	}

	public String getLemon() {

		return lemon.make();

	}

	public String getIceCubesPlusLemon() {

		return iceCubesPlusLemon.make();
	}

}
