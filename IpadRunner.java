class IpadRunner {
	public static void main(String[] args) {

		Ipad i1 = new Ipad();
		Ipad i2 = new Ipad();
		Ipad i3 = new Ipad();
		Ipad i4 = new Ipad();
		Ipad i5 = new Ipad();

		System.out.println(i1.storage + " " + i1.price + " " + i1.model + " " + i1.wifi + " " + i1.version);

		i1.storage = 128;
		i1.price = 45000;
		i1.model = 'A';
		i1.wifi = true;
		i1.version = 10;

		System.out.println(i1.storage + " " + i1.price + " " + i1.model + " " + i1.wifi + " " + i1.version);
	}
}