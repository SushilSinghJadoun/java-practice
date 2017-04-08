import java.util.ArrayList;
public class ArrayListToArray
{
	public static void main(String... args)
	{
		ArrayList<String>arrlist=new ArrayList<>();
		arrlist.add("A");
		arrlist.add("B");
		arrlist.add("C");
		arrlist.add("D");
		String array[]=new String[arrlist.size()];
		for(int j=0;j<arrlist.size();j++)
			array[j]=arrlist.get(j);
		for(String k:array)
			System.out.println(k);
	}
}