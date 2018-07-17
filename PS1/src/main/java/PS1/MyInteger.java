package PS1;

public class MyInteger {

	private int iValue;
	
	public MyInteger(int iValue)
	{
		this.iValue = iValue;
	}
	 
	public boolean isEven()
	{		
		return MyInteger.isEven(iValue);
	}
	
	public boolean isOdd()
	{
		return !isEven();
	}
	
	public boolean isPrime() throws Exception
	{ 
		return MyInteger.isPrime(iValue);
	}
	
	public boolean isEquals(int eq) 
	{
		return (eq == iValue);
	}
	
	public boolean isEquals(MyInteger myInt)
	{
		return(myInt.iValue == iValue);
	}
	
	public static boolean isEven(int iValue)
	{
		return (iValue % 2 == 0);
	}
	
	public static boolean isOdd(int iValue)
	{
		return !isEven(iValue);
	}
	
	public static boolean isPrime(int iValue) throws Exception
	{
		if (iValue > 100)
			throw new Exception("iValue too large");
		
		
		boolean isPrime = true;
		for (int i = 2; i <= (iValue / 2 ); i++)
		{
			if (iValue % i == 0)
			{
				return false;
			}
		}
		return isPrime;
	}

	public static boolean isEven(MyInteger myInt)
	{
		return (MyInteger.isEven(myInt.iValue));

	}
	
	public static boolean isOdd(MyInteger myInt)
	{
		return !(MyInteger.isEven(myInt.iValue));
	}
	
	public static boolean isPrime(MyInteger myInt) throws Exception
	{
		return (MyInteger.isPrime(myInt.iValue));
	}
}




