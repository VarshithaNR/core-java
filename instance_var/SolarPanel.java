public class SolarPanel {
	int capacity;
	double efficiency;

	SolarPanel(int capacity, double efficiency) {
		this.capacity = capacity;
		this.efficiency = efficiency;
	}

	void showSolar() {
		System.out.println("Capacity: " + capacity);
		System.out.println("Efficiency: " + efficiency);
	}
}