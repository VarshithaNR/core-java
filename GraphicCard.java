class GraphicCard {
	int fans = 3;
	double price = 30000;
	char type = 'G';
	boolean rgb = true;
	int memory = 8;

	int cores, id, warranty, ports, speed;
	double clock, cost, voltage, temp, bandwidth;
	char grade;
	boolean overclock;

	GraphicCard() {
		System.out.println("GPU created");
	}
}