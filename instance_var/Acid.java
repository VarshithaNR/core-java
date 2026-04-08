class Acid{
	int ph;
	String type;
	String color;

	Acid(int ph,String type,String color){
		this.ph=ph;
		this.type=type;
		this.color=color;
	}

	void show(){
		System.out.println(ph+" "+type+" "+color);
	}
}
