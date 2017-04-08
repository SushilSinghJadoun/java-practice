import java.util.*;
public class ArrayToArrayListEmp{
	public static void main(String... args){
		Emp e[]={new Emp(10),new Emp(20),new Emp(30),new Emp(40)};
		List<Emp> l=Arrays.asList(e);
		ArrayList<Emp>elist=new ArrayList<>(l);
		elist.add(new Emp(50));
		elist.add(new Emp(60));
		for(Emp e1:elist)
			System.out.println(e1.x);
	}
}class Emp{
	int x;
	Emp(int x){
		this.x=x;
	}
}