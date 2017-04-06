class CMedian{
	static void median(int x[]){
		for(int i=0;i<x.length-1;i++)
            for(int j=x.length-1;j>i;j--)
                if(x[j]<x[j-1]){
                    int temp=x[j];
                    x[j]=x[j-1];
                    x[j-1]=temp;
                }
		if(x.length%2==0)
			System.out.println((x[x.length/2]+x[x.length/2-1])/2);
		else
			System.out.println(x[(x.length/2)]);
	}public static void main(String... args){
		median(new int[]{1,2,4});
	}
}