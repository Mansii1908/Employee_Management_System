import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class EmployeeService {
    HashSet<Employee> empset=new HashSet<Employee>();
    Employee emp1=new Employee(101, "Mansi", 24, "Developer", "IT", 25000);
    Employee emp2=new Employee(102, "Shreyank", 26, "Tester", "CO", 57000);
    Employee emp3=new Employee(103, "Kavya", 20, "DevOps Eng", "Admin", 20000);
    Employee emp4=new Employee(104, "Rudra", 27, "System Eng", "CO", 70000);

    Scanner sc=new Scanner(System.in);
    boolean found=false;
    int id;
    String name;
    int age;
    String department;
    String designation;
    double sal;

    public EmployeeService()
    {
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);
    }
    // view all employees
    public void viewAllEmps() {
        for(Employee emp:empset)
        {
            System.out.println(emp);
        }
    }
    // view employees based on their id
    public void viewEmp()
    {
        boolean found=false;
        System.out.println("Enter id:");
        id=sc.nextInt();
        for(Employee emp:empset)
        {
            if(emp.getId()==id)
            {
                System.out.println(emp);
                found=true;
            }
        }
        if(!found) {
            System.out.println("Employee with this id is not present");
        }
    }
    // update the employee
    public void updateEmployee()
    {
        // name and salary of the employee will be updated
        System.out.println("Enter id:");
        id=sc.nextInt();
        boolean found=false;
        for(Employee emp:empset)
        {
            if(emp.getId()==id)
            {
                System.out.println("Enter new name:");
                name=sc.next();
                System.out.println("Enter new salary");
                sal=sc.nextDouble();
                emp.setName(name);
                emp.setSalary(sal);
                System.out.println("Updated details of employee are:");
                System.out.println(emp);
                found=true;
            }
        }
        if(!found)
        {
            System.out.println("Employee is not present!!");
        }
        else {
            System.out.println("Employee details updated successfully!!");
        }
    }
    // delete the employee
    public void deleteEmp()
    {
        System.out.println("Enter id:");
        id=sc.nextInt();
        boolean found=false;
        Employee empdelete=null;
        for(Employee emp:empset)
        {
            if(emp.getId()==id)
            {
                empdelete=emp;
                found=true;
            }
        }
        if(!found)
        {
            System.out.println("Employee is not present!!");
        }
        else {
            // delete the employee
            empset.remove(empdelete);
            System.out.println("Employee deleted successfully!!");
        }

    }
    // Add the employee
    public void addEmp()
    {
        System.out.println("Enter id:");
        id=sc.nextInt();
        System.out.println("Enter name:");
        name=sc.next();
        System.out.println("Enter age");
        age=sc.nextInt();
        System.out.println("Enter designation");
        designation=sc.next();
        System.out.println("Enter department");
        department=sc.next();
        System.out.println("Enter salary");
        sal=sc.nextDouble();

        Employee emp=new Employee(id, name, age, designation, department, sal);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee added successfully!!");

    }


}
