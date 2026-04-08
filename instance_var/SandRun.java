
class SandRun{
	int price;
	String place;

	SandRun(int price,String place){
		this.price=price;
		this.place=place;
	}

	void details(){
		System.out.println(price+" "+place);
	}

	public Sand info(){
		return new Sand(50,"Brown","River");
	}
}
