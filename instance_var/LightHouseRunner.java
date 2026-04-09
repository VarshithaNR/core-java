
class LightHouseRunner{
	public static void main(String[] args){
		LightHouse l=new LightHouse("GoaLight",120,LightType.LED);

		LightHouseUser u1=new LightHouseUser("A","Watch");
		LightHouseUser u2=new LightHouseUser("B","Maintain");
		LightHouseUser u3=new LightHouseUser("C","Signal");

		l.users=new LightHouseUser[]{u1,u2,u3};
		l.info();
	}
}