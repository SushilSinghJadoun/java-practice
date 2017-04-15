class CWordFrequency{
	static void wordFrequency(String s1){
		String s2[]=s1.split(" ");
		int flag=1,k=-1,temp=0;
		String s3[]=new String[s2.length];
		for(int i=0;i<s2.length;i++){
			for(int j=0;j<s3.length;j++){
				if(s2[i].equals(s3[j])==false)
					flag=1;
				else{
					flag=0;
					break;
				}
			}if(flag==1)
				s3[++k]=s2[i];
		}for (int i=0;i<s3.length ;i++ ) {
			if(s3[i]!=null){temp=0;
				for (int j=0;j<s2.length ;j++ ) {
					if(s3[i].equals(s2[j])==true)
					temp++;
				}System.out.println(s3[i]+"\t"+temp);
			}
		}
	}public static void main(String[] args) {
		wordFrequency("sushil sushil singh jadoun");
	}
}
