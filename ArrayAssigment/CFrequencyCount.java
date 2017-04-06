class CFrequencyCount{
	static void frequencyCount(int x[]){
		int[] a=new int[x.length];
		int flag=1,k=-1;
		for(int i=0;i<x.length;i++){//finding the unique no.
			for(int j=0;j<a.length;j++){
				if(x[i]!=a[j])
					flag=1;
				else{
					flag=0;
					break;
				}
			}if(flag==1)
				a[++k]=x[i];
		}int temp=0;
		System.out.println("Item\tElement");
		for(int i=0;i<=k;i++){//finding the frequency count 
			for(int j=0;j<x.length;j++){
				if(a[i]==x[j])
					++temp;
			}System.out.println(a[i]+"\t"+temp);
			temp=0;
		}
	}public static void main(String... args){
		frequencyCount(new int[]{1,2,5,3,1,5,2,9,2});
	}
}