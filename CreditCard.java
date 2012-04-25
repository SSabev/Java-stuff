public class CreditCard
{
	private int expiryMonth;
	private int expiryYear;
	private String firstName;
	private String lastName;
	private String ccNumber;
	private final String NOW = "02/11";

	public String getExpiryDate()
	{
		return (expiryMonth + "/" + expiryYear);
	}
	
	public String getName()
	{
		return (firstName + " " + lastName);
	}
	
	public String getCcNumber()
	{
		return ccNumber;
	}
	
	public boolean isExpired()
	{
		int month = Integer.parseInt(NOW.substring(0,1));
		int year = Integer.parseInt(NOW.substring(3,4));
		
		if (expiryMonth < month && expiryYear < year) return false;
		else return true;
	}
	
	public String toString()
	{
		String ccNum = getCcNumber();
		String name = getName();
		String ExpDate = getExpiryDate();
		String s = ccNum + '\n' + name + '\n' + ExpDate + '\n';
		
		if (isExpired())
			s += "Expired";
		else s += "Not expired";
		
		return s;
	}
	
	public CreditCard(int ExpMonth, int ExpYear, String fName, String lName, String cNum)
	{
		expiryMonth = ExpMonth;
		expiryYear = ExpYear;
		firstName = fName;
		lastName = lName;
		ccNumber = cNum;
	}
	
}