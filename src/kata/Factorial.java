public class Factorial {

	public static int facto(int factoriel) {
		
		if (factoriel >= 1) {
			return factoriel * facto(factoriel-1);
		}
		else {
			return 1;
		}
		
	}
}
