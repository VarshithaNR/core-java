class CardRun{
	int noOfSymbol;
	String type;
	
	CardRun(int noOfSymbol,String type){
		this.noOfSymbol=noOfSymbol;
		this.type=type;
	}
	
	void details(){
		System.out.println("noOfSymbol: "+this.noOfSymbol);
		System.out.println("type: "+this.type);
	}
	
	public Card info(){
		Card card = new Card(4,"varshu","black");
		return card;
	}
}