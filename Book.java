public class Book extends LibraryItem{
	private String author;
	private int numPage;
	
	public Book(String title,String itemID,String author, int numPage){
		super(title,itemID);
		this.author = author;
		this.numPage = numPage;
		
	}
	
}