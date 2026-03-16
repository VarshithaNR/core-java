class Armstrong{
	public static void main(String[] args){
		int num = 1234;
		int sum = 0;
		int temp = num;
		
		while(num!=0){
			int digit = num%10;
			sum += digit*digit*digit;
			num = num/10;
		}
		
		if(sum==temp){
			System.out.println("is a amrstrong ");
		}
		else{
			System.out.println("is a NOT amrstrong ");
		}
	} 
}