
class ChargerRun{
	int price;
	String type;

	ChargerRun(int price,String type){
		this.price=price;
		this.type=type;
	}

	void details(){
		System.out.println(price+" "+type);
	}

	public Charger info(){
		Charger c=new Charger(65,"MI","White");
		return c;
	}
}
