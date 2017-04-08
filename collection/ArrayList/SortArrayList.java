import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList{
	public static void main(String... args){
		ArrayList<String> loc=new ArrayList<>();
		loc.add("India");
		loc.add("US");
		loc.add("China");
		loc.add("Denmark");
		loc.add("China");
		System.out.println("Before sorting");
		for(String counter:loc)
			System.out.println(counter);
		Collections.sort(loc);
		System.out.println("After sorting");
		for(String counter:loc)
			System.out.println(counter);
	}
}