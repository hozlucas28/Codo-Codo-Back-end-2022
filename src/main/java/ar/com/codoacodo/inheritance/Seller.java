package ar.com.codoacodo.inheritance;

public class Seller {
	public static Console[] getConsolesToSell() {
		var xbox360 = new Xbox360();
		var playStation3 = new PlayStation(128, null, "3", null);
		var playStation4 = new PlayStation(256, null, "4", null);
		var playStation5 = new PlayStation(512, null, "5", null);
		
		return new Console[] {xbox360, playStation3, playStation4, playStation5};
	}
}
