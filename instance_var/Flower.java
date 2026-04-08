class Flower{
	int price;
	String name;
	String color;

	Flower(int price,String name,String color){
		this.price=price;
		this.name=name;
		this.color=color;
	}

	void show(){
		System.out.println(price+" "+name+" "+color);
	}
}
