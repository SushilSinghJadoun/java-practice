import java.util.*;
class MyAllRemoveOprs{
  public static void main(String[] args) {
    LinkedList<String> arrl=new LinkedList<>();
    arrl.add("First");
    arrl.add("Second");
    arrl.add("Third");
    arrl.add("Five");
    arrl.add("Random");
    arrl.add("Four");
    arrl.add("Six");
    arrl.add("Seven");
    arrl.add("Eight");
    arrl.add("Nine");
    System.out.println(arrl);
    System.out.println("Remove method"+arrl.remove());
    System.out.println("After remove method call");
    System.out.println(arrl);
    System.out.println("Remove(index)method:"+arrl.remove(2));
    System.out.println("After remove(index) method call");
    System.out.println(arrl);
    System.out.println("Remove(Object)method"+arrl.remove("Six"));
    System.out.println("After remove(object)method call");
    System.out.println(arrl);
    System.out.println("Remove first method"+arrl.removeFirst());
    System.out.println("After removeFirst() method call");
    System.out.println(arrl);
    System.out.println("Remove first Occurance"+arrl.removeFirstOccurrence("Eight"));
    System.out.println("After remove first Occurance");
    System.out.println(arrl);
    System.out.println("Remove last method"+arrl.removeLast());
    System.out.println("After remove last method call");
    System.out.println(arrl);
    System.out.println("Remove first Occurance"+arrl.removeLastOccurrence("one"));
    System.out.println("After remove first Occurance");
    System.out.println(arrl);
  }
}
