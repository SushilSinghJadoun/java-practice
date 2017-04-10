class CSpaceCount{
  static int spaceCount(String s){
    int temp=0,state=0;
    for(int i=0;i<s.length();i++){
      if(state==0&&s.charAt(i)!=' '){
        state=1; temp++;
      }else if(state==1&&s.charAt(i)==' ')
        state=0;
    }return --temp;
  }public static void main(String[] args) {
    System.out.print(spaceCount("sushil      singh jadoun"));
  }
}
