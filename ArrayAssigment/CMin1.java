class CMin1{
	static void min1(int arr[][]){
		int minval=arr[0][0],k=1,l=1;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[0].length;j++)
				if(arr[i][j]<minval){
					minval=arr[i][j];
					k=i+1;l=j+1;
				}
		System.out.println(minval+" at "+l+" position of "+ k+" row");
	}public static void main(String... args){
		min1(new int[][]{{3,2,0},{4,1,3}});
	}
}