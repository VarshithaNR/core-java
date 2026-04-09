
class Hammer{
	String brand;
	double price;
	HammerType type;
	HammerUser[] users;

	Hammer(String brand,double price,HammerType type){
		this.brand=brand;
		this.price=price;
		this.type=type;
	}

	void info(){
		System.out.println(brand+" "+price+" "+type);
		if(users!=null){
			for(HammerUser temp:users){
				if(temp!=null){
					temp.display();
				}
			}
		}
	}
}
