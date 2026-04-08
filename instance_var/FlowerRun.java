
class FlowerRun{
	int quantity;
	String place;

	FlowerRun(int quantity,String place){
		this.quantity=quantity;
		this.place=place;
	}

	void details(){
		System.out.println(quantity+" "+place);
	}

	public Flower info(){
		return new Flower(20,"Rose","Red");
	}
}
