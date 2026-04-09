

class IronMan{
	String hero;
	int power;
	SuitType type;
	IronManUser[] users;

	IronMan(String hero,int power,SuitType type){
		this.hero=hero;
		this.power=power;
		this.type=type;
	}

	void info(){
		System.out.println(hero+" "+power+" "+type);
		if(users!=null){
			for(IronManUser temp:users){
				if(temp!=null){
					temp.display();
				}
			}
		}
	}
}
