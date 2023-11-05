package Example;
class Apple
{  
  Apple()
  {  
    System.out.println("parent class constructor invoked");  
  }  
}  


public class InstanceInitializer03 extends Apple
{
	InstanceInitializer03()
	{  
	 super();  
	 System.out.println("child class constructor invoked");  
	}  
		  
	{
		System.out.println("instance initializer block is invoked");
	}  
		  
	public static void main(String args[])
		{  
		InstanceInitializer03 b=new InstanceInitializer03();  
		}  

}

