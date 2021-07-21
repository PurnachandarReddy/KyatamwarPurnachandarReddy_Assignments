package Assignment01;
public class ArmstrongNumbers {

	public static void main(String[] args) {
		for(int n=100;n<1000;n++)
		{
			int temp,r,sum=0;
			temp=n;
			while(temp>0)
			{
				r=temp%10;
				sum+=(r*r*r);
				temp=temp/10;
			}
			if(sum==n)
			{
				System.out.println(sum);
			}
		}

	}
}