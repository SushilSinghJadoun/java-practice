class Challenge36{
	static int[] x={2,1};
	static String[] bino=new String[x.length];
	public static void main(String... args){
		int result=0,maxindex=0,maxval=x[0];
		for(int i=0;i<x.length;i++)//converting the no into binary
			bino[i]=Integer.toBinaryString(x[i]);
		for(int i=0;i<x.length;i++)//finding the presence of 1's
			for(int j=0;j<bino[i].length();j++)
				if(bino[i].charAt(j)=='1')
					result++;
		System.out.println("\nNo of Increment operations :"+result);
		for(int i=1;i<x.length;i++)//finding the length of max no
			if(x[i]>maxval){
				maxval=x[i];	maxindex=i;
			}
		result+=bino[maxindex].length()-1;
		System.out.println("No of Doubling Operations :"+(bino[maxindex].length()-1));
		System.out.println("\nTotal No of Operations :"+result);
	}
}
//Step 1: convert each element of the arrrya into binary equivalants.
//Step 2: To find the no of Increment operations, we have to find the total no of one occure in the binary array.
//Step 3 To find the no of Doubing operations, we have to find the length of largest no which is in binary form.