class Card{
	int noOfPlayers;
	String name;
	String color;
	
	Card(int noOfPlayers,String name,String color){
		this.noOfPlayers=noOfPlayers;
		this.name=name;
		this.color=color;
	}
	
	void show(){
		System.out.println("noOfPlayers : "+this.noOfPlayers);
		System.out.println("name : "+this.name);
		System.out.println("color : "+this.color);
	}
}