package ATMInterface;

import java.util.HashMap;

import java.util.Map;

public class AtmImplementation implements ATMOperation
{
	ATM atm = new ATM();
	Map<Double,String>ministmt = new HashMap<>();
    @Override
    public void CheckBalance() 
    {
       System.out.println("Available Balance :"+atm.getBalance());
    }
    @Override
    public void withdrawAmount(double withdrawAmount) 
    {
    	if(withdrawAmount <=atm.getBalance())
    	{
    	ministmt.put(withdrawAmount," Amount Withdrawn");
    	System.out.println("Withdrawed Successfully "+ withdrawAmount);
        atm.setBalance(atm.getBalance()-withdrawAmount) ;
        CheckBalance();
    	}
    	else
    	{
    		System.out.println("InSufficient Balance");
    	}
    }
    @Override
    public void depositAmount(double depositAmount)
    {
    	ministmt.put(depositAmount,"Amount Deposit");
    	System.out.println(depositAmount+"Deposited Successfully");
    	atm.setBalance(atm.getBalance()+depositAmount);
    	CheckBalance();
    	
    }
    @Override
    public void viewMiniStatement() 
    {
       for(Map.Entry<Double, String> m:ministmt.entrySet())
       {
    	   System.out.println(m.getKey()+ " "+m.getValue());
       }
    }
}
