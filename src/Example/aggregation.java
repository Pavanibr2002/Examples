package Example;
class Operation
{
	int square(int n)
	{
		return n*n;
	}
}
public class aggregation 
{
	Operation op;
	double pi=3.14;
	double area(int radius)
	{
		op=new Operation();
		int rsquare=op.square(radius);
		return pi*rsquare;
	}
   public static void main(String[] args) {
		aggregation a=new aggregation();
		double result=a.area(5);
		System.out.println(result);

	}

}
