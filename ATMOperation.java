package ATMInterface;

public interface ATMOperation 
{
	public void CheckBalance();
	public void withdrawAmount(double withdrawAmount);
	public void depositAmount(double depositAmount);
	public void viewMiniStatement();
}
