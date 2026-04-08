
class DiamondRun{
	int price;
	String quality;

	DiamondRun(int price,String quality){
		this.price=price;
		this.quality=quality;
	}

	void details(){
		System.out.println(price+" "+quality);
	}

	public Diamond info(){
		return new Diamond(5,"White","Gem");
	}
}
