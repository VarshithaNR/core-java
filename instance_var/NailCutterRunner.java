class NailCutterRunner{
	public static void main(String... args){

		NailCutter nailCutter = new NailCutter("Sivate",200,NailType.SMALL);

		UserName u1 = new UserName("Varshitha","Sivate");
		UserName u2 = new UserName("Ravi","Nova");
		UserName u3 = new UserName("Anu","Syska");

		UserName[] users = {u1,u2,u3};

		nailCutter.userName = users;

		nailCutter.info();
	}
}