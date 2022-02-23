
import java.util.HashSet;
import java.util.Set;

class Employees
{
	int empid,empSalary;
	String empName,empDept;
	public Employees(int empid,String empName, int empSalary, String empDept)
	{
		super();
		this.empid=empid;
		this.empName=empName;
		this.empSalary=empSalary;
		this.empDept=empDept;
	}
	

@Override
	public String toString() {
		return "Employees [empid=" + empid + ", empSalary=" + empSalary + ", empName=" + empName + ", empDept=" + empDept + "]";
	}
}


public class GenericsQ1 {
	public static void main(String[] args)
	{
		Employees e1=new Employees(121,"Neha",50000,"IT");
		Employees e2=new Employees(121,"Kat",45000,"Bank");
		Employees e3=new Employees(131,"Cassie",55000,"Tax");
        Employees e4=new Employees(131,"Rue",78000,"Developer");
        Employees e5=new Employees(131,"Maddy",85000,"Gaming");
		Set<Employees> employees= new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
        employees.add(e4);
        employees.add(e5);
		for (Employees employees2 : employees) {
			System.out.println(employees2);
			
		}
	}
}