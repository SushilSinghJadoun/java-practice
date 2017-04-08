import java.util.*;
public class MyItrRemoveElement{
	public static void main(String... args){
		String removeElement="perl";
		ArrayList<String> mylist=new ArrayList<>();
		mylist.add("java");
		mylist.add("unix");
		mylist.add("oracle");
		mylist.add("c++");
		mylist.add("perl");
		mylist.add("perl");
		mylist.add("perl");
		System.out.println("Before Remove");
		System.out.print(mylist);
		Iterator<String> itr=mylist.iterator();
		while(itr.hasNext())
			if(removeElement.equals(itr.next()))
				itr.remove();
		System.out.println("After remove:");
		System.out.println(mylist);
	}
}
