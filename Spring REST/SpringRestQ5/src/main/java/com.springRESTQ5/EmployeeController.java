package com.springRESTQ5;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.bind.annotation.RequestMethod;

	//import java.util.Arrays;
	import java.util.List;

	@RestController
	public class EmployeeController
	{
	    @Autowired
	    private EmployeeService employeeService;

	    @RequestMapping("/employees")
	    public List<Employee> getAllEmployees()
	    {
	        return employeeService.getAllEmployees();
	    }

	    @RequestMapping("/employees/{employeeId}")
	    public Employee getEmployee(@PathVariable String employeeId)
	    {
	        return employeeService.getEmployee(employeeId);
	    }

	    @RequestMapping(method = RequestMethod.POST,value = "/employees")
	    public void addTopic(@RequestBody Employee emp)
	    {
	        employeeService.addEmployee(emp);
	    }

	    @RequestMapping(method=RequestMethod.PUT,value="/employees/{employeeId}")
	    public void updateEmployee(@RequestBody Employee employee, @PathVariable String employeeId)
	    {
	        employeeService.updateEmployee(employeeId,employee);
	    }

}
