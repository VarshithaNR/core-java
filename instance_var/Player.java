
class Player{
	String name;
	int age;
	PlayerType type;
	PlayerUser[] users;

	Player(String name,int age,PlayerType type){
		this.name=name;
		this.age=age;
		this.type=type;
	}

	void info(){
		System.out.println(name+" "+age+" "+type);
		if(users!=null){
			for(PlayerUser temp:users){
				if(temp!=null){
					temp.display();
				}
			}
		}
	}
}
