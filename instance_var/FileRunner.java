
class FileRunner{
	public static void main(String[] args){
		File f=new File("Doc1",2.5,FileType.PDF);

		FileUser u1=new FileUser("A","PDF");
		FileUser u2=new FileUser("B","DOC");
		FileUser u3=new FileUser("C","TXT");

		f.users=new FileUser[]{u1,u2,u3};
		f.info();
	}
}