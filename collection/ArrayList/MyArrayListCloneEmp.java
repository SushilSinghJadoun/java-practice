import java.util.ArrayList;
public class MyArrayListCloneEmp{
	public static void main(String... args){
		ArrayList<Emp> list=new ArrayList <>();
		list.add(new Emp(1001));
		list.add(new Emp(1002));
		list.add(new Emp(1003));
		list.add(new Emp(1004));
		list.add(new Emp(1005));
		System.out.println("Actual ArrayList");
		for(Emp ele:list)
			System.out.println(ele.x);
		ArrayList<Emp> copy=(ArrayList<Emp>)list.clone();
		System.out.println("clone arraylist");
		for(Emp ele:copy)
			System.out.println(ele.x);
		Emp e1=list.get(0);
		Emp e2=copy.get(0);
		//copy.set(0,(Emp)list.get(0).clone()) deepclone
		if(e1==e2)
			System.out.println("Shallow");
		if(list!=copy)
			System.out.println("clone");
	}
}
class Emp //implements Cloneable
{
	int x;
	Emp(int x)
	{
		this.x=x;
	}
}