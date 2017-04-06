class CMatrixSum{
	static void matrixSum(int x[][]){	
		for(int i=0;i<x.length;i++)
			if(x.length!=x[i].length)
				return;
		int[] horizontal,vertical;
		int[] diagonal=new int[]{0,0};
		horizontal=new int[x.length];
		vertical=new int[x.length];
		int temp=x.length-1;
		for(int i=0;i<x.length;i++){
			horizontal[i]=0;
			vertical[i]=0;
			for(int j=0;j<x[i].length;j++){
				horizontal[i]+=x[i][j];
				vertical[i]+=x[j][i];
			}
		}for(int i=0;i<x.length;i++){
			diagonal[0]+=x[i][i];
			diagonal[1]+=x[i][temp-i];
		}for(int i=0;i<x.length;i++){
			for(int j=0;j<x.length;j++)
				System.out.print("\t"+x[i][j]);
			System.out.println("\t"+horizontal[i]);
		}System.out.print("\n"+diagonal[0]+"\t");
		for(int i=0;i<x.length;i++)
			System.out.print(vertical[i]+"\t");
		System.out.print(diagonal[1]);
	}public static void main(String... args){
		matrixSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
	}
}