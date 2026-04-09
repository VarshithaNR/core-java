
class File{
	String name;
	double size;
	FileType fileType;
	FileUser[] users;

	File(String name,double size,FileType fileType){
		this.name=name;
		this.size=size;
		this.fileType=fileType;
	}

	void info(){
		System.out.println(name+" "+size+" "+fileType);
		if(users!=null){
			for(FileUser temp:users){
				if(temp!=null){
					temp.display();
				}
			}
		}
	}
}
