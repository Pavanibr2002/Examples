package Example;
public class InstanceInitializer02
{
	  
	    int speed;  
	      
	    InstanceInitializer02()
	    {
	    	System.out.println("constructor is invoked");
	    }  
	   
	    {System.out.println("instance initializer block invoked");}  
	       
	    public static void main(String args[])
	    {  
	    	InstanceInitializer02 b1=new InstanceInitializer02();  
	    	InstanceInitializer02 b2=new InstanceInitializer02();  
	    } 

	
}
