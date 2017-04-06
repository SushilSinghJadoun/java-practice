class CPrintDigonalWise{
	static void printDigonalWise(int x[][]){
		for(int i=0;i<x.length;++i){
			for(int j=0;j<x[i].length;++j)
				System.out.print(x[i][j]+"\t");
			System.out.println("");
		}for(int i=0;i<x.length;++i){
			int j=0,temp=i;
			while(temp>=0){
				System.out.print(x[j][temp]+"\t");
				temp-=1;	++j;
			}System.out.println("");
		}for(int i=1;i<x.length;++i){
			int j=4,temp=i;
			while(temp<x.length){
				System.out.print(x[temp][j]+"\t");
				temp+=1;	--j;
			}System.out.println("");
		}
	}public static void main(String... args){
		printDigonalWise(new int[][]{{1,2,3,4,5},{6,7,8,9,10},
		{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}});
	}
}