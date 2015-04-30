
public class Library {
	
	private int bookID;
    private String ISBN;
    private String bookName;
    private double price;
    
    public Library(int bookID, String ISBN, String bookName, double price ){
    	
    	this.bookID = bookID;
    	this.ISBN = ISBN;
    	this.bookName = bookName;
    	this.price = price;
    	
    }

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String toString(){
		return this.bookName+ " " + this.price;
										
	} 
}
