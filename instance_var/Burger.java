class Burger{
	int price;
	String type;
	String taste;

	Burger(int price,String type,String taste){
		this.price=price;
		this.type=type;
		this.taste=taste;
	}

	void show(){
		System.out.println(price+" "+type+" "+taste);
	}
}
