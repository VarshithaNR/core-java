class ZipRunner {
	public static void main(String[] args) {

		Zip z1 = new Zip();
		Zip z2 = new Zip();
		Zip z3 = new Zip();
		Zip z4 = new Zip();
		Zip z5 = new Zip();
		Zip z6 = new Zip();
		Zip z7 = new Zip();
		Zip z8 = new Zip();
		Zip z9 = new Zip();
		Zip z10 = new Zip();

		z1.ratio=2; z1.speed=100; z1.time=1.2; z1.efficiency=90; z1.cost=60; z1.grade='A'; z1.encrypted=true; z1.level=5; z1.warranty=1; z1.id=1;
		z2.ratio=3; z2.speed=110; z2.time=1.3; z2.efficiency=88; z2.cost=65; z2.grade='B'; z2.encrypted=false; z2.level=6; z2.warranty=2; z2.id=2;
		z3.ratio=4; z3.speed=120; z3.time=1.4; z3.efficiency=92; z3.cost=70; z3.grade='A'; z3.encrypted=true; z3.level=7; z3.warranty=1; z3.id=3;
		z4.ratio=5; z4.speed=130; z4.time=1.5; z4.efficiency=85; z4.cost=75; z4.grade='C'; z4.encrypted=false; z4.level=8; z4.warranty=3; z4.id=4;
		z5.ratio=6; z5.speed=140; z5.time=1.6; z5.efficiency=93; z5.cost=80; z5.grade='A'; z5.encrypted=true; z5.level=9; z5.warranty=2; z5.id=5;
		z6.ratio=7; z6.speed=150; z6.time=1.7; z6.efficiency=87; z6.cost=85; z6.grade='B'; z6.encrypted=false; z6.level=10; z6.warranty=1; z6.id=6;
		z7.ratio=8; z7.speed=160; z7.time=1.8; z7.efficiency=94; z7.cost=90; z7.grade='A'; z7.encrypted=true; z7.level=11; z7.warranty=2; z7.id=7;
		z8.ratio=9; z8.speed=170; z8.time=1.9; z8.efficiency=86; z8.cost=95; z8.grade='C'; z8.encrypted=false; z8.level=12; z8.warranty=3; z8.id=8;
		z9.ratio=10; z9.speed=180; z9.time=2.0; z9.efficiency=91; z9.cost=100; z9.grade='B'; z9.encrypted=true; z9.level=13; z9.warranty=2; z9.id=9;
		z10.ratio=12; z10.speed=200; z10.time=2.2; z10.efficiency=95; z10.cost=110; z10.grade='A'; z10.encrypted=true; z10.level=15; z10.warranty=3; z10.id=10;

		System.out.println("z1: "+z1.size+" "+z1.price+" "+z1.type+" "+z1.compressed+" "+z1.files+" "+z1.ratio+" "+z1.speed+" "+z1.time+" "+z1.efficiency+" "+z1.cost+" "+z1.grade+" "+z1.encrypted+" "+z1.level+" "+z1.warranty+" "+z1.id);
		System.out.println("z2: "+z2.size+" "+z2.price+" "+z2.type+" "+z2.compressed+" "+z2.files+" "+z2.ratio+" "+z2.speed+" "+z2.time+" "+z2.efficiency+" "+z2.cost+" "+z2.grade+" "+z2.encrypted+" "+z2.level+" "+z2.warranty+" "+z2.id);
		System.out.println("z3: "+z3.size+" "+z3.price+" "+z3.type+" "+z3.compressed+" "+z3.files+" "+z3.ratio+" "+z3.speed+" "+z3.time+" "+z3.efficiency+" "+z3.cost+" "+z3.grade+" "+z3.encrypted+" "+z3.level+" "+z3.warranty+" "+z3.id);
		System.out.println("z4: "+z4.size+" "+z4.price+" "+z4.type+" "+z4.compressed+" "+z4.files+" "+z4.ratio+" "+z4.speed+" "+z4.time+" "+z4.efficiency+" "+z4.cost+" "+z4.grade+" "+z4.encrypted+" "+z4.level+" "+z4.warranty+" "+z4.id);
		System.out.println("z5: "+z5.size+" "+z5.price+" "+z5.type+" "+z5.compressed+" "+z5.files+" "+z5.ratio+" "+z5.speed+" "+z5.time+" "+z5.efficiency+" "+z5.cost+" "+z5.grade+" "+z5.encrypted+" "+z5.level+" "+z5.warranty+" "+z5.id);
		System.out.println("z6: "+z6.size+" "+z6.price+" "+z6.type+" "+z6.compressed+" "+z6.files+" "+z6.ratio+" "+z6.speed+" "+z6.time+" "+z6.efficiency+" "+z6.cost+" "+z6.grade+" "+z6.encrypted+" "+z6.level+" "+z6.warranty+" "+z6.id);
		System.out.println("z7: "+z7.size+" "+z7.price+" "+z7.type+" "+z7.compressed+" "+z7.files+" "+z7.ratio+" "+z7.speed+" "+z7.time+" "+z7.efficiency+" "+z7.cost+" "+z7.grade+" "+z7.encrypted+" "+z7.level+" "+z7.warranty+" "+z7.id);
		System.out.println("z8: "+z8.size+" "+z8.price+" "+z8.type+" "+z8.compressed+" "+z8.files+" "+z8.ratio+" "+z8.speed+" "+z8.time+" "+z8.efficiency+" "+z8.cost+" "+z8.grade+" "+z8.encrypted+" "+z8.level+" "+z8.warranty+" "+z8.id);
		System.out.println("z9: "+z9.size+" "+z9.price+" "+z9.type+" "+z9.compressed+" "+z9.files+" "+z9.ratio+" "+z9.speed+" "+z9.time+" "+z9.efficiency+" "+z9.cost+" "+z9.grade+" "+z9.encrypted+" "+z9.level+" "+z9.warranty+" "+z9.id);
		System.out.println("z10: "+z10.size+" "+z10.price+" "+z10.type+" "+z10.compressed+" "+z10.files+" "+z10.ratio+" "+z10.speed+" "+z10.time+" "+z10.efficiency+" "+z10.cost+" "+z10.grade+" "+z10.encrypted+" "+z10.level+" "+z10.warranty+" "+z10.id);
	}
}