package rest_assignment05.assignment05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Serviceclass {
	List<Employee> list=new ArrayList<>(Arrays.asList(new Employee(101,"kamal","cse","software"),
			new Employee(102,"kpcreddy","cse","hardware")));
	public List<Employee> returnAll()
	{
		return list;
	}
	public Employee getEmp(Integer id)
	{
		return list.stream().filter(t->t.getEmpid().equals(id)).findFirst().get();
	}
	public void addEmp(Employee emp)
	{
		list.add(emp);
	}
	public void deleteEmp(Integer id)
	{
		list.removeIf(t->t.getEmpid().equals(id));
	}
	public void updateEmp(Integer id,Employee emp)
	{
		for(int i=0;i<list.size();i++)
		{
			Employee e=list.get(i);
			if(e.getEmpid().equals(id))
			{
				list.set(i, emp);
				return;
			}
		}
	}

}