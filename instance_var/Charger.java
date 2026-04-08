class Charger{
	int power;
	String brand;
	String color;

	Charger(int power,String brand,String color){
		this.power=power;
		this.brand=brand;
		this.color=color;
	}

	void show(){
		System.out.println(power+" "+brand+" "+color);
	}
}

