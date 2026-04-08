class Lock{
	int weight;
	String brand;
	String color;

	Lock(int weight,String brand,String color){
		this.weight=weight;
		this.brand=brand;
		this.color=color;
	}

	void show(){
		System.out.println(weight+" "+brand+" "+color);
	}
}
