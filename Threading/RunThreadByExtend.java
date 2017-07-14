class Thread1 extends Thread{
	Thread1(String s){
		super(s);
	}public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("thread1 "+i);
		}
	}
}class Thread2 extends Thread{
	Thread2(String s){
		super(s);
	}public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("thread2 "+i);
		}
	}
}class Thread3 extends Thread{
	Thread3(String s){
		super(s);
	}public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("thread3 "+i);
		}
	}
}class RunThreadByExtend{
	public static void main(String... args){
		Thread1 t1=new Thread1("T1");
		Thread2 t2=new Thread2("T2");
		Thread3 t3=new Thread3("T3");
		t1.start();
		t2.start();
		t3.start();
		for(int i=1;i<=20;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}