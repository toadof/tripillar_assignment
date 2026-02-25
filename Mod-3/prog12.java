import java.util.*;
class BankAccount{
	private int accountNumber;
	private int balance=1000;
	 void deposit(int dep){
		balance+=dep;
	}
	 void withdraw(int with){
		balance-=with;
	}
	 int balance(){
		return this.balance;
	}

}
public class prog12{
	
	public static void main(String[] args){
		BankAccount obj=new BankAccount();
		obj.deposit(100);
		System.out.println(obj.balance());
		obj.withdraw(500);
		System.out.println(obj.balance());
	}}

