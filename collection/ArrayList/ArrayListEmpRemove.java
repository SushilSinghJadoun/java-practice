import java.util.*;
class ArrayListEmpRemove
{
	public static void main(String... args)
	{
		ArrayList<Emp> al=new ArrayList<>();
		al.add(new Emp(1001,"A"));
		al.add(new Emp(1002,"B"));
		al.add(new Emp(1003,"C"));
		al.add(new Emp(1004,"D"));
		Iterator<Emp> i=al.iterator();
		while(i.hasNext())
		{
			Emp z=i.next();
			System.out.print(z.id);
			System.out.print(" "+z.name);
			System.out.println(" ");
		}
		Emp e=new Emp(1004,"D");
		al.remove(e);
		System.out.println("After Removing Element");
		i=al.iterator();
		while(i.hasNext())
		{	
			Emp z=i.next();
			System.out.print(z.id);
			System.out.print(" "+z.name);
			System.out.println(" ");
		}
	}
}
class Emp
{
	int id;
	String name;
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public boolean equals(Object o)
	{
		System.out.println("Equals");
		Emp e1=(Emp)o;
		if(this.id==e1.id)
			return true;
		else 
			return false;
	}
}