
class LightHouse{
	String name;
	double height;
	LightType type;
	LightHouseUser[] users;

	LightHouse(String name,double height,LightType type){
		this.name=name;
		this.height=height;
		this.type=type;
	}

	void info(){
		System.out.println(name+" "+height+" "+type);
		if(users!=null){
			for(LightHouseUser temp:users){
				if(temp!=null){
					temp.display();
				}
			}
		}
	}
}
