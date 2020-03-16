import javax.management.RuntimeErrorException;

//ANOTHER CLASS.
 class StaticBlockInitializataion {
	
	//VARIABLES.
	int data1,data2,sum;
	
	//CREATING REFRENCE OF VARIABLE.
	private static StaticBlockInitializataion block;
	
	//CREATING CONSTRUCTOR.
	private StaticBlockInitializataion(){};
	
	//STATIC BLOCK.
	static
	{
		block = new StaticBlockInitializataion();
	}
	
	//METHOD OF CLASS TYPE WHICH RETURNS CLASS OBJECT.
	public static StaticBlockInitializataion getInstance()
	{
		return block;
	}
	
	//METHOD TO ADD TWO INTEGER.
	public int add(int data1, int data2)
	{
	
		this.data1 = data1;
		this.data2 = data2;
		sum = this.data1 + this.data2;
		return sum;
	}
}

//MAIN CLASS 
public class GetInstance{
	public static void main(String[] args) {
	
		StaticBlockInitializataion getObject = StaticBlockInitializataion.getInstance();
		System.out.println(getObject.add(2, 3));
	}
	
	
}

	
