import java.util.*;
class ArrayListProb{
	public static void main(String... args){
		ArrayList<String>al=new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		try{
			ArrayListTh1 alt1=new ArrayListTh1(al);
			Thread tt1=new Thread(alt1);
			ArrayListTh2 alt2=new ArrayListTh2(al);
			Thread tt2=new Thread(alt2);
			tt1.setPriority(10);
			tt2.setPriority(1);
			tt1.start();
			tt2.start();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}class ArrayListTh1 implements Runnable{
	ArrayList<String>al;
	ArrayListTh1(ArrayList al){
		this.al=al;
	}public void run(){
		Iterator i1=al.iterator();
		while(i1.hasNext()){
			try{
				String str=(String)i1.next();
				System.out.println("Name :"+str);
				Thread.sleep(10000);
			}catch(Exception e){
				System.out.println(e);
				System.exit(0);
			}
		}
	}
}class ArrayListTh2 implements Runnable{
	ArrayList<String>al;
	ArrayListTh2(ArrayList al){
		this.al=al;
	}public void run(){
		try{
			for(int i=0;i<5;i++){
				al.add("first");
				al.add("Second");
				Thread.sleep(20000);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
