import java.util.*;
class TrimExample{
	public static void main(String... args){
		Vector<Integer> arrayList=new Vector<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		System.out.println(arrayList.capacity());
		System.out.println(arrayList.size());
		arrayList.trimToSize();
		System.out.println(arrayList.capacity());
	}
}