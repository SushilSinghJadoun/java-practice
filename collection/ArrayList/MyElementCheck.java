import java.util.*;
class MyElementCheck{
	public static void main(String... args){
		ArrayList<String> arrl=new ArrayList<>();
		arrl.add("first");
		arrl.add("second");
		arrl.add("third");
		arrl.add("random");
		ArrayList<String>list=new ArrayList<>();
		list.add("second");
		list.add("random");
		System.out.println("Does ArrayList contain all list elements?"+arrl.containsAll(list));
		list.add("one");
		System.out.println("Does ArrayList contain all list elements?"+arrl.containsAll(list));
	}
}
