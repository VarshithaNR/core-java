class XboxRunner {
	public static void main(String[] args) {

		Xbox x1 = new Xbox(); Xbox x2 = new Xbox(); Xbox x3 = new Xbox();
		Xbox x4 = new Xbox(); Xbox x5 = new Xbox(); Xbox x6 = new Xbox();
		Xbox x7 = new Xbox(); Xbox x8 = new Xbox(); Xbox x9 = new Xbox(); Xbox x10 = new Xbox();

		x1.games=10; x1.id=1; x1.warranty=2; x1.users=1; x1.fps=60;
		x1.cpu=3.5; x1.cost=52000; x1.gpu=2.5; x1.ram=16; x1.speed=2.0; x1.grade='A'; x1.digital=true;

		x2.games=12; x2.id=2; x2.warranty=3; x2.users=2; x2.fps=60;
		x2.cpu=3.6; x2.cost=53000; x2.gpu=2.6; x2.ram=16; x2.speed=2.1; x2.grade='B'; x2.digital=true;

		x3.games=14; x3.id=3; x3.warranty=2; x3.users=2; x3.fps=90;
		x3.cpu=3.7; x3.cost=54000; x3.gpu=2.7; x3.ram=16; x3.speed=2.2; x3.grade='A'; x3.digital=false;

		x4.games=16; x4.id=4; x4.warranty=1; x4.users=3; x4.fps=90;
		x4.cpu=3.8; x4.cost=55000; x4.gpu=2.8; x4.ram=16; x4.speed=2.3; x4.grade='C'; x4.digital=true;

		x5.games=18; x5.id=5; x5.warranty=2; x5.users=4; x5.fps=120;
		x5.cpu=3.9; x5.cost=56000; x5.gpu=2.9; x5.ram=16; x5.speed=2.4; x5.grade='A'; x5.digital=false;

		x6.games=20; x6.id=6; x6.warranty=3; x6.users=4; x6.fps=120;
		x6.cpu=4.0; x6.cost=57000; x6.gpu=3.0; x6.ram=16; x6.speed=2.5; x6.grade='B'; x6.digital=true;

		x7.games=22; x7.id=7; x7.warranty=2; x7.users=5; x7.fps=144;
		x7.cpu=4.1; x7.cost=58000; x7.gpu=3.1; x7.ram=16; x7.speed=2.6; x7.grade='A'; x7.digital=false;

		x8.games=24; x8.id=8; x8.warranty=1; x8.users=6; x8.fps=144;
		x8.cpu=4.2; x8.cost=59000; x8.gpu=3.2; x8.ram=16; x8.speed=2.7; x8.grade='C'; x8.digital=true;

		x9.games=26; x9.id=9; x9.warranty=2; x9.users=7; x9.fps=165;
		x9.cpu=4.3; x9.cost=60000; x9.gpu=3.3; x9.ram=16; x9.speed=2.8; x9.grade='B'; x9.digital=false;

		x10.games=30; x10.id=10; x10.warranty=3; x10.users=8; x10.fps=240;
		x10.cpu=4.5; x10.cost=62000; x10.gpu=3.5; x10.ram=16; x10.speed=3.0; x10.grade='A'; x10.digital=true;

		System.out.println("x1: "+x1.id+" "+x1.games+" "+x1.grade);
		System.out.println("x2: "+x2.id+" "+x2.games+" "+x2.grade);
		System.out.println("x3: "+x3.id+" "+x3.games+" "+x3.grade);
		System.out.println("x4: "+x4.id+" "+x4.games+" "+x4.grade);
		System.out.println("x5: "+x5.id+" "+x5.games+" "+x5.grade);
		System.out.println("x6: "+x6.id+" "+x6.games+" "+x6.grade);
		System.out.println("x7: "+x7.id+" "+x7.games+" "+x7.grade);
		System.out.println("x8: "+x8.id+" "+x8.games+" "+x8.grade);
		System.out.println("x9: "+x9.id+" "+x9.games+" "+x9.grade);
		System.out.println("x10: "+x10.id+" "+x10.games+" "+x10.grade);
	}
}