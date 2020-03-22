package designPattren;

//BILL PUG SINGLETON PATTERN.
//ANOTHER CLASS 
class Test
{
	//CONTRUCTOR.
	private Test() {};
	
	//INNER CLASS.
	private static class Inner
	{
		private static Test instance = new Test();
	}

	//METHOD WHICH RETURNS CLASS OBJECT.
	public static Test returnInstance()
	{
		return Inner.instance;
	}
	
	//METHOD.
	public void method1()
	{
		System.out.println("Test class method");
	}
}

//MAIN CLASS.
public class lazypattern 
{
	//MAIN METHOD
	public static void main(String[] args) {
		Test object = Test.returnInstance();
		object.method1();
	}
}
