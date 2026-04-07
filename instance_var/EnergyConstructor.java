class EnergyConstructor {
	String companyName;
	String engineerName;
	int workers;
	PanelType type;
	SolarPanel panel;

	EnergyConstructor(String companyName, String engineerName, int workers, PanelType type, SolarPanel panel) {
		this.companyName = companyName;
		this.engineerName = engineerName;
		this.workers = workers;
		this.type = type;
		this.panel = panel;
	}

	void display() {
		System.out.println("Company: " + companyName);
		System.out.println("Engineer: " + engineerName);
		System.out.println("Workers: " + workers);
		System.out.println("Type: " + type);

		if (panel != null) {
			panel.showSolar();
		} else {
			System.out.println("SolarPanel is null");
		}
	}
}