class PalendromeString{
	public static void main(String[] args){
		String str = "Varshitha";
		String rev = " ";
		
		for (int i=str.length()-1;i>=0;i--){
			rev = rev+str.charAt(i);
		}
	if(str==rev){
		System.out.println(str+ " is a palendrome  " +rev);
	}
	else{
		System.out.println(str+ " is NOT a palendrome : " +rev);
	}
	}
}