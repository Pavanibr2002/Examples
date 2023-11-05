package Example;
public class final02 
{
	 final void run(){System.out.println("running");}  
}  
		     
		class Honda extends final02
		{  
		   // Compile Time Error
			void run()  
		   {
			   System.out.println("running safely with 100kmph");
		   }  
		     
		   public static void main(String args[])
		   {  
		   Honda honda= new Honda();  
		   honda.run();  
		   }  
		}

