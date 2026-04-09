
class PlayerRunner{
	public static void main(String[] args){
		Player p=new Player("Ravi",25,PlayerType.OUTDOOR);

		PlayerUser u1=new PlayerUser("A","Cricket");
		PlayerUser u2=new PlayerUser("B","Football");
		PlayerUser u3=new PlayerUser("C","Chess");

		p.users=new PlayerUser[]{u1,u2,u3};
		p.info();
	}
}