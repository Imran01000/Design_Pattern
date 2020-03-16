
public class EagerInitialization {
	int data1,data2,res;
	private static EagerInitialization eager= new EagerInitialization();
	private EagerInitialization() {};
	public static EagerInitialization getEagerInitialization()
	{
		return eager;
	}
	public int add(int data1, int data2)
	{
		this.data1 = data1;
		this.data2 = data2;
		res = this.data1 + this.data2;
		return res;
	}
}
class SingletonDemo{
	public static void main(String[] args) {
		EagerInitialization demo = EagerInitialization.getEagerInitialization();
		System.out.println(demo.add(19, 45));
	}
	
	
}