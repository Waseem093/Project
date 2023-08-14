abstract class LibraryItem{
	private String title;
	private String itemID;
	private boolean checkOut;
	
	
	
	public LibraryItem(String title,String itemID ){
		this.title = title;
		this.itemID = itemID;
		this.checkOut=false;
		
		
	}
	public void checkOut(){
		this.checkOut=true;
	}
	public void checkIn(){
		this.checkOut=false;
	}
	
	
	public void displayItemDetails(){
		System.out.println("Title :"+title);
		System.out.println("ItemID :"+itemID);
		
	}
	
	
}