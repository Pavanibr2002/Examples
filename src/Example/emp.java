package Example;

public class emp {
	int id;
	String name;
	address addr;
	public emp(int id,String name,address addr)
	{
		this.id=id;
		this.name=name;
		this.addr=addr;
	}
	void display()
	{
		System.out.println(id+ " "+ name);
		System.out.println(addr.city+" "+addr.state+ " "+addr.country);
	}
	public static void main(String args[])
	{
		address ad1=new address("g2b","UP","India");
		address ad2=new address("uyf","MP","India");
		address ad3=new address("iug","HP","India");
		emp e1=new emp(111,"Varun",ad1);
		emp e2=new emp(222,"Ann",ad2);
		emp e3=new emp(333,"Mary",ad3);
		e1.display();
		e2.display();
		e3.display();
	}
}
