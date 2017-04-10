class CAllTrim{
  static String allTrim(String s){
    int start=0,end=s.length();
    StringBuffer sb=new StringBuffer();
    for (int i=0;i<s.length();i++ ) {
      if (s.charAt(i)==' ') {
        start++;
      }else
        break;
    }for (int i=s.length()-1;i>=0;i-- ) {
      if (s.charAt(i)==' ') {
        end--;
      }else
        break;
    }for (int i=start;i<end;++i) {
      sb.append(s.charAt(i));
    }return sb.toString();
  }public static void main(String[] args) {
    System.out.print("ssj"+allTrim("   Sushil Singh Jadoun   ")+"ssj");
  }
}
