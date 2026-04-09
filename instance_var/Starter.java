
class Starter{
	String brand;
	double price;
	StarterType type;
	StarterUser[] users;

	Starter(String brand,double price,StarterType type){
		this.brand=brand;
		this.price=price;
		this.type=type;
	}

	void info(){
		System.out.println(brand+" "+price+" "+type);
		if(users!=null){
			for(StarterUser temp:users){
				if(temp!=null){
					temp.display();
				}
			}
		}
	}
}
