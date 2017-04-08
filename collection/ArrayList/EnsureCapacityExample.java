import java.util.*;
public class EnsureCapacityExample{
	public static void main(String... args){
		Vector<String>al=new Vector<>(4);
		System.out.println("Initial capacity "+al.capacity());
		al.add("hi");
		al.add("hello");
		al.add("A");
		al.add("B");
		al.ensureCapacity(100);
		System.out.println("Increase Capacity"+al.capacity());
		System.out.println(al);
	}
}