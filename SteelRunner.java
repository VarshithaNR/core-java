class SteelRunner {
	public static void main(String[] args) {

		Steel s1 = new Steel();
		Steel s2 = new Steel();
		Steel s3 = new Steel();
		Steel s4 = new Steel();
		Steel s5 = new Steel();

		System.out.println(s1.weight + " " + s1.price + " " + s1.grade + " " + s1.isStrong + " " + s1.length);

		s1.weight = 50;
		s1.price = 500.5;
		s1.grade = 'A';
		s1.isStrong = true;
		s1.length = 100;

		System.out.println(s1.weight + " " + s1.price + " " + s1.grade + " " + s1.isStrong + " " + s1.length);
	}
}