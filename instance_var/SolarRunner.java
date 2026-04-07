class SolarRunner {
	public static void main(String[] args) {

		SolarPanel sp = new SolarPanel(500, 89.5);

		EnergyConstructor ec = new EnergyConstructor(
			"TataPower", "Arjun", 60, PanelType.INDUSTRIAL, sp
		);

		ec.display();
	}
}