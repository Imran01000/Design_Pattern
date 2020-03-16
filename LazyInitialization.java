//ANOTHER CLASS.
class LazyInstance{
	
	//VARIABLES.
	int data1,data2,sum;
	
	//OBJECT OF CLASS.
	private static LazyInstance lazy = new LazyInstance();
	
	//CONSTRUCTOR.
	private LazyInstance() {};
	
	//METHOD WHICH RETURN CLASS OF AN OBJECT.
	public static LazyInstance getInstance()
	{
		return lazy;
	}
	
	//METHOD TO ADD TWO NUMBER.
	public int add(int data1, int data2)
	{
	
		this.data1 = data1;
		this.data2 = data2;
		sum = this.data1 + this.data2;
		return sum;
	}
}

//MAIN CLASS.
public class LazyInitialization {
	
	//MAIN METHOD.
	public static void main(String[] args) {
		
		//CREATING INSTANCE VARIABLE OF TYPE CLASS WHICH CATCH OBJECT OF AN CLASS.
		LazyInstance instance = LazyInstance.getInstance();
		System.out.println(instance.add(2, 2));
	}
}
