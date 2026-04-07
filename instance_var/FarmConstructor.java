class FarmConstructor {
	String ownerName;
	String managerName;
	int workers;
	FarmType type;
	SugarCane sugar;

	FarmConstructor(String ownerName, String managerName, int workers, FarmType type, SugarCane sugar) {
		this.ownerName = ownerName;
		this.managerName = managerName;
		this.workers = workers;
		this.type = type;
		this.sugar = sugar;
	}

	void display() {
		System.out.println("Owner: " + ownerName);
		System.out.println("Manager: " + managerName);
		System.out.println("Workers: " + workers);
		System.out.println("Farm Type: " + type);

		if (sugar != null) {
			sugar.showSugarCane();
		} else {
			System.out.println("SugarCane is null");
		}
	}
}