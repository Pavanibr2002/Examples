package Example;
class A
{    
	A get()
	 {
		return this;
	  }    
}

public class covariant extends A
{
	@Override  
	covariant get()
	{
		return this;
	}    
	void message()
	{
		System.out.println("welcome to covariant return type");
	}    
	    
	public static void main(String args[])
	{    
		new covariant().get().message();    
	}   

}

