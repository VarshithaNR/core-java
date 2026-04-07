class SugarCaneRunner {
	public static void main(String[] args) {

		SugarCane sc = new SugarCane(10, 5.5);

		FarmConstructor fc = new FarmConstructor(
			"Ramesh", "Suresh", 25, FarmType.LARGE, sc
		);

		fc.display();
	}
}