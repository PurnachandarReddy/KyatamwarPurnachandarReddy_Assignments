package Assignment02;
//AccountType class has two sub-classes
//Saving And Current

public class AccountType {
	public void totalCash()
	{
		
	}

	public static void main(String[] args) {
		AccountType obj1=new Saving();
		AccountType obj2=new Current();
		obj1.totalCash();
		obj2.totalCash();

	}

}
