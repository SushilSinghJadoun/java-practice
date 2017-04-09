import java.util.*;
class LinkListLoop{
  public static void main(String[] args) {
    LinkedList<String> ll=new LinkedList<>();
    ll.add("Apple");
    ll.add("Orange");
    ll.add("Mango");
    System.out.println("For Loop");
    for (int num=0;num<ll.size() ;num++ ) {
      System.out.println(ll.get(num));
    }System.out.println("Advance Loop");
    for (String str :ll ) {
      System.out.println(str);
    }System.out.println("Using Iterator");
    Iterator<String>i=ll.iterator();
    while(i.hasNext())
      System.out.println(i.next());
    System.out.println("Using while Loop");
    int num=0;
    while(ll.size()>num){
      System.out.println(ll.get(num));
      num++;
    }
  }
}
