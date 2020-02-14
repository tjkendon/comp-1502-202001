
package le1p2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author aA = new Author("A. Author");
		Author aB = new Author("B. BookWriter");
		Author aC = new Author("C. Commedian");
		Author aD = new Author("D. Diarist");
		
		Book b1 = new Book("A First Book", "100", aA);
		Book b2 = new Book("A Second Book", "101", aA);
		Book b3 = new Book("A Third Book", "102", aA);
		Book b4 = new Book("A Serious Book", "200", aB);
		Book b5 = new Book("A Less Serious Book", "201", aB);
		Book b6 = new Book("A More Serious Book", "202", aB);
		Book b7 = new Book("Laugh!", "300", aC);
		Book b8 = new Book("LAUGH!!!", "301", aC);
		Book b9 = new Book("Are You Laughing Yet!?", "302", aC);
		Book b10 = new Book("Things That Happened", "400", aD);
		Book b11 = new Book("Other Things That Happened", "401", aD);
		
		Borrower c1 = new Borrower("Alice", 1001);
		Borrower c2 = new Borrower("Bob", 1002);
		Borrower c3 = new Borrower("Carol", 1003);
		Borrower c4 = new Borrower("Dave", 1004);
		
		c1.borrowBook(b1);
		c1.borrowBook(b2);
		c1.borrowBook(b3);
		
		c2.borrowBook(b1);
		c2.borrowBook(b4);
		c2.borrowBook(b7);
		c2.borrowBook(b10);
		
		c3.borrowBook(b7);
		c3.borrowBook(b10);
		c3.borrowBook(b11);
		
		c4.borrowBook(b1);
		c4.borrowBook(b2);
		c4.borrowBook(b3);
		c4.borrowBook(b4);
		c4.borrowBook(b5);
		c4.borrowBook(b6);
		c4.borrowBook(b7);
		c4.borrowBook(b8);
		c4.borrowBook(b9);
		c4.borrowBook(b10);
		c4.borrowBook(b11);
		
		System.out.println(c1.borrowedBookString());
		System.out.println(c1.borrowedAuthorString());
		
		System.out.println(c2.borrowedBookString());
		System.out.println(c2.borrowedAuthorString());
		
		System.out.println(c3.borrowedBookString());
		System.out.println(c3.borrowedAuthorString());
		
		System.out.println(c4.borrowedBookString());
		System.out.println(c4.borrowedAuthorString());
		
	}
	
	

}
