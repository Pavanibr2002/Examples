package Example;
public class InstanceInitializer1
{
	 
	    int speed;  
	      
	    InstanceInitializer1()
	    {
	    	System.out.println("speed is "+speed);
	    }  
	   
	    {speed=100;}  
	       
	    public static void main(String[] args)
	    {  
	    	InstanceInitializer1 b1=new InstanceInitializer1();  
	    	InstanceInitializer1 b2=new InstanceInitializer1();  
	    }      
	
}

