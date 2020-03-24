package designPattren;
import java.util.List;
import java.util.ArrayList;

class Employees {
	
	//CREATING ARRAYLIST OBJECT WHICH IS HOLDED BY LIST INTERFACE REFRENCE VARIABLE.
	private List<String> empList = new ArrayList<String>();
	
	//PARAMETERIZED CONSTRUCTOR.
	public Employees(List<String> list)
	{
		this.empList = list;
	}
	
	//LOAD DATA METHOD.
	public void loadData()
	{
		empList.add("ramesh");
		empList.add("ishant");
		empList.add("harish");
	}
	
	//METHOD TO RETURN LIST.
	public List<String> getEmpList()
	{
		return this.empList;
	}
	
	//OBJECT TYPE METHOD CLONE .
	public Object clone() throws CloneNotSupportedException
	{
		List<String> copy = new ArrayList<String>();
		for (String string : this.empList) {
				copy.add(string);
		}
		return new Employees(copy);
	}
	
}

//MAIN CLASS.
public class PrototypePattrenTest {
	public static void main(String[] args) {
		Employees emps = new Employees();
		emps.loadData();
		Employees emp1 = (Employees)emps.clone();
		Employees emp2 = (Employees)emps.clone();
		List<String> list1 = emp1.getEmpList();
		list1.add("john");
		List<String> list2 = emp2.getEmpList();
		list2.remove("ramesh");
		System.out.println();
	}
}
