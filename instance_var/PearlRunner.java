
class PearlRunner{
	public static void main(String[] args){
		Pearl p=new Pearl("PearlCo",500,PearlType.WHITE);

		PearlUser u1=new PearlUser("A","India");
		PearlUser u2=new PearlUser("B","Japan");
		PearlUser u3=new PearlUser("C","China");

		p.users=new PearlUser[]{u1,u2,u3};
		p.info();
	}
}