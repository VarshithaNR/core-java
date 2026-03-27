class MouseRunner {
	public static void main(String[] args) {

		Mouse m1 = new Mouse(); Mouse m2 = new Mouse(); Mouse m3 = new Mouse();
		Mouse m4 = new Mouse(); Mouse m5 = new Mouse(); Mouse m6 = new Mouse();
		Mouse m7 = new Mouse(); Mouse m8 = new Mouse(); Mouse m9 = new Mouse(); Mouse m10 = new Mouse();

		m1.weight=200; m1.id=1; m1.warranty=2; m1.clicks=1000; m1.speed=10;
		m1.range=10; m1.battery=3000; m1.cost=600; m1.length=12; m1.width=6; m1.grade='A'; m1.rgb=true;

		m2.weight=210; m2.id=2; m2.warranty=3; m2.clicks=1100; m2.speed=12;
		m2.range=11; m2.battery=3200; m2.cost=650; m2.length=13; m2.width=7; m2.grade='B'; m2.rgb=true;

		m3.weight=220; m3.id=3; m3.warranty=2; m3.clicks=1200; m3.speed=14;
		m3.range=12; m3.battery=3400; m3.cost=700; m3.length=14; m3.width=8; m3.grade='A'; m3.rgb=false;

		m4.weight=230; m4.id=4; m4.warranty=1; m4.clicks=1300; m4.speed=16;
		m4.range=13; m4.battery=3600; m4.cost=750; m4.length=15; m4.width=9; m4.grade='C'; m4.rgb=true;

		m5.weight=240; m5.id=5; m5.warranty=2; m5.clicks=1400; m5.speed=18;
		m5.range=14; m5.battery=3800; m5.cost=800; m5.length=16; m5.width=10; m5.grade='A'; m5.rgb=false;

		m6.weight=250; m6.id=6; m6.warranty=3; m6.clicks=1500; m6.speed=20;
		m6.range=15; m6.battery=4000; m6.cost=850; m6.length=17; m6.width=11; m6.grade='B'; m6.rgb=true;

		m7.weight=260; m7.id=7; m7.warranty=2; m7.clicks=1600; m7.speed=22;
		m7.range=16; m7.battery=4200; m7.cost=900; m7.length=18; m7.width=12; m7.grade='A'; m7.rgb=false;

		m8.weight=270; m8.id=8; m8.warranty=1; m8.clicks=1700; m8.speed=24;
		m8.range=17; m8.battery=4400; m8.cost=950; m8.length=19; m8.width=13; m8.grade='C'; m8.rgb=true;

		m9.weight=280; m9.id=9; m9.warranty=2; m9.clicks=1800; m9.speed=26;
		m9.range=18; m9.battery=4600; m9.cost=1000; m9.length=20; m9.width=14; m9.grade='B'; m9.rgb=false;

		m10.weight=290; m10.id=10; m10.warranty=3; m10.clicks=1900; m10.speed=28;
		m10.range=19; m10.battery=4800; m10.cost=1100; m10.length=21; m10.width=15; m10.grade='A'; m10.rgb=true;

		System.out.println("m1: "+m1.id+" "+m1.weight+" "+m1.grade);
		System.out.println("m2: "+m2.id+" "+m2.weight+" "+m2.grade);
		System.out.println("m3: "+m3.id+" "+m3.weight+" "+m3.grade);
		System.out.println("m4: "+m4.id+" "+m4.weight+" "+m4.grade);
		System.out.println("m5: "+m5.id+" "+m5.weight+" "+m5.grade);
		System.out.println("m6: "+m6.id+" "+m6.weight+" "+m6.grade);
		System.out.println("m7: "+m7.id+" "+m7.weight+" "+m7.grade);
		System.out.println("m8: "+m8.id+" "+m8.weight+" "+m8.grade);
		System.out.println("m9: "+m9.id+" "+m9.weight+" "+m9.grade);
		System.out.println("m10: "+m10.id+" "+m10.weight+" "+m10.grade);
	}
}