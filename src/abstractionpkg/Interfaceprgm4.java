package abstractionpkg;

import java.util.Scanner;

interface bank
{
	abstract public void accountdetails();
	abstract public void balance();
	abstract public void withdraw();
	abstract public void deposit();
}
class SBI implements bank
{
	int minbalance;
	String bankname;
	int accountno;
	String name;
	int withdraw;
	int deposite;
	@Override
	public void accountdetails() 
	{
		System.out.println("Enter account number:");
		Scanner sc=new Scanner(System.in);
		accountno=sc.nextInt();
		System.out.println("Enter your name :");
		name=sc.next();
	}
	@Override
	public void balance() {
		System.out.println("Enter account balance");
		Scanner sc=new Scanner(System.in);
		minbalance=sc.nextInt();
		System.out.println("account balance: "+minbalance);
		
	}
	@Override
	public void withdraw() {
		System.out.println("Enter withdraw amount");
		Scanner sc=new Scanner(System.in);
		withdraw=sc.nextInt();
		if(withdraw<minbalance)
		{
			minbalance=minbalance-withdraw;
			System.out.println(withdraw+" debited");
			System.out.println("balance after withdraw :"+ minbalance);
			System.out.println("Thank you");
		}
		else
		{
			System.out.println("insufficient balance");
		}
    }
	@Override
	public void deposit() {
		System.out.println("Enter amount to be deposite");
		Scanner sc=new Scanner(System.in);
		deposite=sc.nextInt();
		System.out.println("amount successfully credited to your account");
		minbalance=minbalance+deposite;
		System.out.println("your current balance is "+minbalance);
		System.out.println("Thank you");
		}
	
}

public class Interfaceprgm4 {

	public static void main(String[] args)
	{
		System.out.println("welcome to SBI");
		SBI obj=new SBI();
		obj.balance();
		obj.accountdetails();
		System.out.println("Enter an option  withdraw or deposit");
		Scanner sc=new Scanner(System.in);
		String option=sc.next();
		if(option.equals("withdraw"))
		{
			obj.withdraw();
		}
		else if(option.equals("deposit"))
		{ 
			obj.deposit();
		}
		else
		{
			System.out.println("invalid option");
		}
		
}

}
