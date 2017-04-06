class CMean{
	static void mean(int x[]){
		int sum=0;
		for(int i=0;i<x.length;i++)
			sum+=x[i];
		System.out.println(sum/x.length);
	}public static void main(String... args){
		mean(new int[]{13,18,13,14,13,16,14,21,13});
	}
}