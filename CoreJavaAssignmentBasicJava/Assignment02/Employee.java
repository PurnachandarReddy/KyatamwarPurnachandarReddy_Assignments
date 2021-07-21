package Assignment02;
//Employee has two subclasses 
//Manager and Labour
public class Employee {
	public void totalSalary()
	{
		
	}

	public static void main(String[] args) {
		Employee emp=new Manager();
		Employee lab=new Labour();
		emp.totalSalary();
		lab.totalSalary();

	}

}
