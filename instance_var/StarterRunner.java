
class StarterRunner{
	public static void main(String[] args){
		Starter s=new Starter("Hero",1500,StarterType.ELECTRIC);

		StarterUser u1=new StarterUser("A","Bike");
		StarterUser u2=new StarterUser("B","Car");
		StarterUser u3=new StarterUser("C","Scooter");

		s.users=new StarterUser[]{u1,u2,u3};
		s.info();
	}
}