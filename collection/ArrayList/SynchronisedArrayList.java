import java.util.*;
class SynchronisedArrayList{
	public static void main(String... args){
		List<String>syncal=Collections.synchronizedList(new ArrayList<>());
		syncal.add("Pen");
		syncal.add("NoteBook");
		syncal.add("Ink");
		System.out.println("Iterator Synchronised ArrayList");
		synchronized(syncal){
			Iterator<String>iterator=syncal.iterator();
			while(iterator.hasNext())
				System.out.println(iterator.next());
		}
	}
}
