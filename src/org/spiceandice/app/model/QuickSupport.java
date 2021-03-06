package org.spiceandice.app.model;

public class QuickSupport {
	
	public QuickSupport(String name, String email, String bookingNumber, String status, String comments) {
		super();
		this.name = name;
		this.email = email;
		this.bookingNumber = bookingNumber;
		this.status = status;
		this.comments = comments;
	}
	public String name;
	public String email;
	public String bookingNumber;
	public String status;
	public String comments;
	@Override
	public String toString() {
		return "{\"quickSupportData\":{"+
				"\"name\" :\""+this.name+
				"\",\"email\" :\"" +this.email+
				"\",\"bookingNumber\" :\"" +this.bookingNumber+
				"\",\"status\" :\"" +this.status+
				"\",\"comments\" :\"" +this.comments+
				"\"}}";
	}
}
