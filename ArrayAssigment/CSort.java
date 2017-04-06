class CSort{
	static void sort(int x[]){
		for(int i=0;i<x.length-1;i++)
            for(int j=x.length-1;j>i;j--)
                if(x[j]<x[j-1]){
                    int temp=x[j];
                    x[j]=x[j-1];
                    x[j-1]=temp;
                }
		System.out.println("After sorting");
		System.out.print(x[0]);
		for(int i=1;i<x.length;i++)
            System.out.print(","+x[i]);
	}public static void main(String... args){
		sort(new int[]{3,2,4,6,5});
	}
}