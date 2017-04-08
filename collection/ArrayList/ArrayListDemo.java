import java.util.ArrayList;
class ArrayListDemo
{
	public static void main(String... args)
	{
		ArrayList <String> al=new ArrayList<>();
		//ArrayList al=new ArrayList(); error
		System.out.println(al.size());
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		//al.add(new Integer(10));
		System.out.println(al.size());
		al.remove(2);
		System.out.println(al.size());
		System.out.println(al);
	}
}