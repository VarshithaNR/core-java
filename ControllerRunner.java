class ControllerRunner {
	public static void main(String[] args) {

		Controller c1=new Controller(); Controller c2=new Controller(); Controller c3=new Controller();
		Controller c4=new Controller(); Controller c5=new Controller(); Controller c6=new Controller();
		Controller c7=new Controller(); Controller c8=new Controller(); Controller c9=new Controller(); Controller c10=new Controller();

		c1.id=1; c1.warranty=1; c1.battery=2000; c1.range=10; c1.clicks=100;
		c1.cost=3200; c1.voltage=5; c1.weight=300; c1.size=15; c1.speed=10; c1.grade='A'; c1.vibration=true;

		c2.id=2; c2.warranty=2; c2.battery=2200; c2.range=12; c2.clicks=120;
		c2.cost=3300; c2.voltage=5; c2.weight=320; c2.size=16; c2.speed=12; c2.grade='B'; c2.vibration=true;

		c3.id=3; c3.warranty=1; c3.battery=2400; c3.range=14; c3.clicks=140;
		c3.cost=3400; c3.voltage=5; c3.weight=340; c3.size=17; c3.speed=14; c3.grade='A'; c3.vibration=false;

		c4.id=4; c4.warranty=2; c4.battery=2600; c4.range=16; c4.clicks=160;
		c4.cost=3500; c4.voltage=5; c4.weight=360; c4.size=18; c4.speed=16; c4.grade='C'; c4.vibration=true;

		c5.id=5; c5.warranty=3; c5.battery=2800; c5.range=18; c5.clicks=180;
		c5.cost=3600; c5.voltage=5; c5.weight=380; c5.size=19; c5.speed=18; c5.grade='A'; c5.vibration=false;

		c6.id=6; c6.warranty=2; c6.battery=3000; c6.range=20; c6.clicks=200;
		c6.cost=3700; c6.voltage=5; c6.weight=400; c6.size=20; c6.speed=20; c6.grade='B'; c6.vibration=true;

		c7.id=7; c7.warranty=1; c7.battery=3200; c7.range=22; c7.clicks=220;
		c7.cost=3800; c7.voltage=5; c7.weight=420; c7.size=21; c7.speed=22; c7.grade='A'; c7.vibration=false;

		c8.id=8; c8.warranty=3; c8.battery=3400; c8.range=24; c8.clicks=240;
		c8.cost=3900; c8.voltage=5; c8.weight=440; c8.size=22; c8.speed=24; c8.grade='C'; c8.vibration=true;

		c9.id=9; c9.warranty=2; c9.battery=3600; c9.range=26; c9.clicks=260;
		c9.cost=4000; c9.voltage=5; c9.weight=460; c9.size=23; c9.speed=26; c9.grade='B'; c9.vibration=false;

		c10.id=10; c10.warranty=3; c10.battery=3800; c10.range=28; c10.clicks=280;
		c10.cost=4200; c10.voltage=5; c10.weight=480; c10.size=24; c10.speed=28; c10.grade='A'; c10.vibration=true;

		System.out.println("c1: "+c1.id+" "+c1.battery+" "+c1.grade);
		System.out.println("c10: "+c10.id+" "+c10.battery+" "+c10.grade);
	}
}