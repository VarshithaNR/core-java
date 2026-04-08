class Sand{
	int weight;
	String color;
	String type;

	Sand(int weight,String color,String type){
		this.weight=weight;
		this.color=color;
		this.type=type;
	}

	void show(){
		System.out.println(weight+" "+color+" "+type);
	}
}
