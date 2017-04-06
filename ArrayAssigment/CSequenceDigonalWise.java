class CSequenceDigonalWise{
	static void sequenceDigonalWise(int x[][]){
		for(int i=0;i<x.length;++i){
			for(int j=0;j<x[i].length;++j)
				System.out.print(x[i][j]+"\t");
			System.out.println("");
		}for(int i=0;i<x.length;i++){
			if(i%2==0){
					int k=0,temp=i;
					while(temp>=0){
					System.out.print(x[k][temp]+"\t");
					temp-=1;	++k;
					}System.out.println("");
			}else
			{
				int k=0,temp=i;
					while(k<=i){
					System.out.print(x[temp][k]+"\t");
					temp-=1;	++k;
					}System.out.println("");
			}
		}for(int i=1;i<x.length;i++){
			if(i%2==0){
				int k=4,temp=i;
				while(temp<x.length){
				System.out.print(x[temp][k]+"\t");
				k-=1;	++temp;
				}System.out.println("");	
			}else
			{
				int k=4,temp=i;
				while(temp<x.length){
				System.out.print(x[k][temp]+"\t");
				k-=1;	++temp;
				}System.out.println("");	
			}
		}
	}public static void main(String... args)
	{
		sequenceDigonalWise(new int[][]{{1,2,3,4,5},{6,7,8,9,10},
		{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}});
	}
	
}