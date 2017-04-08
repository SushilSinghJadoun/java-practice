import java.util.*;
class MyListIterator{
	public static void main(String... args){
		List<Integer>li=new ArrayList<>();
		ListIterator<Integer> litr=null;
		li.add(23);
		li.add(29);
		li.add(5);
		li.add(98);
		li.add(7);
		litr=li.listIterator();
		System.out.println("Element in forward direction");
		while(litr.hasNext())
			System.out.println(litr.next());
		System.out.println("Element is backward direction");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
	}
}
