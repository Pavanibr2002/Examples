package Example;
class Anim
{  
	void eat()
	 {
		System.out.println("eating...");
	 }  
  }  

 class Doggy extends Anim
  {  
   void eat()
    {
	   System.out.println("eating bread...");
    }  
   void bark()
    {
	  System.out.println("barking...");
    }  
   void work()
   {  
    super.eat();  
    bark();  
    }  
}  

public class super2
{
	public static void main(String args[])
	{  
		Doggy d=new Doggy();  
		d.work();  
	}

}

