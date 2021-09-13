package Task_1.AP;

public class Customer {
	private int id;
	private String name;
	private String address;
	private String number;
	private boolean savings;
	private boolean checkings;
	private static int idx=0;
	
	public Customer() {
		
		 id = 0;
		 name="\0";
		 address="\0";
		 number="\0";	
		 savings=false;
		 checkings=false;
		
	}
	public Customer(String name, String address, String number) {
		idx++;
		 this.id =idx;
		 this.name=name;
		 this.address=address;
		 this.number=number;
		 savings=false;
		 checkings=false;
			
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getNumber() {
		return number;
	}
	public boolean getsavings() {
		return savings;
	}
	public boolean getcheckings() {
		return checkings;
	}
 public void displaycustomer() {
	 System.out.println( "Account Holder's ID"+id );
	 System.out.println( "Account Holder's Name"+name );
	 System.out.println( "Account Holder's Address"+address );
	 System.out.println( "Account Holder's Number"+number );
 }
}
