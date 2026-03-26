class PlayStationRunner {
	public static void main(String[] args) {

		PlayStation p1 = new PlayStation();
		PlayStation p2 = new PlayStation();
		PlayStation p3 = new PlayStation();
		PlayStation p4 = new PlayStation();
		PlayStation p5 = new PlayStation();

		System.out.println(p1.storage + " " + p1.price + " " + p1.model + " " + p1.online + " " + p1.controllers);

		p1.storage = 1000;
		p1.price = 50000;
		p1.model = 'P';
		p1.online = true;
		p1.controllers = 2;

		System.out.println(p1.storage + " " + p1.price + " " + p1.model + " " + p1.online + " " + p1.controllers);
	}
}