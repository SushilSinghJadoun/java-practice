import java.util.*;
public class MyLastElement{
	public static void main(String... args){
		LinkedList<String>arrl=new LinkedList<>();
		arrl.add("A");
		arrl.add("B");
		arrl.add("C");
		System.out.println("Last Element:"+arrl.getLast());
		System.out.println("LastElement:"+arrl.peekLast());
		System.out.println("List Element:"+arrl);
	}
}