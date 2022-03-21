package oop;

class Account {
	int accno;
	String name;
	double amount;
	
	public void insert(int acc, String nm, double amt) {
		accno = acc;
		name = nm;
		amount = amt;
	}
	
	public void deposit(double amt) {
		amount = amount + amt;
		System.out.println(amt+", deposited");
	}
	
	public void withdraw(double amt) {
		if(amount < amt) {
			System.out.println("Insufficient balance");
		} else {
			amount = amount - amt;
			System.out.println(amt+", withdrawn");
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance is "+amount);
	}
	
	public void display() {
		System.out.println("Accno is "+accno+", Name is "+name+", amount is "+amount);
	}
}

public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.insert(232345, "Karthik", 35000);
		a1.display();
		a1.checkBalance();
		a1.deposit(1000);
		a1.checkBalance();
		a1.withdraw(6000);
		a1.checkBalance();
		a1.display();
	}
}