import java.util.ArrayList;
import java.util.Iterator;
class ArrayListEmp
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
			if(z.id==1004)
				i.remove();
		}System.out.println("After remove");
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
}