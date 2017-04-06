class CHcf{
	static int hcf2(int a,int b){
		int c=(a>b)?a:b;//finding the larger no
		int d=(a<b)?a:b;//finding the smaller one
		int e=d;
		while(c%d!=0){//finding the mod
			e=c%d;
			c=d;
			d=e;
		}return e;
	}static void hcf(int x[]){
		int temp=x[0];
		for(int i=1;i<x.length;i++)//finding temp as largest amoung the array
			if(x[i]>temp)
				temp=x[i];
		for(int i=0;i<x.length;i++)//calling the function having 2 argument 
			temp=hcf2(temp,x[i]);
		System.out.println(temp);
	}public static void main(String... args){
		hcf(new int[]{132,110});
	}
}