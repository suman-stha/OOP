package oop;

public class BankAccount implements IRate  {
	//Define variable
	String accountNumber;
	
	//static >> belongs to the CLASS not he object instance
	//final >> constant(often static final)
	private static final String routingNumber="013546";
	
	//instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance=0;
	
	
	//Constructor definition: unique methods
	//1.They are used to define /setup /initialize properties of an object
	//2. COnstructors are IMPLICITLY called upon INSTANTIATION
	//3.the same name as the class itself
	//4. Constructors have NO return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading: call same method name  with different arguments
	
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: "+accountType);
	}
	BankAccount(String accountTye, double initDeposit){
		
		//initDeposit, accountType, Msg are local variables
		System.out.println("NEW ACCOUNT: "+accountType);
		System.out.println("INITIAL DEPOSIT: "+initDeposit);
		
		String Msg =null;
		if(initDeposit<1000) {
			Msg="Error: Minimum deposit must to be at least $1000";
		}
		else {
			 Msg="Thanks for your initial deposit of : $ "+ initDeposit;
		}
		System.out.println(Msg);
		balance=initDeposit;
	}
	
	//Getters/Setters
	
	public void setName(String name) {
		this.name=name;
	}
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//Interface methods
	
public void setRate() {
		
		System.out.println("SETTING RATE");
		
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	// Define methods 
	
	public void deposit(double amount) {
		balance=balance+amount;
		showActivity("DEPOSIT");
		
	}
	
	
	

	void withdraw(double amount) {
		balance=balance- amount;
		showActivity("WITHDRAW");
	}
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSATION: "+activity); 
		System.out.println("YOUR NEW BALANCE IS : $"+ balance);
	}
	void getStatus() {
		System.out.println("Balance: "+balance);
		
	}

	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}
	public String toString() {
		return"[name: " +name+ ".ACCOUNT#"+accountNumber+".ROUTING #"+routingNumber+". BALANCE: $ "+ balance+ "]";
	}


	
		
	}
