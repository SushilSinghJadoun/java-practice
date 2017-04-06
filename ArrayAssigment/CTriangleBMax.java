class CTriangleBMax{
	static void triangleBMax(int x[][]){
		for(int i=0;i<x.length;i++)
			if(x.length!=x[i].length)
				return;
		int maxval=x[0][0],k=1,l=1;
		for(int i=0;i<x.length;i++)
			for(int j=0;j<=i;j++)
				if(x[i][j]>maxval){
					maxval=x[i][j];
					k=i+1;l=j+1;
				}
		System.out.println(maxval+" at "+l+" position of "+ k+" row");
	}public static void main(String... args){
		triangleBMax(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
	}
}