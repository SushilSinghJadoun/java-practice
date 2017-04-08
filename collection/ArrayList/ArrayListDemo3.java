import java.util.ArrayList;
class ArrayListDemo3
{
	public static void main(String... args)
	{
		ArrayList<ArrayList> al=new ArrayList<>();
		ArrayList<String> als=new ArrayList<>();
		System.out.println(al.size());
		als.add("a");
		als.add("b");
		als.add("c");
		al.add(als);
		al.add(al);
		System.out.println(al.size());
		System.out.println(al);
	}
}