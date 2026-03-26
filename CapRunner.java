class CapRunner {
	public static void main(String[] args) {

		Cap c1 = new Cap();
		Cap c2 = new Cap();
		Cap c3 = new Cap();
		Cap c4 = new Cap();
		Cap c5 = new Cap();

		System.out.println(c1.size + " " + c1.price + " " + c1.type + " " + c1.branded + " " + c1.quantity);

		c1.size = 7;
		c1.price = 299.9;
		c1.type = 'S';
		c1.branded = true;
		c1.quantity = 5;

		System.out.println(c1.size + " " + c1.price + " " + c1.type + " " + c1.branded + " " + c1.quantity);
	}
}