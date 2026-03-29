class ProjectorRunner {
	public static void main(String[] args) {

		Projector p1 = new Projector();
		Projector p2 = new Projector();
		Projector p3 = new Projector();
		Projector p4 = new Projector();
		Projector p5 = new Projector();
		Projector p6 = new Projector();
		Projector p7 = new Projector();
		Projector p8 = new Projector();
		Projector p9 = new Projector();
		Projector p10 = new Projector();

		p1.weight=2; p1.width=20; p1.height=10; p1.brightness=3000; p1.cost=21000; p1.grade='A'; p1.wifi=true; p1.battery=5000; p1.warranty=2; p1.id=1;
		p2.weight=2.2; p2.width=22; p2.height=11; p2.brightness=3200; p2.cost=22000; p2.grade='B'; p2.wifi=false; p2.battery=4800; p2.warranty=1; p2.id=2;
		p3.weight=2.5; p3.width=24; p3.height=12; p3.brightness=3400; p3.cost=23000; p3.grade='A'; p3.wifi=true; p3.battery=5200; p3.warranty=2; p3.id=3;
		p4.weight=2.8; p4.width=26; p4.height=13; p4.brightness=3600; p4.cost=24000; p4.grade='C'; p4.wifi=false; p4.battery=4500; p4.warranty=1; p4.id=4;
		p5.weight=3; p5.width=28; p5.height=14; p5.brightness=3800; p5.cost=25000; p5.grade='A'; p5.wifi=true; p5.battery=5500; p5.warranty=2; p5.id=5;
		p6.weight=3.2; p6.width=30; p6.height=15; p6.brightness=4000; p6.cost=26000; p6.grade='B'; p6.wifi=false; p6.battery=5000; p6.warranty=1; p6.id=6;
		p7.weight=3.5; p7.width=32; p7.height=16; p7.brightness=4200; p7.cost=27000; p7.grade='A'; p7.wifi=true; p7.battery=5800; p7.warranty=2; p7.id=7;
		p8.weight=3.8; p8.width=34; p8.height=17; p8.brightness=4400; p8.cost=28000; p8.grade='C'; p8.wifi=false; p8.battery=4700; p8.warranty=1; p8.id=8;
		p9.weight=4; p9.width=36; p9.height=18; p9.brightness=4600; p9.cost=29000; p9.grade='B'; p9.wifi=true; p9.battery=6000; p9.warranty=2; p9.id=9;
		p10.weight=4.5; p10.width=38; p10.height=19; p10.brightness=4800; p10.cost=30000; p10.grade='A'; p10.wifi=true; p10.battery=6200; p10.warranty=3; p10.id=10;

		System.out.println("p1: "+p1.resolution+" "+p1.price+" "+p1.type+" "+p1.portable+" "+p1.lumens+" "+p1.weight+" "+p1.width+" "+p1.height+" "+p1.brightness+" "+p1.cost+" "+p1.grade+" "+p1.wifi+" "+p1.battery+" "+p1.warranty+" "+p1.id);
		System.out.println("p2: "+p2.resolution+" "+p2.price+" "+p2.type+" "+p2.portable+" "+p2.lumens+" "+p2.weight+" "+p2.width+" "+p2.height+" "+p2.brightness+" "+p2.cost+" "+p2.grade+" "+p2.wifi+" "+p2.battery+" "+p2.warranty+" "+p2.id);
		System.out.println("p3: "+p3.resolution+" "+p3.price+" "+p3.type+" "+p3.portable+" "+p3.lumens+" "+p3.weight+" "+p3.width+" "+p3.height+" "+p3.brightness+" "+p3.cost+" "+p3.grade+" "+p3.wifi+" "+p3.battery+" "+p3.warranty+" "+p3.id);
		System.out.println("p4: "+p4.resolution+" "+p4.price+" "+p4.type+" "+p4.portable+" "+p4.lumens+" "+p4.weight+" "+p4.width+" "+p4.height+" "+p4.brightness+" "+p4.cost+" "+p4.grade+" "+p4.wifi+" "+p4.battery+" "+p4.warranty+" "+p4.id);
		System.out.println("p5: "+p5.resolution+" "+p5.price+" "+p5.type+" "+p5.portable+" "+p5.lumens+" "+p5.weight+" "+p5.width+" "+p5.height+" "+p5.brightness+" "+p5.cost+" "+p5.grade+" "+p5.wifi+" "+p5.battery+" "+p5.warranty+" "+p5.id);
		System.out.println("p6: "+p6.resolution+" "+p6.price+" "+p6.type+" "+p6.portable+" "+p6.lumens+" "+p6.weight+" "+p6.width+" "+p6.height+" "+p6.brightness+" "+p6.cost+" "+p6.grade+" "+p6.wifi+" "+p6.battery+" "+p6.warranty+" "+p6.id);
		System.out.println("p7: "+p7.resolution+" "+p7.price+" "+p7.type+" "+p7.portable+" "+p7.lumens+" "+p7.weight+" "+p7.width+" "+p7.height+" "+p7.brightness+" "+p7.cost+" "+p7.grade+" "+p7.wifi+" "+p7.battery+" "+p7.warranty+" "+p7.id);
		System.out.println("p8: "+p8.resolution+" "+p8.price+" "+p8.type+" "+p8.portable+" "+p8.lumens+" "+p8.weight+" "+p8.width+" "+p8.height+" "+p8.brightness+" "+p8.cost+" "+p8.grade+" "+p8.wifi+" "+p8.battery+" "+p8.warranty+" "+p8.id);
		System.out.println("p9: "+p9.resolution+" "+p9.price+" "+p9.type+" "+p9.portable+" "+p9.lumens+" "+p9.weight+" "+p9.width+" "+p9.height+" "+p9.brightness+" "+p9.cost+" "+p9.grade+" "+p9.wifi+" "+p9.battery+" "+p9.warranty+" "+p9.id);
		System.out.println("p10: "+p10.resolution+" "+p10.price+" "+p10.type+" "+p10.portable+" "+p10.lumens+" "+p10.weight+" "+p10.width+" "+p10.height+" "+p10.brightness+" "+p10.cost+" "+p10.grade+" "+p10.wifi+" "+p10.battery+" "+p10.warranty+" "+p10.id);
	}
}