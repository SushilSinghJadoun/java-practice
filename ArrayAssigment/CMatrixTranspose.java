class CMatrixTranspose{
	static void matrixTranspose(int x[][]){	
		System.out.println("Before transpose");
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[0].length;j++)
				System.out.print(x[i][j]+"\t");
			System.out.println("");
		}System.out.println("After transpose");
		for(int i=0;i<x[0].length;i++){
			for(int j=0;j<x.length;j++)
				System.out.print(x[j][i]+"\t");
			System.out.println("");
		}
	}public static void main(String... args){
		matrixTranspose(new int[][]{{5,2,1},{6,4,3}});
	}
}