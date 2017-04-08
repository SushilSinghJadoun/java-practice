import java.util.ArrayList;
class MyArrayListClone{
	public static void main(String... args){
		ArrayList<String>arrl=new ArrayList<>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual ArrayList:"+arrl);
		ArrayList<String>copy=(ArrayList<String>)arrl.clone();
		System.out.println("Clone ArrayList"+copy);
		if(arrl.get(0)==copy.get(0))
			System.out.println("shollow");
		if(arrl!=copy)
			System.out.println("clone");
		//copy.add(0,al.get(0).clone()); deep cloning
	}
}