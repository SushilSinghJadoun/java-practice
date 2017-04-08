import java.util.*;
public class MyArrayListSwap{
	public static void main(String... args){
		ArrayList<String> list=new ArrayList<>();
		list.add("Java");
		list.add("Cris");
		list.add("Play");
		list.add("water");
		list.add("Glass");
		list.add("Movie");
		list.add("Girl");
		System.out.println(list);
		Collections.swap(list,2,5);
		System.out.println("Result after swap");
		System.out.println(list);
	}
}
