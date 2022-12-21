package ar.com.codoacodo.inheritance;

import ar.com.codoacodo.inheritance.interfaces.IPlayable;
import ar.com.codoacodo.inheritance.interfaces.IUpgradable;

public class Main {

	public static void main(String[] args) {
		Console[] consoles = Seller.getConsolesToSell();

		for (int i = 0; i < consoles.length; i++) {
			Console aux = consoles[i];

			if (aux instanceof IPlayable) {
				IPlayable instance = (IPlayable) aux;
				System.out.println("[ " + aux.getName() + " es jugable ]");
				instance.play();
			} else {
				System.out.println("[ " + aux.getName() + " no es jugable ]");
			}

			if (aux instanceof IUpgradable) {
				IUpgradable instance = (IUpgradable) aux;
				System.out.println("[ " + aux.getName() + " es actualizable ]\n");
				instance.update();
			} else {
				System.out.println("[ " + aux.getName() + " no es actualizable ]\n");
			}
		}
	}
}
