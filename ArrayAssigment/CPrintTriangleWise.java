class CPrintTriangleWise{
	static void printTriangleWise(int x[]){
		for(int i=0;i<x.length;i++){
			for(int j=0;j<=i;j++)
				System.out.print(x[j]+"  ");
			System.out.println("");
		}
	}public static void main(String... args){
		printTriangleWise(new int[]{1,2,3,4,5});
	}
}