class CMin{
	static void min(int arr[]){
		int minval=arr[0],k=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<minval){
				minval=arr[i];	k=i+1;
			}
		}System.out.println(minval+" at "+k+" position");
	}public static void main(String... args){
		min(new int[]{3,2,1});
	}
}