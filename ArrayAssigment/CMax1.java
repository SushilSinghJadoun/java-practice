class CMax1{
	static void max1(int arr[][]){	
		int maxval=arr[0][0],k=1,l=1;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[0].length;j++)
				if(arr[i][j]>maxval){
					maxval=arr[i][j];
					k=i+1;l=j+1;
				}
		System.out.println(maxval+" at "+l+" position of "+ k+" row");
	}public static void main(String... args){
		max1(new int[][]{{5,2,1},{6,4,3}});
	}
}