public class LibrarySystem{
	public static void main(String[] args){
		Book book1 = new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240);
        Book book2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
        Book book3 = new Book("1984", "B003", "George Orwell", 328);
        Book book4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
        Book book5 = new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320);

        
        Magazine magazine1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society");
        Magazine magazine2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
        Magazine magazine3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
        Magazine magazine4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
        Magazine magazine5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");

        
        LibraryMember member1 = new LibraryMember("L001", "John Doe");
        LibraryMember member2 = new LibraryMember("L002", "Jane Smith");
        LibraryMember member3 = new LibraryMember("L003", "David Johnson");
        LibraryMember member4 = new LibraryMember("L004", "Sarah Williams");
        LibraryMember member5 = new LibraryMember("L005", "Michael Brown");
		
		LibraryItem[] items = {book1, book2, book3, book4, book5, magazine1, magazine2, magazine3, magazine4, magazine5};
        LibraryMember[] members = {member1, member2, member3, member4, member5};
		System.out.println("---------Library Items--------");
		System.out.println();
        for (LibraryItem item : items) {
            item.displayItemDetails();
            System.out.println();
        }
		System.out.println("----------Library Members!----------");
		System.out.println();
        for (LibraryMember member : members) {
            member.displayMemberDetails();
            System.out.println();
        }

	}
}
/*
---------Library Items--------

Title :The Catcher in the Rye
ItemID :B001

Title :To Kill a Mockingbird
ItemID :B002

Title :1984
ItemID :B003

Title :Pride and Prejudice
ItemID :B004

Title :The Hobbit
ItemID :B005

Title :National Geographic
ItemID :M001

Title :Time
ItemID :M002

Title :Forbes
ItemID :M003

Title :Vogue
ItemID :M004

Title :Sports Illustrated
ItemID :M005

----------Library Members!----------

Member ID: L001
Name: John Doe

Member ID: L002
Name: Jane Smith

Member ID: L003
Name: David Johnson

Member ID: L004
Name: Sarah Williams

Member ID: L005
Name: Michael Brown

*/

