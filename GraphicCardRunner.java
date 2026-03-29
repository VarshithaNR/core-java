class GraphicCardRunner {
	public static void main(String[] args) {

		GraphicCard g1 = new GraphicCard();
		GraphicCard g2 = new GraphicCard();
		GraphicCard g3 = new GraphicCard();
		GraphicCard g4 = new GraphicCard();
		GraphicCard g5 = new GraphicCard();
		GraphicCard g6 = new GraphicCard();
		GraphicCard g7 = new GraphicCard();
		GraphicCard g8 = new GraphicCard();
		GraphicCard g9 = new GraphicCard();
		GraphicCard g10 = new GraphicCard();

		g1.clockSpeed=1500; g1.bandwidth=256; g1.power=150; g1.temperature=70; g1.cost=26000; g1.grade='A'; g1.rayTracing=true; g1.fans=2; g1.warranty=3; g1.id=1;
		g2.clockSpeed=1550; g2.bandwidth=260; g2.power=160; g2.temperature=72; g2.cost=27000; g2.grade='B'; g2.rayTracing=false; g2.fans=2; g2.warranty=2; g2.id=2;
		g3.clockSpeed=1600; g3.bandwidth=270; g3.power=170; g3.temperature=74; g3.cost=28000; g3.grade='A'; g3.rayTracing=true; g3.fans=3; g3.warranty=3; g3.id=3;
		g4.clockSpeed=1650; g4.bandwidth=280; g4.power=180; g4.temperature=76; g4.cost=29000; g4.grade='C'; g4.rayTracing=false; g4.fans=2; g4.warranty=1; g4.id=4;
		g5.clockSpeed=1700; g5.bandwidth=290; g5.power=190; g5.temperature=78; g5.cost=30000; g5.grade='A'; g5.rayTracing=true; g5.fans=3; g5.warranty=3; g5.id=5;
		g6.clockSpeed=1750; g6.bandwidth=300; g6.power=200; g6.temperature=80; g6.cost=31000; g6.grade='B'; g6.rayTracing=false; g6.fans=2; g6.warranty=2; g6.id=6;
		g7.clockSpeed=1800; g7.bandwidth=310; g7.power=210; g7.temperature=82; g7.cost=32000; g7.grade='A'; g7.rayTracing=true; g7.fans=3; g7.warranty=3; g7.id=7;
		g8.clockSpeed=1850; g8.bandwidth=320; g8.power=220; g8.temperature=84; g8.cost=33000; g8.grade='C'; g8.rayTracing=false; g8.fans=2; g8.warranty=1; g8.id=8;
		g9.clockSpeed=1900; g9.bandwidth=330; g9.power=230; g9.temperature=86; g9.cost=34000; g9.grade='B'; g9.rayTracing=true; g9.fans=3; g9.warranty=2; g9.id=9;
		g10.clockSpeed=2000; g10.bandwidth=350; g10.power=250; g10.temperature=90; g10.cost=36000; g10.grade='A'; g10.rayTracing=true; g10.fans=3; g10.warranty=3; g10.id=10;

		System.out.println("g1: "+g1.memory+" "+g1.price+" "+g1.type+" "+g1.dedicated+" "+g1.cores+" "+g1.clockSpeed+" "+g1.bandwidth+" "+g1.power+" "+g1.temperature+" "+g1.cost+" "+g1.grade+" "+g1.rayTracing+" "+g1.fans+" "+g1.warranty+" "+g1.id);
		System.out.println("g2: "+g2.memory+" "+g2.price+" "+g2.type+" "+g2.dedicated+" "+g2.cores+" "+g2.clockSpeed+" "+g2.bandwidth+" "+g2.power+" "+g2.temperature+" "+g2.cost+" "+g2.grade+" "+g2.rayTracing+" "+g2.fans+" "+g2.warranty+" "+g2.id);
		System.out.println("g3: "+g3.memory+" "+g3.price+" "+g3.type+" "+g3.dedicated+" "+g3.cores+" "+g3.clockSpeed+" "+g3.bandwidth+" "+g3.power+" "+g3.temperature+" "+g3.cost+" "+g3.grade+" "+g3.rayTracing+" "+g3.fans+" "+g3.warranty+" "+g3.id);
		System.out.println("g4: "+g4.memory+" "+g4.price+" "+g4.type+" "+g4.dedicated+" "+g4.cores+" "+g4.clockSpeed+" "+g4.bandwidth+" "+g4.power+" "+g4.temperature+" "+g4.cost+" "+g4.grade+" "+g4.rayTracing+" "+g4.fans+" "+g4.warranty+" "+g4.id);
		System.out.println("g5: "+g5.memory+" "+g5.price+" "+g5.type+" "+g5.dedicated+" "+g5.cores+" "+g5.clockSpeed+" "+g5.bandwidth+" "+g5.power+" "+g5.temperature+" "+g5.cost+" "+g5.grade+" "+g5.rayTracing+" "+g5.fans+" "+g5.warranty+" "+g5.id);
		System.out.println("g6: "+g6.memory+" "+g6.price+" "+g6.type+" "+g6.dedicated+" "+g6.cores+" "+g6.clockSpeed+" "+g6.bandwidth+" "+g6.power+" "+g6.temperature+" "+g6.cost+" "+g6.grade+" "+g6.rayTracing+" "+g6.fans+" "+g6.warranty+" "+g6.id);
		System.out.println("g7: "+g7.memory+" "+g7.price+" "+g7.type+" "+g7.dedicated+" "+g7.cores+" "+g7.clockSpeed+" "+g7.bandwidth+" "+g7.power+" "+g7.temperature+" "+g7.cost+" "+g7.grade+" "+g7.rayTracing+" "+g7.fans+" "+g7.warranty+" "+g7.id);
		System.out.println("g8: "+g8.memory+" "+g8.price+" "+g8.type+" "+g8.dedicated+" "+g8.cores+" "+g8.clockSpeed+" "+g8.bandwidth+" "+g8.power+" "+g8.temperature+" "+g8.cost+" "+g8.grade+" "+g8.rayTracing+" "+g8.fans+" "+g8.warranty+" "+g8.id);
		System.out.println("g9: "+g9.memory+" "+g9.price+" "+g9.type+" "+g9.dedicated+" "+g9.cores+" "+g9.clockSpeed+" "+g9.bandwidth+" "+g9.power+" "+g9.temperature+" "+g9.cost+" "+g9.grade+" "+g9.rayTracing+" "+g9.fans+" "+g9.warranty+" "+g9.id);
		System.out.println("g10: "+g10.memory+" "+g10.price+" "+g10.type+" "+g10.dedicated+" "+g10.cores+" "+g10.clockSpeed+" "+g10.bandwidth+" "+g10.power+" "+g10.temperature+" "+g10.cost+" "+g10.grade+" "+g10.rayTracing+" "+g10.fans+" "+g10.warranty+" "+g10.id);
	}
}