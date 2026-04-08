
class LockRun{
	int price;
	String type;

	LockRun(int price,String type){
		this.price=price;
		this.type=type;
	}

	void details(){
		System.out.println(price+" "+type);
	}

	public Lock info(){
		return new Lock(500,"Godrej","Black");
	}
}
