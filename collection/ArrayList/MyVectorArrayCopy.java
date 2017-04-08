import java.util.*;
class MyVectorArrayCopy{
	public static void main(String... args){
		Vector<String>utc=new Vector<>();
		utc.add("first");
		utc.add("second");
		utc.add("third");
		System.out.println("Actual Vector:"+utc);
		String[] copyArr=new String[utc.size()];
		utc.copyInto(copyArr);
		System.out.println("Copied Array Contained");
		for(String str: copyArr)
			System.out.print(str+" ");
	}
}