class PhotoFrameRunner {
	public static void main(String[] args) {

		PhotoFrame p1 = new PhotoFrame();
		PhotoFrame p2 = new PhotoFrame();
		PhotoFrame p3 = new PhotoFrame();
		PhotoFrame p4 = new PhotoFrame();
		PhotoFrame p5 = new PhotoFrame();

		System.out.println(p1.size + " " + p1.price + " " + p1.type + " " + p1.wallMount + " " + p1.thickness);

		p1.size = 15;
		p1.price = 500;
		p1.type = 'W';
		p1.wallMount = true;
		p1.thickness = 2;

		System.out.println(p1.size + " " + p1.price + " " + p1.type + " " + p1.wallMount + " " + p1.thickness);
	}
}