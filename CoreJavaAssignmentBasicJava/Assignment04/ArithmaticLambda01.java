package Assignment04;

public class ArithmaticLambda01 {
	public static void main(String args[])
	{
		MyLambda var=(a,b)-> System.out.println(a+b);
		var.perform(10, 5);
		MyLambda var1=(a,b)-> System.out.println(a-b);
		var1.perform(10, 5);
		MyLambda var2=(a,b)-> System.out.println(a/b);
		var2.perform(10, 5);
		MyLambda var3=(a,b)-> System.out.println(a*b);
		var3.perform(10, 5);
		
	}

}
interface MyLambda
{
	void perform(int a,int b);
}