import java.util.*;
public class LinkListExampleEmp{
  public static void main(String[] args) {
    LinkedList<Emp> ll=new LinkedList<>();
    ll.add(new Emp(1001,"lalu"));
    ll.add(new Emp(1002,"rabari"));
    ll.add(new Emp(1003,"meesa"));
    ll.add(new Emp(1004,"lalubeta"));
    ll.add(new Emp(1005,"lalupota"));
    Iterator<Emp>i=ll.iterator();
    while(i.hasNext()){
      Emp e=i.next();
      System.out.println(e.id+" "+e.name);
    }ll.addFirst(new Emp(100,"nitish"));
    ll.addFirst(new Emp(200,"mulayam"));
    System.out.println("LinkedList Content");
    i=ll.iterator();
    while(i.hasNext()){
      Emp e=i.next();
      System.out.println(e.id+" "+e.name);
    }Emp firstvar=(Emp)ll.get(0);
    System.out.println("First element"+firstvar.id+" "+firstvar.name);
    Emp e2=new Emp(420,"nitish420");
    ll.set(0,e2);
    firstvar=(Emp)ll.get(0);
    System.out.println("FirstElement after update "+firstvar.id+" "+firstvar.name);
    ll.removeFirst();
    ll.removeLast();
    System.out.println("LinkedList After Deletion");
    i=ll.iterator();
    while(i.hasNext()){
      Emp e=i.next();
      System.out.println(e.id+" "+e.name);
    }e2=new Emp(421,"nitish421");
    ll.add(0,e2);
    ll.remove(2);
    System.out.println("Final Content:");
    i=ll.iterator();
    while(i.hasNext()){
      Emp e=i.next();
      System.out.println(e.id+" "+e.name);
    }firstvar=(Emp)ll.getFirst();
    Emp lastvar=(Emp)ll.getLast();
    System.out.println("FirstElement"+firstvar.id+" "+firstvar.name);
    System.out.println("LastElement"+lastvar.id+" "+lastvar.name);
  }
}class Emp{
  int id;
  String name;
  Emp(int id,String name){
    this.id=id;
    this.name=name;
  }
}
