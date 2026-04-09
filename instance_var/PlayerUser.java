class PlayerUser{
	String name;
	String game;

	PlayerUser(String name,String game){
		this.name=name;
		this.game=game;
	}

	void display(){
		System.out.println(name+" "+game);
	}
}
