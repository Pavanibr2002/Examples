package Example;
class Pets
{  
  Pets()
    {
  	System.out.println("Pet is created");
    }  
}  
class Rabbit extends Pets
{  
  Rabbit()
  {  
   //super(); 
   System.out.println("Rabbit is created");  
  }  
 } 

public class super3
{
  public static void main(String[] args)
	{  
		Rabbit d=new Rabbit();  
	}  
}

