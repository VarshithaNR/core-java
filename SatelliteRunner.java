class SatelliteRunner {
	public static void main(String[] args) {

		Satellite s1 = new Satellite();
		Satellite s2 = new Satellite();
		Satellite s3 = new Satellite();
		Satellite s4 = new Satellite();
		Satellite s5 = new Satellite();
		Satellite s6 = new Satellite();
		Satellite s7 = new Satellite();
		Satellite s8 = new Satellite();
		Satellite s9 = new Satellite();
		Satellite s10 = new Satellite();

		s1.weight=1000; s1.speed=27000; s1.power=500; s1.signal=1.2; s1.cost=1100000; s1.grade='A'; s1.gps=true; s1.fuel=500; s1.warranty=5; s1.id=1;
		s2.weight=1100; s2.speed=27500; s2.power=520; s2.signal=1.3; s2.cost=1150000; s2.grade='B'; s2.gps=true; s2.fuel=520; s2.warranty=4; s2.id=2;
		s3.weight=1200; s3.speed=28000; s3.power=540; s3.signal=1.4; s3.cost=1200000; s3.grade='A'; s3.gps=true; s3.fuel=540; s3.warranty=5; s3.id=3;
		s4.weight=1300; s4.speed=28500; s4.power=560; s4.signal=1.5; s4.cost=1250000; s4.grade='C'; s4.gps=false; s4.fuel=560; s4.warranty=3; s4.id=4;
		s5.weight=1400; s5.speed=29000; s5.power=580; s5.signal=1.6; s5.cost=1300000; s5.grade='A'; s5.gps=true; s5.fuel=580; s5.warranty=5; s5.id=5;
		s6.weight=1500; s6.speed=29500; s6.power=600; s6.signal=1.7; s6.cost=1350000; s6.grade='B'; s6.gps=true; s6.fuel=600; s6.warranty=4; s6.id=6;
		s7.weight=1600; s7.speed=30000; s7.power=620; s7.signal=1.8; s7.cost=1400000; s7.grade='A'; s7.gps=true; s7.fuel=620; s7.warranty=5; s7.id=7;
		s8.weight=1700; s8.speed=30500; s8.power=640; s8.signal=1.9; s8.cost=1450000; s8.grade='C'; s8.gps=false; s8.fuel=640; s8.warranty=3; s8.id=8;
		s9.weight=1800; s9.speed=31000; s9.power=660; s9.signal=2.0; s9.cost=1500000; s9.grade='B'; s9.gps=true; s9.fuel=660; s9.warranty=4; s9.id=9;
		s10.weight=1900; s10.speed=32000; s10.power=700; s10.signal=2.2; s10.cost=1600000; s10.grade='A'; s10.gps=true; s10.fuel=700; s10.warranty=5; s10.id=10;

		System.out.println("s1: "+s1.orbitHeight+" "+s1.price+" "+s1.type+" "+s1.active+" "+s1.antennas+" "+s1.weight+" "+s1.speed+" "+s1.power+" "+s1.signal+" "+s1.cost+" "+s1.grade+" "+s1.gps+" "+s1.fuel+" "+s1.warranty+" "+s1.id);
		System.out.println("s2: "+s2.orbitHeight+" "+s2.price+" "+s2.type+" "+s2.active+" "+s2.antennas+" "+s2.weight+" "+s2.speed+" "+s2.power+" "+s2.signal+" "+s2.cost+" "+s2.grade+" "+s2.gps+" "+s2.fuel+" "+s2.warranty+" "+s2.id);
		System.out.println("s3: "+s3.orbitHeight+" "+s3.price+" "+s3.type+" "+s3.active+" "+s3.antennas+" "+s3.weight+" "+s3.speed+" "+s3.power+" "+s3.signal+" "+s3.cost+" "+s3.grade+" "+s3.gps+" "+s3.fuel+" "+s3.warranty+" "+s3.id);
		System.out.println("s4: "+s4.orbitHeight+" "+s4.price+" "+s4.type+" "+s4.active+" "+s4.antennas+" "+s4.weight+" "+s4.speed+" "+s4.power+" "+s4.signal+" "+s4.cost+" "+s4.grade+" "+s4.gps+" "+s4.fuel+" "+s4.warranty+" "+s4.id);
		System.out.println("s5: "+s5.orbitHeight+" "+s5.price+" "+s5.type+" "+s5.active+" "+s5.antennas+" "+s5.weight+" "+s5.speed+" "+s5.power+" "+s5.signal+" "+s5.cost+" "+s5.grade+" "+s5.gps+" "+s5.fuel+" "+s5.warranty+" "+s5.id);
		System.out.println("s6: "+s6.orbitHeight+" "+s6.price+" "+s6.type+" "+s6.active+" "+s6.antennas+" "+s6.weight+" "+s6.speed+" "+s6.power+" "+s6.signal+" "+s6.cost+" "+s6.grade+" "+s6.gps+" "+s6.fuel+" "+s6.warranty+" "+s6.id);
		System.out.println("s7: "+s7.orbitHeight+" "+s7.price+" "+s7.type+" "+s7.active+" "+s7.antennas+" "+s7.weight+" "+s7.speed+" "+s7.power+" "+s7.signal+" "+s7.cost+" "+s7.grade+" "+s7.gps+" "+s7.fuel+" "+s7.warranty+" "+s7.id);
		System.out.println("s8: "+s8.orbitHeight+" "+s8.price+" "+s8.type+" "+s8.active+" "+s8.antennas+" "+s8.weight+" "+s8.speed+" "+s8.power+" "+s8.signal+" "+s8.cost+" "+s8.grade+" "+s8.gps+" "+s8.fuel+" "+s8.warranty+" "+s8.id);
		System.out.println("s9: "+s9.orbitHeight+" "+s9.price+" "+s9.type+" "+s9.active+" "+s9.antennas+" "+s9.weight+" "+s9.speed+" "+s9.power+" "+s9.signal+" "+s9.cost+" "+s9.grade+" "+s9.gps+" "+s9.fuel+" "+s9.warranty+" "+s9.id);
		System.out.println("s10: "+s10.orbitHeight+" "+s10.price+" "+s10.type+" "+s10.active+" "+s10.antennas+" "+s10.weight+" "+s10.speed+" "+s10.power+" "+s10.signal+" "+s10.cost+" "+s10.grade+" "+s10.gps+" "+s10.fuel+" "+s10.warranty+" "+s10.id);
	}
}