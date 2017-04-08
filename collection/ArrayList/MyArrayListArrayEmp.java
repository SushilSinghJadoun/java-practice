import java.util.ArrayList;
public class MyArrayListArrayEmp{
	public static void main(String... args){
		ArrayList<Emp> list=new ArrayList <>();
		list.add(new Emp(1001));
		list.add(new Emp(1002));
		list.add(new Emp(1003));
		list.add(new Emp(1004));
		list.add(new Emp(1005));
		System.out.println("Actual Array List");
		for(Emp str:list)
			System.out.println(str.x);
		Emp[] strArr=new Emp[list.size()];
		list.toArray(strArr);
		System.out.println("Create Array contents");
		for(Emp str:strArr)
			System.out.println(str.x);
	}
}class Emp{
	int x;
	Emp(int x){
		this.x=x;
	}
}