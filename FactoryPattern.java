import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Plan
{
	public double rate;
	public abstract void getRate();
	public void calculateBill(int unit)
	{
		System.out.println(unit*rate);
	}
}

class DomesticPlan extends Plan
{
	public void getRate()
	{
		rate = 4.5;
	}
}

class CommercialPlan extends Plan
{
	public void getRate()
	{
		rate = 2.4;
	}
}

class InstitutionalPlan extends Plan
{
	public void getRate()
	{
		rate = 9.2;
	}
}

class GetPlanFactory
{
	public Plan getPlan(String planType) 
	{
		if(planType == null)
			return null;
		
		if(planType.equalsIgnoreCase("domesticplan"))
		{
			return new DomesticPlan();
		}else if(planType.equalsIgnoreCase("commercialplan"))
		{
			return new CommercialPlan();
		}else if(planType.equalsIgnoreCase("institutionalplan"))
		{
			return new InstitutionalPlan();
		}
			
			return null;
	}
}
public class FactoryPattern 
{
	public static void main(String[] args) throws IOException
	{
		GetPlanFactory planFactory = new GetPlanFactory();
		System.out.println("Enter the name of plan for which you have to generate ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String stringInput = bufferedReader.readLine();
		System.out.println("Enter the number of unit");
		int unit = bufferedReader.read();
		Plan plan = planFactory.getPlan(stringInput);
		System.out.println("bill amount of "+stringInput+" of "+unit+" Unit."  );
		plan.getRate();
		plan.calculateBill(unit);
	}
}
