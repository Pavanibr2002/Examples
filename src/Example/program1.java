package Example;
class Employee
{
	int salary=40000;
}
public class program1 extends Employee
{
	int bonus=10000;
	public static void main(String[] args) {
		program1 p=new program1();
		System.out.println("Programmer salary is:"+p.salary);  
		System.out.println("Bonus of Programmer is:"+p.bonus);  


	}

}
