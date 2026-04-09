

class Pearl{
	String brand;
	double price;
	PearlType type;
	PearlUser[] users;

	Pearl(String brand,double price,PearlType type){
		this.brand=brand;
		this.price=price;
		this.type=type;
	}

	void info(){
		System.out.println(brand+" "+price+" "+type);
		if(users!=null){
			for(PearlUser temp:users){
				if(temp!=null){
					temp.display();
				}
			}
		}
	}
}
