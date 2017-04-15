class CReverseEachWord{
  static String reverseEachWord(String s){
    int state=0,start=0,end=0;
    StringBuffer sb=new StringBuffer();
    for(int i=0;i<s.length();i++){
      if(state==0&&s.charAt(i)==' ')
        sb.append(s.charAt(i));
      else if(state==0&&s.charAt(i)!=' '){
        start=i;end=i;state=1;
      }else if(state==1&&s.charAt(i)!=' '&&i!=(s.length()-1)){
        end++;
      }else if((state==1&&s.charAt(i)==' ')){
        for (int j=end;j>=start ;j-- ) {
          sb.append(s.charAt(j));
        }sb.append(" ");state=0;
      }else if((state==1&&i==(s.length()-1))){
        end++;
        for (int j=end;j>=start ;j-- ) {
          sb.append(s.charAt(j));
        }sb.append(" ");state=0;
      }
    }return sb.toString();
  }public static void main(String[] args) {
    System.out.print(reverseEachWord("sushil singh jadoun"));
  }
}
