class LampRunner {
	public static void main(String[] args) {

		Lamp l1 = new Lamp(); Lamp l2 = new Lamp(); Lamp l3 = new Lamp();
		Lamp l4 = new Lamp(); Lamp l5 = new Lamp(); Lamp l6 = new Lamp();
		Lamp l7 = new Lamp(); Lamp l8 = new Lamp(); Lamp l9 = new Lamp(); Lamp l10 = new Lamp();

		l1.height=10; l1.width=5; l1.weight=2; l1.id=1; l1.warranty=1;
		l1.brightness=100; l1.voltage=220; l1.cost=1600; l1.power=20; l1.range=5;
		l1.grade='A'; l1.portable=true;

		l2.height=12; l2.width=6; l2.weight=3; l2.id=2; l2.warranty=2;
		l2.brightness=120; l2.voltage=220; l2.cost=1700; l2.power=22; l2.range=6;
		l2.grade='B'; l2.portable=true;

		l3.height=14; l3.width=7; l3.weight=3; l3.id=3; l3.warranty=1;
		l3.brightness=130; l3.voltage=230; l3.cost=1800; l3.power=24; l3.range=7;
		l3.grade='A'; l3.portable=false;

		l4.height=16; l4.width=8; l4.weight=4; l4.id=4; l4.warranty=2;
		l4.brightness=140; l4.voltage=230; l4.cost=1900; l4.power=26; l4.range=8;
		l4.grade='C'; l4.portable=true;

		l5.height=18; l5.width=9; l5.weight=4; l5.id=5; l5.warranty=3;
		l5.brightness=150; l5.voltage=240; l5.cost=2000; l5.power=28; l5.range=9;
		l5.grade='A'; l5.portable=false;

		l6.height=20; l6.width=10; l6.weight=5; l6.id=6; l6.warranty=2;
		l6.brightness=160; l6.voltage=240; l6.cost=2100; l6.power=30; l6.range=10;
		l6.grade='B'; l6.portable=true;

	
		l7.height=22; l7.width=11; l7.weight=5; l7.id=7; l7.warranty=1;
		l7.brightness=170; l7.voltage=220; l7.cost=2200; l7.power=32; l7.range=11;
		l7.grade='A'; l7.portable=false;

	
		l8.height=24; l8.width=12; l8.weight=6; l8.id=8; l8.warranty=3;
		l8.brightness=180; l8.voltage=230; l8.cost=2300; l8.power=34; l8.range=12;
		l8.grade='C'; l8.portable=true;

		l9.height=26; l9.width=13; l9.weight=6; l9.id=9; l9.warranty=2;
		l9.brightness=190; l9.voltage=240; l9.cost=2400; l9.power=36; l9.range=13;
		l9.grade='B'; l9.portable=false;

		l10.height=28; l10.width=14; l10.weight=7; l10.id=10; l10.warranty=3;
		l10.brightness=200; l10.voltage=240; l10.cost=2500; l10.power=38; l10.range=14;
		l10.grade='A'; l10.portable=true;

		System.out.println("l1: "+l1.height+" "+l1.width+" "+l1.weight+" "+l1.id+" "+l1.grade);
		System.out.println("l2: "+l2.height+" "+l2.width+" "+l2.weight+" "+l2.id+" "+l2.grade);
		System.out.println("l3: "+l3.height+" "+l3.width+" "+l3.weight+" "+l3.id+" "+l3.grade);
		System.out.println("l4: "+l4.height+" "+l4.width+" "+l4.weight+" "+l4.id+" "+l4.grade);
		System.out.println("l5: "+l5.height+" "+l5.width+" "+l5.weight+" "+l5.id+" "+l5.grade);
		System.out.println("l6: "+l6.height+" "+l6.width+" "+l6.weight+" "+l6.id+" "+l6.grade);
		System.out.println("l7: "+l7.height+" "+l7.width+" "+l7.weight+" "+l7.id+" "+l7.grade);
		System.out.println("l8: "+l8.height+" "+l8.width+" "+l8.weight+" "+l8.id+" "+l8.grade);
		System.out.println("l9: "+l9.height+" "+l9.width+" "+l9.weight+" "+l9.id+" "+l9.grade);
		System.out.println("l10: "+l10.height+" "+l10.width+" "+l10.weight+" "+l10.id+" "+l10.grade);
	}
}