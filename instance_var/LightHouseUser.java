class LightHouseUser{
	String name;
	String duty;

	LightHouseUser(String name,String duty){
		this.name=name;
		this.duty=duty;
	}

	void display(){
		System.out.println(name+" "+duty);
	}
}
