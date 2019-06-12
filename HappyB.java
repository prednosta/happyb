
public class HappyB {
	static String vseNej = "Všechno nejlepší!";
	
	private static String HappyB(String jmeno) {
		return jmeno;		
	}
	
	private static String rekni(String jmeno, String hlaska) {
		int stopka = 0;
		
		while (true) {
			System.out.println(HappyB(jmeno) + " " + HappyB.vseNej );
			stopka++;
			if (stopka == 30) {
				break;
			}
		}
		
		return HappyB.za_rok();
	}
	
	private static String za_rok() {
		String za_rok = "Tak zase za rok!";
		return za_rok;
	}
	
	public static void main(String[] args) {
		rekni("sestøièko", vseNej);
	}
}
