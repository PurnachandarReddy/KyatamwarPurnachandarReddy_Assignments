package Assignment02;

public class AbstractClass extends Abstract{
	public void show1()
	{
		System.out.println("Implementation is done by overriding the method1");
	}
	public void show2()
	{
		System.out.println("Implementation is done by overriding the method2 ");
	}
	public static void main(String[] args) {
		AbstractClass obj=new AbstractClass();
		obj.show1();
		obj.show2();
		


	}

}
