package ProxyDesignPattern;

//INTERFACE 
interface OfficeInternetAccess
{
	public void grantInternetAccess();
}

//CLASS WHICH IMPLEMENTS INTERFACE.
class RealInternetAccess implements OfficeInternetAccess
{
	private String employeeName;
	public RealInternetAccess(String empName) 
	{
		this.employeeName = empName;
	}

	public void grantInternetAccess() 
	{
		System.out.println("Internet access granted for the given employee...");
	}
}

//CLASS WHICH IMPLEMENTS INTERFACE.
class ProxyInternetAccess implements OfficeInternetAccess
{
	private String employeeName;
	private RealInternetAccess realaccess ;
	public ProxyInternetAccess(String empName)
	{
		this.employeeName = empName;
	}
	public void grantInternetAccess()
	{
		if(getRole(employeeName) > 4)
		{
			realaccess = new RealInternetAccess(employeeName);
			realaccess.grantInternetAccess();
		}
		else
		{
			System.out.println("Not internet service granted to you. your are below 5 SORRY!!");
		}
	}
	public int getRole(String employeeName)
	{
		return 5;
	}
}

//MAIN CLASS.
public class ProxyPattern 
{
	public static void main(String[] args) 
	{
		OfficeInternetAccess access = new ProxyInternetAccess("navin");
				access.grantInternetAccess();
	}
}
