class CIntersection{
	static void intersection(int x[],int y[]){
		int minlen=0,flag=1,k=-1;
		if(x.length>y.length)//finding the smaller length array
			minlen=y.length;
		else
			minlen=x.length;
		int[] a=new int[minlen];
		for(int i=0;i<y.length;i++){//finding the common no from both array and adding that no to third array
			for(int j=0;j<x.length;j++){
				if(y[i]==x[j]){
					flag=1;
					break;
				}
				else
					flag=0;
			}if(flag==1)
				a[++k]=y[i];
		}System.out.println("intersection");
		for(int i=0;i<a.length;i++)//printing the array
			if(a[i]!=0)
				System.out.print(a[i]+"  ");
	}public static void main(String... args){
		intersection(new int[]{3,2,5},new int[]{3,1,4});
	}
}