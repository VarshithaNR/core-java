class FlagRunner{
	public static void main(String[] args){
		Flag f1 = new Flag();
		Flag f2 = new Flag();
		Flag f3 = new Flag();
		Flag f4 = new Flag();
		Flag f5 = new Flag();
		
		System.out.println(f1.height + " " + f1.width + " " + f1.price + " " + f1.color + " " + f1.isNational);
		 
		f1.height = 176;
		f1.width = 20;
		f1.price = 150.5;
		f1.color = "red";
		f1.isNational = true;
		
		System.out.println(f1.height + " " + f1.width + " " + f1.price + " " + f1.color + " " + f1.isNational);
		
	
	}

}