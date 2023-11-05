package Example;
public class final1 
{
    final int speedlimit=90;//final variable  
     void run()
     {  
		  speedlimit=400;  // Compile Time error
	 } 
     
	 public static void main(String args[])
	 {  
		 final1 obj=new final1 ();  
		 obj.run();  
		 
	 }  
		 
}

