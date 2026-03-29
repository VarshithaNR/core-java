class RouterRunner {
	public static void main(String[] args) {

		Router r1 = new Router();
		Router r2 = new Router();
		Router r3 = new Router();
		Router r4 = new Router();
		Router r5 = new Router();
		Router r6 = new Router();
		Router r7 = new Router();
		Router r8 = new Router();
		Router r9 = new Router();
		Router r10 = new Router();

		r1.range=50; r1.ports=4; r1.bandwidth=300; r1.signal=2.5; r1.cost=2600; r1.grade='A'; r1.dualBand=true; r1.devices=10; r1.warranty=2; r1.id=1;
		r2.range=55; r2.ports=4; r2.bandwidth=320; r2.signal=2.7; r2.cost=2700; r2.grade='B'; r2.dualBand=false; r2.devices=12; r2.warranty=1; r2.id=2;
		r3.range=60; r3.ports=5; r3.bandwidth=350; r3.signal=2.9; r3.cost=2800; r3.grade='A'; r3.dualBand=true; r3.devices=15; r3.warranty=2; r3.id=3;
		r4.range=65; r4.ports=4; r4.bandwidth=370; r4.signal=3.1; r4.cost=2900; r4.grade='C'; r4.dualBand=false; r4.devices=18; r4.warranty=1; r4.id=4;
		r5.range=70; r5.ports=5; r5.bandwidth=400; r5.signal=3.3; r5.cost=3000; r5.grade='A'; r5.dualBand=true; r5.devices=20; r5.warranty=2; r5.id=5;
		r6.range=75; r6.ports=4; r6.bandwidth=420; r6.signal=3.5; r6.cost=3100; r6.grade='B'; r6.dualBand=false; r6.devices=22; r6.warranty=1; r6.id=6;
		r7.range=80; r7.ports=5; r7.bandwidth=450; r7.signal=3.7; r7.cost=3200; r7.grade='A'; r7.dualBand=true; r7.devices=25; r7.warranty=2; r7.id=7;
		r8.range=85; r8.ports=4; r8.bandwidth=470; r8.signal=3.9; r8.cost=3300; r8.grade='C'; r8.dualBand=false; r8.devices=28; r8.warranty=1; r8.id=8;
		r9.range=90; r9.ports=5; r9.bandwidth=500; r9.signal=4.1; r9.cost=3400; r9.grade='B'; r9.dualBand=true; r9.devices=30; r9.warranty=2; r9.id=9;
		r10.range=100; r10.ports=6; r10.bandwidth=550; r10.signal=4.5; r10.cost=3600; r10.grade='A'; r10.dualBand=true; r10.devices=35; r10.warranty=3; r10.id=10;

		System.out.println("r1: "+r1.speed+" "+r1.price+" "+r1.type+" "+r1.wireless+" "+r1.antennas+" "+r1.range+" "+r1.ports+" "+r1.bandwidth+" "+r1.signal+" "+r1.cost+" "+r1.grade+" "+r1.dualBand+" "+r1.devices+" "+r1.warranty+" "+r1.id);
		System.out.println("r2: "+r2.speed+" "+r2.price+" "+r2.type+" "+r2.wireless+" "+r2.antennas+" "+r2.range+" "+r2.ports+" "+r2.bandwidth+" "+r2.signal+" "+r2.cost+" "+r2.grade+" "+r2.dualBand+" "+r2.devices+" "+r2.warranty+" "+r2.id);
		System.out.println("r3: "+r3.speed+" "+r3.price+" "+r3.type+" "+r3.wireless+" "+r3.antennas+" "+r3.range+" "+r3.ports+" "+r3.bandwidth+" "+r3.signal+" "+r3.cost+" "+r3.grade+" "+r3.dualBand+" "+r3.devices+" "+r3.warranty+" "+r3.id);
		System.out.println("r4: "+r4.speed+" "+r4.price+" "+r4.type+" "+r4.wireless+" "+r4.antennas+" "+r4.range+" "+r4.ports+" "+r4.bandwidth+" "+r4.signal+" "+r4.cost+" "+r4.grade+" "+r4.dualBand+" "+r4.devices+" "+r4.warranty+" "+r4.id);
		System.out.println("r5: "+r5.speed+" "+r5.price+" "+r5.type+" "+r5.wireless+" "+r5.antennas+" "+r5.range+" "+r5.ports+" "+r5.bandwidth+" "+r5.signal+" "+r5.cost+" "+r5.grade+" "+r5.dualBand+" "+r5.devices+" "+r5.warranty+" "+r5.id);
		System.out.println("r6: "+r6.speed+" "+r6.price+" "+r6.type+" "+r6.wireless+" "+r6.antennas+" "+r6.range+" "+r6.ports+" "+r6.bandwidth+" "+r6.signal+" "+r6.cost+" "+r6.grade+" "+r6.dualBand+" "+r6.devices+" "+r6.warranty+" "+r6.id);
		System.out.println("r7: "+r7.speed+" "+r7.price+" "+r7.type+" "+r7.wireless+" "+r7.antennas+" "+r7.range+" "+r7.ports+" "+r7.bandwidth+" "+r7.signal+" "+r7.cost+" "+r7.grade+" "+r7.dualBand+" "+r7.devices+" "+r7.warranty+" "+r7.id);
		System.out.println("r8: "+r8.speed+" "+r8.price+" "+r8.type+" "+r8.wireless+" "+r8.antennas+" "+r8.range+" "+r8.ports+" "+r8.bandwidth+" "+r8.signal+" "+r8.cost+" "+r8.grade+" "+r8.dualBand+" "+r8.devices+" "+r8.warranty+" "+r8.id);
		System.out.println("r9: "+r9.speed+" "+r9.price+" "+r9.type+" "+r9.wireless+" "+r9.antennas+" "+r9.range+" "+r9.ports+" "+r9.bandwidth+" "+r9.signal+" "+r9.cost+" "+r9.grade+" "+r9.dualBand+" "+r9.devices+" "+r9.warranty+" "+r9.id);
		System.out.println("r10: "+r10.speed+" "+r10.price+" "+r10.type+" "+r10.wireless+" "+r10.antennas+" "+r10.range+" "+r10.ports+" "+r10.bandwidth+" "+r10.signal+" "+r10.cost+" "+r10.grade+" "+r10.dualBand+" "+r10.devices+" "+r10.warranty+" "+r10.id);
	}
}