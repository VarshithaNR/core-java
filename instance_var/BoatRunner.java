
class BoatRunner{
	public static void main(String[] args){
		Boat b=new Boat("SeaQueen",50000,BoatType.CRUISE);

		BoatUser u1=new BoatUser("A","Goa");
		BoatUser u2=new BoatUser("B","Kerala");
		BoatUser u3=new BoatUser("C","Mumbai");

		b.users=new BoatUser[]{u1,u2,u3};
		b.info();
	}
}