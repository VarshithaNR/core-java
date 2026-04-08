class Sword{
	int length;
	String type;
	String material;

	Sword(int length,String type,String material){
		this.length=length;
		this.type=type;
		this.material=material;
	}

	void show(){
		System.out.println(length+" "+type+" "+material);
	}
}
