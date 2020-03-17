
//ANOTHER CLASS
 class UseObject {
	
	//VARIABLES.
	int data1,data2,result;
	
	//CREATING OBJECT REFERENCE VARIABLE .
	private static UseObject thread;
	
	//CONSTRUCTOR.
	private UseObject() {};
	
	//CLASS TYPE METHOD.
	public static synchronized UseObject getInstance()
	{
		if(thread == null)
			thread = new UseObject();
		return thread;
	}
	
	//METHOD TO MULTIPLY TO INTEGER.
	public int multiply(int data1,int data2)
	{
		this.data1 = data1;
		this.data2 = data2;
		result = this.data1 * this.data2;
		return result;
	}
}
 
 //MAIN CLASS.
public class ThreadSafeSingleton{
	
	//MAIN METHOD.
	public static void main(String[] args) 
	{
		UseObject get = UseObject.getInstance();
		System.out.println(get.multiply(10, 12));
	}
}
