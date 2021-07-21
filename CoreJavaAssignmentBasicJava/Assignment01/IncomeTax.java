package Assignment01;
import java.util.*;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int ctc=sc.nextInt();
		if(ctc>0 && ctc<180000)
		{
			System.out.println("Tax payable is Nil");
			
		}
		else if(ctc>180000 && ctc<300000)
		{
			int tax=(ctc*10)/100;
			System.out.println("Tax payble is :"+tax);
		}
		else if(ctc>300000 && ctc <500000)
		{
			int tax=(ctc*20)/100;
			System.out.println("Tax payble is :"+tax);
		}
		else if(ctc>500000 && ctc <1000000)
		{
			int tax=(ctc*30)/100;
			System.out.println("Tax payble is :"+tax);
		}
		

	}

}
