package com.springRESTQ5;


	import org.springframework.stereotype.Service;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	@Service
	public class EmployeeService
	{
	    private List<Employee> emp = new ArrayList<>(Arrays.asList(
	            new Employee("001","Neha","Analyst","Sr. Analyst","25LPA"),
	            new Employee("002","Rishabh","IT","Sr.Developer","30LPA"),
	            new Employee("003","Astha","HR","HR Head","20LPA"),
	            new Employee("004","Tony","Purchase","Purchase Head","5LPA")
	    ));

	    public List<Employee> getAllEmployees()
	    {
	        return emp;
	    }

	    public Employee getEmployee(String employeeId)
	    {
	        return emp.stream().filter(t->t.getEmployeeId().equals(employeeId)).findFirst().get();
	    }

	    public void addEmployee(Employee employee)
	    {
	        emp.add(employee);
	    }

	    public void deleteEmployee(String employeeId)
	    {
	        emp.removeIf(t->t.getEmployeeId().equals(employeeId));
	    }

	    public void updateEmployee(String employeeId, Employee employee)
	    {
	        for (int i=0;i<emp.size();i++)
	        {
	            Employee t = emp.get(i);
	            if(t.getEmployeeId().equals(employeeId))
	            {
	                emp.set(i,employee);
	                return;
	            }
	        }
	    }
	

}
