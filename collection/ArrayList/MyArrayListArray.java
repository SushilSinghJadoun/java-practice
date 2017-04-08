import java.util.ArrayList;
public class MyArrayListArray
{
	public static void main(String... args)
	{
		ArrayList<String> arrl=new ArrayList<>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual arraylist :"+arrl);
		String[] strArr=new String[arrl.size()];
		arrl.toArray(strArr);
		System.out.println("Create Array Contains");
		for(String str:strArr)
			System.out.println(str);
		for(String str:arrl)
			System.out.println(str);
	}
}