class PrimeNo{
	public static void main(String[] args){
		int num = 7;
		boolean prime = true;
		
		for(int i = 2; i <= num/2 ; i++){
			if(num%2==0){
				prime = false;
				return;
			}
		}
		if(prime){
			System.out.println("is a prime number: " +num);
		}
		else{
			System.out.println("is a NOT prime number: " +num);
		}
	}
	
}