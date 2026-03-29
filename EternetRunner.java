class EternetRunner {
	public static void main(String[] args) {

		Eternet e1 = new Eternet();
		Eternet e2 = new Eternet();
		Eternet e3 = new Eternet();
		Eternet e4 = new Eternet();
		Eternet e5 = new Eternet();
		Eternet e6 = new Eternet();
		Eternet e7 = new Eternet();
		Eternet e8 = new Eternet();
		Eternet e9 = new Eternet();
		Eternet e10 = new Eternet();

		e1.length=10; e1.bandwidth=100; e1.latency=1.2; e1.signal=2.5; e1.cost=1600; e1.grade='A'; e1.fiber=true; e1.devices=5; e1.warranty=1; e1.id=1;
		e2.length=12; e2.bandwidth=120; e2.latency=1.3; e2.signal=2.7; e2.cost=1700; e2.grade='B'; e2.fiber=false; e2.devices=6; e2.warranty=2; e2.id=2;
		e3.length=14; e3.bandwidth=140; e3.latency=1.4; e3.signal=2.9; e3.cost=1800; e3.grade='A'; e3.fiber=true; e3.devices=7; e3.warranty=1; e3.id=3;
		e4.length=16; e4.bandwidth=160; e4.latency=1.5; e4.signal=3.1; e4.cost=1900; e4.grade='C'; e4.fiber=false; e4.devices=8; e4.warranty=3; e4.id=4;
		e5.length=18; e5.bandwidth=180; e5.latency=1.6; e5.signal=3.3; e5.cost=2000; e5.grade='A'; e5.fiber=true; e5.devices=9; e5.warranty=2; e5.id=5;
		e6.length=20; e6.bandwidth=200; e6.latency=1.7; e6.signal=3.5; e6.cost=2100; e6.grade='B'; e6.fiber=false; e6.devices=10; e6.warranty=1; e6.id=6;
		e7.length=22; e7.bandwidth=220; e7.latency=1.8; e7.signal=3.7; e7.cost=2200; e7.grade='A'; e7.fiber=true; e7.devices=11; e7.warranty=2; e7.id=7;
		e8.length=24; e8.bandwidth=240; e8.latency=1.9; e8.signal=3.9; e8.cost=2300; e8.grade='C'; e8.fiber=false; e8.devices=12; e8.warranty=3; e8.id=8;
		e9.length=26; e9.bandwidth=260; e9.latency=2.0; e9.signal=4.1; e9.cost=2400; e9.grade='B'; e9.fiber=true; e9.devices=13; e9.warranty=2; e9.id=9;
		e10.length=28; e10.bandwidth=280; e10.latency=2.2; e10.signal=4.5; e10.cost=2600; e10.grade='A'; e10.fiber=true; e10.devices=14; e10.warranty=3; e10.id=10;

		System.out.println("e1: "+e1.speed+" "+e1.price+" "+e1.type+" "+e1.wired+" "+e1.ports+" "+e1.length+" "+e1.bandwidth+" "+e1.latency+" "+e1.signal+" "+e1.cost+" "+e1.grade+" "+e1.fiber+" "+e1.devices+" "+e1.warranty+" "+e1.id);
		System.out.println("e2: "+e2.speed+" "+e2.price+" "+e2.type+" "+e2.wired+" "+e2.ports+" "+e2.length+" "+e2.bandwidth+" "+e2.latency+" "+e2.signal+" "+e2.cost+" "+e2.grade+" "+e2.fiber+" "+e2.devices+" "+e2.warranty+" "+e2.id);
		System.out.println("e3: "+e3.speed+" "+e3.price+" "+e3.type+" "+e3.wired+" "+e3.ports+" "+e3.length+" "+e3.bandwidth+" "+e3.latency+" "+e3.signal+" "+e3.cost+" "+e3.grade+" "+e3.fiber+" "+e3.devices+" "+e3.warranty+" "+e3.id);
		System.out.println("e4: "+e4.speed+" "+e4.price+" "+e4.type+" "+e4.wired+" "+e4.ports+" "+e4.length+" "+e4.bandwidth+" "+e4.latency+" "+e4.signal+" "+e4.cost+" "+e4.grade+" "+e4.fiber+" "+e4.devices+" "+e4.warranty+" "+e4.id);
		System.out.println("e5: "+e5.speed+" "+e5.price+" "+e5.type+" "+e5.wired+" "+e5.ports+" "+e5.length+" "+e5.bandwidth+" "+e5.latency+" "+e5.signal+" "+e5.cost+" "+e5.grade+" "+e5.fiber+" "+e5.devices+" "+e5.warranty+" "+e5.id);
		System.out.println("e6: "+e6.speed+" "+e6.price+" "+e6.type+" "+e6.wired+" "+e6.ports+" "+e6.length+" "+e6.bandwidth+" "+e6.latency+" "+e6.signal+" "+e6.cost+" "+e6.grade+" "+e6.fiber+" "+e6.devices+" "+e6.warranty+" "+e6.id);
		System.out.println("e7: "+e7.speed+" "+e7.price+" "+e7.type+" "+e7.wired+" "+e7.ports+" "+e7.length+" "+e7.bandwidth+" "+e7.latency+" "+e7.signal+" "+e7.cost+" "+e7.grade+" "+e7.fiber+" "+e7.devices+" "+e7.warranty+" "+e7.id);
		System.out.println("e8: "+e8.speed+" "+e8.price+" "+e8.type+" "+e8.wired+" "+e8.ports+" "+e8.length+" "+e8.bandwidth+" "+e8.latency+" "+e8.signal+" "+e8.cost+" "+e8.grade+" "+e8.fiber+" "+e8.devices+" "+e8.warranty+" "+e8.id);
		System.out.println("e9: "+e9.speed+" "+e9.price+" "+e9.type+" "+e9.wired+" "+e9.ports+" "+e9.length+" "+e9.bandwidth+" "+e9.latency+" "+e9.signal+" "+e9.cost+" "+e9.grade+" "+e9.fiber+" "+e9.devices+" "+e9.warranty+" "+e9.id);
		System.out.println("e10: "+e10.speed+" "+e10.price+" "+e10.type+" "+e10.wired+" "+e10.ports+" "+e10.length+" "+e10.bandwidth+" "+e10.latency+" "+e10.signal+" "+e10.cost+" "+e10.grade+" "+e10.fiber+" "+e10.devices+" "+e10.warranty+" "+e10.id);
	}
}