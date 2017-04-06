class CMaxInOneRow{
	static void maxInOneRow(int x[][]){
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x[i].length;j++)
				if(x[i][j]!=1&&x[i][j]!=0)
					return;
		int a[]=new int[x.length];
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x[i].length;j++)
				if(x[i][j]==1)
					a[i]++;
		int maxval=a[0],k=0;
		for(int i=1;i<a.length;i++){
			if(a[i]>maxval){
				maxval=a[i];
				k=i;
			}
		}for(int i=0;i<x.length;i++){
			if(i==k){
				for(int j=0;j<x[i].length;j++)
					System.out.print(x[i][j]+"\t");
				System.out.print("->"+a[k]);
			}else{
				for(int j=0;j<x[i].length;j++)
				System.out.print(x[i][j]+"\t");
			}System.out.println("");
		}
	}public static void main(String... args){
		maxInOneRow(new int[][]{{0,0,0,1},{1,0,1,0},{1,1,0,1},{1,1,1,1}});
	}
}