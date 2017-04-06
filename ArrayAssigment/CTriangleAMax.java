class CTriangleAMax{
	static void triangleAMax(int x[][]){
		for(int i=0;i<x.length;i++)
			if(x.length!=x[i].length)
				return;
		int maxval=x[0][0],k=1,l=1;
		for(int i=0;i<x.length;i++)
			for(int j=i;j<x[0].length;j++)
				if(x[i][j]>maxval){
					maxval=x[i][j];
					k=i+1;l=j+1;
				}
		System.out.println(maxval+" at "+l+" position of "+ k+" row");
	}public static void main(String... args){
		triangleAMax(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
	}
}