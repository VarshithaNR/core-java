class RouterRunner {
	public static void main(String[] args) {

		Router r1 = new Router(); Router r2 = new Router(); Router r3 = new Router();
		Router r4 = new Router(); Router r5 = new Router(); Router r6 = new Router();
		Router r7 = new Router(); Router r8 = new Router(); Router r9 = new Router(); Router r10 = new Router();

		r1.speed=100; r1.id=1; r1.warranty=2; r1.users=5; r1.range=20;
		r1.frequency=2.4; r1.cost=2600; r1.voltage=220; r1.bandwidth=300; r1.latency=10;
		r1.grade='A'; r1.dualBand=true;

		r2.speed=120; r2.id=2; r2.warranty=3; r2.users=6; r2.range=25;
		r2.frequency=5; r2.cost=2800; r2.voltage=220; r2.bandwidth=400; r2.latency=9;
		r2.grade='B'; r2.dualBand=true;

		r3.speed=140; r3.id=3; r3.warranty=2; r3.users=7; r3.range=30;
		r3.frequency=5; r3.cost=3000; r3.voltage=230; r3.bandwidth=450; r3.latency=8;
		r3.grade='A'; r3.dualBand=true;

		r4.speed=160; r4.id=4; r4.warranty=1; r4.users=8; r4.range=35;
		r4.frequency=5; r4.cost=3200; r4.voltage=230; r4.bandwidth=500; r4.latency=7;
		r4.grade='C'; r4.dualBand=false;

		r5.speed=180; r5.id=5; r5.warranty=2; r5.users=9; r5.range=40;
		r5.frequency=5; r5.cost=3500; r5.voltage=240; r5.bandwidth=550; r5.latency=6;
		r5.grade='A'; r5.dualBand=true;

		r6.speed=200; r6.id=6; r6.warranty=3; r6.users=10; r6.range=45;
		r6.frequency=5; r6.cost=3700; r6.voltage=240; r6.bandwidth=600; r6.latency=5;
		r6.grade='B'; r6.dualBand=true;

		r7.speed=220; r7.id=7; r7.warranty=2; r7.users=12; r7.range=50;
		r7.frequency=5; r7.cost=3900; r7.voltage=220; r7.bandwidth=650; r7.latency=4;
		r7.grade='A'; r7.dualBand=false;

		r8.speed=240; r8.id=8; r8.warranty=1; r8.users=14; r8.range=55;
		r8.frequency=5; r8.cost=4100; r8.voltage=230; r8.bandwidth=700; r8.latency=3;
		r8.grade='C'; r8.dualBand=true;

		r9.speed=260; r9.id=9; r9.warranty=2; r9.users=16; r9.range=60;
		r9.frequency=5; r9.cost=4300; r9.voltage=240; r9.bandwidth=750; r9.latency=2;
		r9.grade='B'; r9.dualBand=true;

		r10.speed=300; r10.id=10; r10.warranty=3; r10.users=20; r10.range=70;
		r10.frequency=5; r10.cost=4500; r10.voltage=240; r10.bandwidth=800; r10.latency=1;
		r10.grade='A'; r10.dualBand=true;

		System.out.println("r1: "+r1.id+" "+r1.speed+" "+r1.grade);
		System.out.println("r2: "+r2.id+" "+r2.speed+" "+r2.grade);
		System.out.println("r3: "+r3.id+" "+r3.speed+" "+r3.grade);
		System.out.println("r4: "+r4.id+" "+r4.speed+" "+r4.grade);
		System.out.println("r5: "+r5.id+" "+r5.speed+" "+r5.grade);
		System.out.println("r6: "+r6.id+" "+r6.speed+" "+r6.grade);
		System.out.println("r7: "+r7.id+" "+r7.speed+" "+r7.grade);
		System.out.println("r8: "+r8.id+" "+r8.speed+" "+r8.grade);
		System.out.println("r9: "+r9.id+" "+r9.speed+" "+r9.grade);
		System.out.println("r10: "+r10.id+" "+r10.speed+" "+r10.grade);
	}
}