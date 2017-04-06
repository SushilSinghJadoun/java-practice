class CUnion{
	static void union(int x[],int y[]){
		int[] a=new int[x.length+y.length];
		int flag=1,k=-1;
		for(int i=0;i<y.length;i++){
			for(int j=0;j<a.length;j++){
				if(y[i]!=a[j])
					flag=1;
				else{
					flag=0;
					break;
				}
			}if(flag==1)
				a[++k]=y[i];
		}flag=1;
		for(int i=0;i<x.length;i++){
			for(int j=0;j<a.length;j++){
				if(x[i]!=a[j])
					flag=1;
				else{
					flag=0;
					break;
				}
			}if(flag==1)
				a[++k]=x[i];
		}System.out.println("union");
		for(int i=0;i<=k;i++)
				System.out.print(a[i]+"  ");
	}public static void main(String... args){
		union(new int[]{3,2,5},new int[]{3,3,4});
	}
}