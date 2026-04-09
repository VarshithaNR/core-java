
class HammerRunner{
	public static void main(String[] args){
		Hammer h=new Hammer("Bosch",800,HammerType.STEEL);

		HammerUser u1=new HammerUser("A","Carpentry");
		HammerUser u2=new HammerUser("B","Construction");
		HammerUser u3=new HammerUser("C","Repair");

		h.users=new HammerUser[]{u1,u2,u3};
		h.info();
	}
}