class LibaryRunner{
	public static void main(String[] args){
		LibaryBookName libaryBookName = new LibaryBookName();
		libaryBookName.saveBookName("Snow White");
		libaryBookName.saveBookName("Cindrella");
		libaryBookName.saveBookName("Rapenzul");
		libaryBookName.saveBookName("Alone in the wood");
		libaryBookName.saveBookName("barbie in the dream house");
		
		libaryBookName.search("amnsn s");
	}
}