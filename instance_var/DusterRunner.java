
class DusterRunner{
	public static void main(String[] args){
		Duster d=new Duster("Classmate",100,DusterType.CLOTH);

		DusterUser u1=new DusterUser("A","Red");
		DusterUser u2=new DusterUser("B","Blue");
		DusterUser u3=new DusterUser("C","Green");

		d.users=new DusterUser[]{u1,u2,u3};
		d.info();
	}
}