
class AcidRun{
	int volume;
	String use;

	AcidRun(int volume,String use){
		this.volume=volume;
		this.use=use;
	}

	void details(){
		System.out.println(volume+" "+use);
	}

	public Acid info(){
		return new Acid(2,"Strong","Clear");
	}
}
