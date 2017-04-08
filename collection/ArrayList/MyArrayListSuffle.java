import java.util.*;
public class MyArrayListSuffle{
	public static void main(String... args){
		ArrayList<String> list=new ArrayList<>();
		list.add("Java");
		list.add("crish");
		list.add("play");
		list.add("sushil");
		list.add("sunny");
		System.out.println("After Shuffle");
		for(String str:list)
			System.out.println(str);
		Collections.shuffle(list);
		System.out.println("Result after shuffle");
		for(String str:list)
			System.out.println(str);
	}
}