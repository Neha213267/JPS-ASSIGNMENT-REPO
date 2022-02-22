 

import java.util.ArrayList;
import java.util.List;

class Manager extends Assignment2Q2{
    @override
    
        Manager(int id, int salary)
        {
            super(id,salary);
        }
    
    public int getSalary(int salary) {
        int incentive = 5000;
        salary+=incentive;
        Salaryearned +=salary;
        employeeSalaries.add(Salaryearned);
        return(salary);
    }

}

class Labour extends Assignment2Q2{
    @Override
    
        Labour(int id, int salary)
        {
            super(id,salary);
        }
    
    public int getSalary(int salary) {
        int overtime = 500;
        int Salarybyhours =(salary/365)/9;
        salary += (Salarybyhours*1.5)*overtime;
        return(salary);
    }

}

class Assignment2Q2{
    int salary = 10000;
    int id;
    int earned=0;
    static int total;
    static List<Integer> employeeSalaries;

Assignment2Q2(int id,int salary){
    this.id=id;
    this.salary=salary;
    salaryearned=0;
}

    public int getsalary(int salary)
    {
        return salary;
    }
    public int receivesalary(int salary)
    {
        salary = getSalary(salary);
        salaryearned+=salary;
        return salaryearned;
    }

    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        for(i=0;i<employeeSalaries.size();i++)
        {
            total+=employeeSalaries.get(i);
        }
        return total;
    }
    public static void main(String[] args) {
        employeeSalaries= new Assignment2Q2<>();
        Assignment2Q2 emp_1= new Assignment2Q2(1,20000);
        Assignment2Q2 emp_2= new Assignment2Q2(2,50000);
        Manager emp_3= new manager(2,30000);
        Labour emp_4 =new laabour(2,10000);
        employeeSalaries.add(emp_1.receivesalary());
        employeeSalaries.add(emp_2.receivesalary());
        employeeSalaries.add(emp_3.receivesalary());
        employeeSalaries.add(emp_4.receivesalary());

        System.out.println(totalEmployeesSalary(employeeSalaries));
    }
}
