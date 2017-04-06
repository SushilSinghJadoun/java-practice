class CMatrixMult{
	static void matrixAdd(int x[][],int y[][]){
		int[][] a=new int[x.length][x[0].length];
		int sum=0;
		if(x[0].length==y.length)
			for(int i=0;i<x.length;i++)
				for(int j=0;j<x[0].length;j++){
					for(int k=0;k<x.length;k++)
						sum+=x[i][k]*y[k][j];
					a[i][j]=sum;sum=0;
				}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println("");
		}
	}public static void main(String... args){
		matrixAdd(new int[][]{{1,2,3},{4,5,6},{7,8,9}},new int[][]{{1,2,3},{4,5,6},{7,8,9}});
	}
}