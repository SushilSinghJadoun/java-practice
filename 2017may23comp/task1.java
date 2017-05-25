class task1{
	public static void task(int x[]){
		int flag=1,k=-1;
		int[] x2=new int[x.length];
		x2[++k]=x[x.length-1];
		for(int i=x.length-2;i>=0;i--){
			for(int j=i+1;j<x.length;j++){
				if(x[i]<x[j]){
					flag=0;
					break;
				}
			}if(flag==1)
				x2[++k]=x[i];
			else
				flag=1;
		}for(int i=0;i<=k;i++)
			System.out.println(x2[i]);
	}
	public static void main(String... args){
		task(new int[]{4,3,0,1});
	}
}
