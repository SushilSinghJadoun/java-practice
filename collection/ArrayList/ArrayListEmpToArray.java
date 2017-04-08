import java.util.ArrayList;
public class ArrayListEmpToArray{
	public static void main(String... args){
		ArrayList<Emp> al=new ArrayList <>();
		al.add(new Emp(1001,"A"));
		al.add(new Emp(1002,"B"));
		al.add(new Emp(1003,"C"));
		al.add(new Emp(1004,"D"));
		Object o[]=al.toArray();
		for(int i=0;i<o.length;i++){
			Emp z=(Emp) o[i];
			System.out.print(z.id);
			System.out.print(" "+ z.name);
			System.out.println("");
		}System.out.println("");
		for(Emp z:al){
			System.out.print(z.id);
			System.out.print(" "+ z.name);
			System.out.println("");
		}
	}
}class Emp{
	int id;
	String name;
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
}