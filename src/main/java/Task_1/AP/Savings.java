package Task_1.AP;
//import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Savings extends Accounts {
private double interest_rate;
private ArrayList<Integer>transactionZakat;

public Savings() {
	interest_rate=0;
	transactionZakat=new ArrayList<Integer>();
	
}

public Savings(Customer customer,double Balance) {
	super(customer,Balance);
	interest_rate=10;
	transactionZakat=new ArrayList<Integer>();
	
}

	@Override
	public void makeWithdrawal(double amount) {
		// TODO Auto-generated method stub
		if(amount<=Balance) {
			Balance-=amount;
			transactionDate.add(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss") );
			transactionAmount.add(amount);
			transactionBalance.add(Balance);
			}
			else System.out.println("insufficient");
	}

	@Override
	public void displayAllDeductions(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Zakat details:");
		for(int i=0;i<transactionZakat.size();++i) {
			System.out.println("amount withdrawal: " + transactionAmount.get(transactionZakat.get(i)));
			System.out.println("remaining balance: " + transactionBalance.get(transactionZakat.get(i)));
		}
	}
	
	public void calculateZakat() {
		if(Balance>=20000) {
		double zakat=(Balance*2.5)/100;	
		Balance-=zakat;
		System.out.println("Zakat details:"+zakat);
		 transactionDate.add(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss") );
			transactionAmount.add(zakat);
			transactionBalance.add(Balance);
			transactionZakat.add(transactionAmount.size() -1);
			
		}
		else {
			System.out.println("insufficient");
		}
	}
	public double getInterest() {
		return interest_rate;
	}
	 public void calculateInterest(double interest) {
		 interest_rate=interest;
		 System.out.println("interest"+interest_rate);
	 }

}
