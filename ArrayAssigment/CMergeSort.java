class CMergeSort{
	static void mergesort(int x[],int y[]){
		int[] z=new int[x.length+y.length];
		int myindex=-1;
		for(int i=0;i<x.length;i++)
			z[++myindex]=x[i];
		for(int i=0;i<y.length;i++)
			z[++myindex]=y[i];
		for(int i=0;i<z.length-1;i++){
            for(int j=z.length-1;j>i;j--){
                if(z[j]<z[j-1]){
                    int temp=z[j];
                    z[j]=z[j-1];
                    z[j-1]=temp;
                }
            }
        }System.out.println("After sorting");
		System.out.print(z[0]);
		for(int i=1;i<z.length;i++)
            System.out.print(","+z[i]);
	}public static void main(String... args){
		mergesort(new int[]{3,2,5},new int[]{6,1,4});
	}
}