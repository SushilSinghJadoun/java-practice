class CLcm{
	static int lcm2(int a,int b){
		int c=(a>b)?a:b;
		while(true){
			if(c%a==0&&c%b==0)
				return c;
			++c;
		}
	}static void lcm(int x[]){
		int temp=1;
		for(int i=0;i<x.length;i++)
			temp=lcm2(temp,x[i]);
		System.out.println(temp);
	}public static void main(String... args){
		lcm(new int[]{1,2,3,4,5});
	}
}