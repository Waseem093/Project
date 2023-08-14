public class Magazine extends LibraryItem{
	public String issuedate;
	public String publisher;
	
	
	public Magazine(String title,String itemID,String issuedate,String publisher){
		super(title,itemID);
		this.issuedate = issuedate;
		this.publisher = publisher;
		
	}
	
}