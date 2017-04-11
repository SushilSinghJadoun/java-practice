class CSingleOccurance{
  static  String singleOccurance(String s){
    int state=0;char temp=s.charAt(0);
    StringBuffer sb=new StringBuffer();
    for (int i=0;i<s.length();i++ ) {
      if(state==0&&temp!=' '){
        state=1; temp=s.charAt(i);
        sb.append(s.charAt(i));
      }else if(state==1&&temp!=s.charAt(i)){
        temp=s.charAt(i);
        sb.append(s.charAt(i));
      }else if(state==1&&temp==' '){
        state=0; temp=' ';
        sb.append(s.charAt(i));
      }
    }return sb.toString();
  }public static void main(String[] args) {
    System.out.print(singleOccurance("ssuuusssshillll"));
  }
}
