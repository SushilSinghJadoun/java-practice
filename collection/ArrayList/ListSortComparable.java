import java.util.ArrayList;
import java.util.Collections;
public class ListSortComparable{
	public static void main(String... args){
		ArrayList<Empl> list=new ArrayList<Empl>();
		list.add(new Empl("Ram",3000));
		list.add(new Empl("John",6000));
		list.add(new Empl("cris",2000));
		list.add(new Empl("tom",2400));
		Collections.sort(list);
		System.out.println("Sorting list entries");
		for(Empl e:list)
			System.out.print(e.getSalary()+"  ");
		Empl e1=Collections.max(list);
		Empl e2=Collections.min(list);
		System.out.println(e1.salary);
		System.out.println(e2.salary);
	}
}class Empl implements Comparable<Empl>{
	String name;
	int salary;
	Empl(String name,int salary){
		this.name=name;
		this.salary=salary;
	}int getSalary(){
		return salary;
	}public int compareTo(Empl e){
		System.out.println("sort");
		if(this.salary>e.salary)
			return 1;
		else if(this.salary<e.salary)
			return -1;
		else
			return 0;
	}
}