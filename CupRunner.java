class CupRunner {
	public static void main(String[] args) {

		Cup c1 = new Cup();
		Cup c2 = new Cup();
		Cup c3 = new Cup();
		Cup c4 = new Cup();
		Cup c5 = new Cup();

		System.out.println(c1.capacity + " " + c1.price + " " + c1.material + " " + c1.handle + " " + c1.quantity);

		c1.capacity = 250;
		c1.price = 150;
		c1.material = 'S';
		c1.handle = true;
		c1.quantity = 2;

		System.out.println(c1.capacity + " " + c1.price + " " + c1.material + " " + c1.handle + " " + c1.quantity);
	}
}