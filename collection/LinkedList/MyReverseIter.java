import java.util.*;
public class MyReverseIter{
  public static void main(String[] args) {
    LinkedList<String>arrl=new LinkedList<>();
    arrl.add("First");
    arrl.add("Second");
    arrl.add("Third");
    arrl.add("Random");
    Iterator<String>itr=arrl.descendingIterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
