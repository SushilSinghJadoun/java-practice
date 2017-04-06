class CSort1{
	static void sort1(int x[][]){
		int[] y=new int[(x.length)*(x[0].length)];
		int myindex=-1;
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x[0].length;j++)
				y[++myindex]=x[i][j];
		for(int i=0;i<y.length;i++)
            for(int j=y.length-1;j>i;j--)
                if(y[j]<y[j-1]){
                    int temp=y[j];
                    y[j]=y[j-1];
                    y[j-1]=temp;
                }
        System.out.println("After sorting");
		myindex=-1;
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[0].length;j++)
				System.out.print(y[++myindex]+"  ");
			System.out.println("");
		}
	}public static void main(String... args){
		sort1(new int[][]{{5,2,4},{6,1,3}});
	}
}