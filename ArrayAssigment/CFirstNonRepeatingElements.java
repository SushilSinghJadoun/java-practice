class CFirstNonRepeatingElements{
	static void firstNonRepeatingElements(int x[]){
		int[] a=new int[x.length];
		int flag=1,k=-1;
		for(int i=0;i<x.length;i++){//finding the unique no amoung the array
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
		for(int i=0;i<=k;i++){//checking that if there is more presence that once
			for(int j=0;j<x.length;j++){
				if(a[i]==x[j])
					++temp;
			}if(temp==1){
				System.out.println(a[i]);
				return;
			}else
				temp=0;
		}
	}public static void main(String... args){
		firstNonRepeatingElements(new int[]{1,2,5,3,1,5,2,9,2});
	}
}