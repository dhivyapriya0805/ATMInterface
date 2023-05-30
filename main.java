package ATMInterface;

import java.util.Scanner;

public class main 
{

	public static void main(String[] args) 
	{
		ATMOperation obj = new AtmImplementation() ;
		int ATMNumber = 12345;
		int ATMPin =123;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the ATM Machine!!!");
		System.out.println("Enter ATM Number :");
		int atmNumber =  sc.nextInt();
		System.out.println("Enter the Pin :");
		int atmPin = sc.nextInt();
		if((ATMNumber==atmNumber)&&(ATMPin == atmPin))
		{
			System.out.println("Verification Done");
			while(true)
			{
				System.out.println("==================================");
				System.out.println("1.Check Balance");
				System.out.println("2.Withdraw Amount");
				System.out.println("3.DepositAmount");
				System.out.println("4.View Mini Statement");
				System.out.println("5.Exit");
				System.out.println("==================================");
				System.out.println("Enter Choice :");
				int Option = sc.nextInt();
				if(Option ==1)
				{
					obj.CheckBalance();
				}
				else if(Option ==2)
				{
					System.out.println("Enter Amount to Withdraw :");
					double withdrawAmount  = sc.nextDouble();
					obj.withdrawAmount(withdrawAmount);
					
				}
				else if(Option ==3)
				{
					System.out.println("Enter Amount To Deposit :");
					double depositAmount = sc.nextDouble();
					obj.depositAmount(depositAmount);
				}
				else if(Option ==4)
				{
				     obj.viewMiniStatement();	
				}
				else if(Option==5)
				{
					System.out.println("Collect Your ATM Card");
					System.out.println("Thank you for Coming");
				}
				else
				{
					System.out.println("Something Wrong ! Try again later");
				}
				
				
			}
		}
		else
		{
			System.out.println("Incorrect ATM Number or Pin");
			
			
		}
		
		

	}

}
