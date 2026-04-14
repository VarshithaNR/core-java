class LibaryBookName{
	
	String[] names = new String[5];
	int index = 0;
	
	void saveBookName(String name){
		
		System.out.println("LibaryBookName running in method saveBookName");
		
		if(name!=null){
			System.out.println("name is not null");
			
			if(this.index<this.names.length){
				this.names[index]=name;
				System.out.println("name in the index "+this.names[index]);
				System.out.println("index of the book : "+this.index);
				this.index++;
			}
			else{
				System.out.println("Memory is full "+this.names.length);
			}
		}
		else{
			System.out.println("name is null");
		}
	}
	
	void search(String name){
		
		System.out.println("LibaryBookName running in method search");
		if(this.name!=null){
			System.out.println("name is not null");
			Boolean found = false;
			for(String temp : this.names){
				if(name == temp){
					System.out.println("book is found");
					found=true;
					break;
				}
			}
			if(!found){
				System.out.println("book not found");
			}
		}
		else{
			System.out.println("name is null");
		}
	}
}	