class CMatrixAdd{
	static void matrixAdd(int x[][],int y[][]){
		int[][] a=new int[x.length][x[0].length];
		if(x.length==y.length)
			if(x[0].length==y[0].length)
				for(int i=0;i<x.length;i++)
					for(int j=0;j<x[0].length;j++)
						a[i][j]=x[i][j]+y[i][j];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println("");
		}
	}public static void main(String... args){
		matrixAdd(new int[][]{{1,2,3},{4,5,6},{7,8,9}},new int[][]{{1,2,3},{4,5,6},{7,8,9}});
	}
}