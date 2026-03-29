class FireRunner {
	public static void main(String[] args) {

		Fire f1 = new Fire();
		Fire f2 = new Fire();
		Fire f3 = new Fire();
		Fire f4 = new Fire();
		Fire f5 = new Fire();
		Fire f6 = new Fire();
		Fire f7 = new Fire();
		Fire f8 = new Fire();
		Fire f9 = new Fire();
		Fire f10 = new Fire();

		f1.spread=10; f1.heat=200; f1.smoke=1.2; f1.speed=2.5; f1.cost=500; f1.grade='A'; f1.controlled=true; f1.fuel=50; f1.time=5; f1.id=1;
		f2.spread=12; f2.heat=210; f2.smoke=1.4; f2.speed=2.7; f2.cost=550; f2.grade='B'; f2.controlled=false; f2.fuel=55; f2.time=6; f2.id=2;
		f3.spread=14; f3.heat=220; f3.smoke=1.6; f3.speed=2.9; f3.cost=600; f3.grade='A'; f3.controlled=true; f3.fuel=60; f3.time=7; f3.id=3;
		f4.spread=16; f4.heat=230; f4.smoke=1.8; f4.speed=3.1; f4.cost=650; f4.grade='C'; f4.controlled=false; f4.fuel=65; f4.time=8; f4.id=4;
		f5.spread=18; f5.heat=240; f5.smoke=2.0; f5.speed=3.3; f5.cost=700; f5.grade='A'; f5.controlled=true; f5.fuel=70; f5.time=9; f5.id=5;
		f6.spread=20; f6.heat=250; f6.smoke=2.2; f6.speed=3.5; f6.cost=750; f6.grade='B'; f6.controlled=false; f6.fuel=75; f6.time=10; f6.id=6;
		f7.spread=22; f7.heat=260; f7.smoke=2.4; f7.speed=3.7; f7.cost=800; f7.grade='A'; f7.controlled=true; f7.fuel=80; f7.time=11; f7.id=7;
		f8.spread=24; f8.heat=270; f8.smoke=2.6; f8.speed=3.9; f8.cost=850; f8.grade='C'; f8.controlled=false; f8.fuel=85; f8.time=12; f8.id=8;
		f9.spread=26; f9.heat=280; f9.smoke=2.8; f9.speed=4.1; f9.cost=900; f9.grade='B'; f9.controlled=true; f9.fuel=90; f9.time=13; f9.id=9;
		f10.spread=28; f10.heat=300; f10.smoke=3.0; f10.speed=4.5; f10.cost=1000; f10.grade='A'; f10.controlled=true; f10.fuel=100; f10.time=14; f10.id=10;

		System.out.println("f1: "+f1.temperature+" "+f1.intensity+" "+f1.type+" "+f1.dangerous+" "+f1.duration+" "+f1.spread+" "+f1.heat+" "+f1.smoke+" "+f1.speed+" "+f1.cost+" "+f1.grade+" "+f1.controlled+" "+f1.fuel+" "+f1.time+" "+f1.id);
		System.out.println("f2: "+f2.temperature+" "+f2.intensity+" "+f2.type+" "+f2.dangerous+" "+f2.duration+" "+f2.spread+" "+f2.heat+" "+f2.smoke+" "+f2.speed+" "+f2.cost+" "+f2.grade+" "+f2.controlled+" "+f2.fuel+" "+f2.time+" "+f2.id);
		System.out.println("f3: "+f3.temperature+" "+f3.intensity+" "+f3.type+" "+f3.dangerous+" "+f3.duration+" "+f3.spread+" "+f3.heat+" "+f3.smoke+" "+f3.speed+" "+f3.cost+" "+f3.grade+" "+f3.controlled+" "+f3.fuel+" "+f3.time+" "+f3.id);
		System.out.println("f4: "+f4.temperature+" "+f4.intensity+" "+f4.type+" "+f4.dangerous+" "+f4.duration+" "+f4.spread+" "+f4.heat+" "+f4.smoke+" "+f4.speed+" "+f4.cost+" "+f4.grade+" "+f4.controlled+" "+f4.fuel+" "+f4.time+" "+f4.id);
		System.out.println("f5: "+f5.temperature+" "+f5.intensity+" "+f5.type+" "+f5.dangerous+" "+f5.duration+" "+f5.spread+" "+f5.heat+" "+f5.smoke+" "+f5.speed+" "+f5.cost+" "+f5.grade+" "+f5.controlled+" "+f5.fuel+" "+f5.time+" "+f5.id);
		System.out.println("f6: "+f6.temperature+" "+f6.intensity+" "+f6.type+" "+f6.dangerous+" "+f6.duration+" "+f6.spread+" "+f6.heat+" "+f6.smoke+" "+f6.speed+" "+f6.cost+" "+f6.grade+" "+f6.controlled+" "+f6.fuel+" "+f6.time+" "+f6.id);
		System.out.println("f7: "+f7.temperature+" "+f7.intensity+" "+f7.type+" "+f7.dangerous+" "+f7.duration+" "+f7.spread+" "+f7.heat+" "+f7.smoke+" "+f7.speed+" "+f7.cost+" "+f7.grade+" "+f7.controlled+" "+f7.fuel+" "+f7.time+" "+f7.id);
		System.out.println("f8: "+f8.temperature+" "+f8.intensity+" "+f8.type+" "+f8.dangerous+" "+f8.duration+" "+f8.spread+" "+f8.heat+" "+f8.smoke+" "+f8.speed+" "+f8.cost+" "+f8.grade+" "+f8.controlled+" "+f8.fuel+" "+f8.time+" "+f8.id);
		System.out.println("f9: "+f9.temperature+" "+f9.intensity+" "+f9.type+" "+f9.dangerous+" "+f9.duration+" "+f9.spread+" "+f9.heat+" "+f9.smoke+" "+f9.speed+" "+f9.cost+" "+f9.grade+" "+f9.controlled+" "+f9.fuel+" "+f9.time+" "+f9.id);
		System.out.println("f10: "+f10.temperature+" "+f10.intensity+" "+f10.type+" "+f10.dangerous+" "+f10.duration+" "+f10.spread+" "+f10.heat+" "+f10.smoke+" "+f10.speed+" "+f10.cost+" "+f10.grade+" "+f10.controlled+" "+f10.fuel+" "+f10.time+" "+f10.id);
	}
}