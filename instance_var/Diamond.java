class Diamond{
	int weight;
	String color;
	String type;

	Diamond(int weight,String color,String type){
		this.weight=weight;
		this.color=color;
		this.type=type;
	}

	void show(){
		System.out.println(weight+" "+color+" "+type);
	}
}
