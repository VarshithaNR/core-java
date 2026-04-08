
class SwordRun{
	int price;
	String origin;

	SwordRun(int price,String origin){
		this.price=price;
		this.origin=origin;
	}

	void details(){
		System.out.println(price+" "+origin);
	}

	public Sword info(){
		return new Sword(100,"Long","Steel");
	}
}
