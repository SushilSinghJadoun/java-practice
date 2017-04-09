import java.util.*;
class MyPushMyPop{
  public static void main(String[] args) {
    LinkedList<String>arrl=new LinkedList<>();
    arrl.add("First");
    arrl.add("Second");
    arrl.add("Third");
    arrl.add("Random");
    System.out.println(arrl);
    arrl.push("pushele");
    System.out.println("after push"+arrl);
    arrl.pop();
    System.out.println("After pop"+arrl);
  }
}
