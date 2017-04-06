class CMax{
	static void max(int arr[]){
		int maxval=arr[0],k=1;
		for(int i=1;i<arr.length;i++)
			if(arr[i]>maxval){
				maxval=arr[i];	k=i+1;
			}
		System.out.println(maxval+" at "+k+" position");
	}public static void main(String... args){
		max(new int[]{3,2});
	}
}