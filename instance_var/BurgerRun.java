
class BurgerRun{
	int quantity;
	String place;

	BurgerRun(int quantity,String place){
		this.quantity=quantity;
		this.place=place;
	}

	void details(){
		System.out.println(quantity+" "+place);
	}

	public Burger info(){
		return new Burger(150,"Veg","Spicy");
	}
}
