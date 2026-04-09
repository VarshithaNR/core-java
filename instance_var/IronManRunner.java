
class IronManRunner{
	public static void main(String[] args){
		IronMan i=new IronMan("Tony",100,SuitType.MARK1);

		IronManUser u1=new IronManUser("A","Mark1");
		IronManUser u2=new IronManUser("B","Mark2");
		IronManUser u3=new IronManUser("C","Mark3");

		i.users=new IronManUser[]{u1,u2,u3};
		i.info();
	}
}