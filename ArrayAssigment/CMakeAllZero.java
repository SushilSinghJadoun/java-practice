class CMakeAllZero{
	static void makeAllZero(int x[][]){
		for(int i=0;i<x.length;i++)
			if(x.length!=x[i].length)
				return;
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x.length;j++)
				System.out.print(x[i][j]+"\t");
			System.out.println("");
		}System.out.println("");	
		int[][] a=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x[i].length;j++)
				if(x[i][j]==0)
					a[i][j]=1;
				else
					a[i][j]=0;
		for(int i=1;i<x.length-1;i++)
			for(int j=1;j<x[i].length-1;j++)
				if(a[i][j]==1){
					x[i-1][j]=0;
					x[i+1][j]=0;
					x[i][j-1]=0;
					x[i][j+1]=0;
				}
		for(int i=1;i<x.length-1;i++)
			if(a[0][i]==1){
				x[0][i-1]=0;
				x[0][i+1]=0;
				x[1][i]=0;
			}
		for(int i=1;i<x.length-1;i++)
			if(a[x.length-1][i]==1){
				x[x.length-1][i-1]=0;
				x[x.length-1][i+1]=0;
				x[x.length-2][i]=0;
			}
		for(int i=1;i<x.length-1;i++)
			if(a[i][0]==1){
				x[i-1][0]=0;
				x[i+1][0]=0;
				x[i][1]=0;
			}
		for(int i=1;i<x.length-1;i++)
			if(a[i][x.length-1]==1){
				x[i][x.length-2]=0;
				x[i+1][x.length-1]=0;
				x[i-1][x.length-1]=0;
			}
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x.length;j++)
				System.out.print(x[i][j]+"\t");
			System.out.println("");
		}	
	}public static void main(String... args){
		makeAllZero(new int[][]{{1,2,4},{1,1,1},{1,2,0}});
	}
}