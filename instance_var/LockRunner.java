
class LockRunner{
	public static void main(String[] args){
		LockRun lr=new LockRun(800,"Door");
		lr.details();
		Lock l=lr.info();
		l.show();
	}
}