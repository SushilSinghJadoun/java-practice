import java.util.*;
class MyArrayListSubRange{
	public static void main(String[] args) {
		ArrayList<String> arrl=new ArrayList<>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		arrl.add("Click");
		System.out.println("Actual list"+ arrl);
		List<String>list=arrl.subList(2,4);
		System.out.print("SubList"+list);
	}
}
