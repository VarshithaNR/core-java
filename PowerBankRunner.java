class PowerBankRunner {
	public static void main(String[] args) {

		PowerBank p1 = new PowerBank();
		PowerBank p2 = new PowerBank();
		PowerBank p3 = new PowerBank();
		PowerBank p4 = new PowerBank();
		PowerBank p5 = new PowerBank();

		System.out.println(p1.capacity + " " + p1.price + " " + p1.brand + " " + p1.fastCharge + " " + p1.ports);

		p1.capacity = 20000;
		p1.price = 1500;
		p1.brand = 'M';
		p1.fastCharge = true;
		p1.ports = 3;

		System.out.println(p1.capacity + " " + p1.price + " " + p1.brand + " " + p1.fastCharge + " " + p1.ports);
	}
}