import java.util.*;
class SetExample{
	public static void main(String... args){
		ArrayList<Integer> arraylist=new ArrayList<>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		System.out.println("Arraylist before update"+arraylist);
		arraylist.set(0,11);
		arraylist.set(1,22);
		arraylist.set(2,33);
		arraylist.set(3,44);
		System.out.println("ArrayList after update"+arraylist);
	}
}