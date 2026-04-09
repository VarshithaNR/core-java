
class Duster{
	String brand;
	double price;
	DusterType type;
	DusterUser[] users;

	Duster(String brand,double price,DusterType type){
		this.brand=brand;
		this.price=price;
		this.type=type;
	}

	void info(){
		System.out.println(brand+" "+price+" "+type);
		if(users!=null){
			for(DusterUser temp:users){
				if(temp!=null){
					temp.display();
				}
			}
		}
	}
}
