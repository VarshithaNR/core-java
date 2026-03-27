class CabinetRunner {
	public static void main(String[] args) {

		Cabinet c1 = new Cabinet();
		Cabinet c2 = new Cabinet();
		Cabinet c3 = new Cabinet();
		Cabinet c4 = new Cabinet();
		Cabinet c5 = new Cabinet();
		Cabinet c6 = new Cabinet();
		Cabinet c7 = new Cabinet();
		Cabinet c8 = new Cabinet();
		Cabinet c9 = new Cabinet();
		Cabinet c10 = new Cabinet();

		c1.height=100; c1.width=50; c1.weight=40; c1.thickness=2; c1.cost=6000;
		c1.grade='A'; c1.lock=true; c1.capacity=200; c1.warranty=2; c1.id=1;

		c2.height=110; c2.width=55; c2.weight=42; c2.thickness=2.2; c2.cost=6200;
		c2.grade='B'; c2.lock=true; c2.capacity=210; c2.warranty=3; c2.id=2;

		c3.height=120; c3.width=60; c3.weight=45; c3.thickness=2.5; c3.cost=6500;
		c3.grade='A'; c3.lock=false; c3.capacity=220; c3.warranty=2; c3.id=3;

		c4.height=130; c4.width=65; c4.weight=48; c4.thickness=3; c4.cost=7000;
		c4.grade='C'; c4.lock=true; c4.capacity=230; c4.warranty=4; c4.id=4;

		c5.height=140; c5.width=70; c5.weight=50; c5.thickness=3.2; c5.cost=7200;
		c5.grade='A'; c5.lock=false; c5.capacity=240; c5.warranty=3; c5.id=5;

		c6.height=150; c6.width=75; c6.weight=52; c6.thickness=3.5; c6.cost=7500;
		c6.grade='B'; c6.lock=true; c6.capacity=250; c6.warranty=5; c6.id=6;

		c7.height=160; c7.width=80; c7.weight=55; c7.thickness=3.8; c7.cost=7800;
		c7.grade='A'; c7.lock=false; c7.capacity=260; c7.warranty=2; c7.id=7;

		c8.height=170; c8.width=85; c8.weight=58; c8.thickness=4; c8.cost=8000;
		c8.grade='C'; c8.lock=true; c8.capacity=270; c8.warranty=3; c8.id=8;

		c9.height=180; c9.width=90; c9.weight=60; c9.thickness=4.2; c9.cost=8200;
		c9.grade='B'; c9.lock=false; c9.capacity=280; c9.warranty=4; c9.id=9;

		c10.height=190; c10.width=95; c10.weight=65; c10.thickness=4.5; c10.cost=8500;
		c10.grade='A'; c10.lock=true; c10.capacity=300; c10.warranty=5; c10.id=10;

		System.out.println("c1: "+c1.shelves+" "+c1.price+" "+c1.type+" "+c1.wood+" "+c1.doors+" "+c1.height+" "+c1.width+" "+c1.weight+" "+c1.thickness+" "+c1.cost+" "+c1.grade+" "+c1.lock+" "+c1.capacity+" "+c1.warranty+" "+c1.id);

		System.out.println("c2: "+c2.shelves+" "+c2.price+" "+c2.type+" "+c2.wood+" "+c2.doors+" "+c2.height+" "+c2.width+" "+c2.weight+" "+c2.thickness+" "+c2.cost+" "+c2.grade+" "+c2.lock+" "+c2.capacity+" "+c2.warranty+" "+c2.id);

		System.out.println("c3: "+c3.shelves+" "+c3.price+" "+c3.type+" "+c3.wood+" "+c3.doors+" "+c3.height+" "+c3.width+" "+c3.weight+" "+c3.thickness+" "+c3.cost+" "+c3.grade+" "+c3.lock+" "+c3.capacity+" "+c3.warranty+" "+c3.id);

		System.out.println("c4: "+c4.shelves+" "+c4.price+" "+c4.type+" "+c4.wood+" "+c4.doors+" "+c4.height+" "+c4.width+" "+c4.weight+" "+c4.thickness+" "+c4.cost+" "+c4.grade+" "+c4.lock+" "+c4.capacity+" "+c4.warranty+" "+c4.id);

		System.out.println("c5: "+c5.shelves+" "+c5.price+" "+c5.type+" "+c5.wood+" "+c5.doors+" "+c5.height+" "+c5.width+" "+c5.weight+" "+c5.thickness+" "+c5.cost+" "+c5.grade+" "+c5.lock+" "+c5.capacity+" "+c5.warranty+" "+c5.id);

		System.out.println("c6: "+c6.shelves+" "+c6.price+" "+c6.type+" "+c6.wood+" "+c6.doors+" "+c6.height+" "+c6.width+" "+c6.weight+" "+c6.thickness+" "+c6.cost+" "+c6.grade+" "+c6.lock+" "+c6.capacity+" "+c6.warranty+" "+c6.id);

		System.out.println("c7: "+c7.shelves+" "+c7.price+" "+c7.type+" "+c7.wood+" "+c7.doors+" "+c7.height+" "+c7.width+" "+c7.weight+" "+c7.thickness+" "+c7.cost+" "+c7.grade+" "+c7.lock+" "+c7.capacity+" "+c7.warranty+" "+c7.id);

		System.out.println("c8: "+c8.shelves+" "+c8.price+" "+c8.type+" "+c8.wood+" "+c8.doors+" "+c8.height+" "+c8.width+" "+c8.weight+" "+c8.thickness+" "+c8.cost+" "+c8.grade+" "+c8.lock+" "+c8.capacity+" "+c8.warranty+" "+c8.id);

		System.out.println("c9: "+c9.shelves+" "+c9.price+" "+c9.type+" "+c9.wood+" "+c9.doors+" "+c9.height+" "+c9.width+" "+c9.weight+" "+c9.thickness+" "+c9.cost+" "+c9.grade+" "+c9.lock+" "+c9.capacity+" "+c9.warranty+" "+c9.id);

		System.out.println("c10: "+c10.shelves+" "+c10.price+" "+c10.type+" "+c10.wood+" "+c10.doors+" "+c10.height+" "+c10.width+" "+c10.weight+" "+c10.thickness+" "+c10.cost+" "+c10.grade+" "+c10.lock+" "+c10.capacity+" "+c10.warranty+" "+c10.id);
	}
}