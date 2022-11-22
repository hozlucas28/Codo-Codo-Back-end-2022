package ar.com.codoacodo.inheritance;

public class Seller {
	public void showConsolesToSell() {
		var xbox360 = new Xbox360();
		var playStation3 = new PlayStation(128, null, "3", null);
		var playStation4 = new PlayStation(256, null, "4", null);
		var playStation5 = new PlayStation(512, null, "5", null);

		System.out.println(
			xbox360.getAttributes()
			+ "\n" + playStation3.getAttributes()
			+ "\n" + playStation4.getAttributes()
			+ "\n" + playStation5.getAttributes()
		);
	}
}
