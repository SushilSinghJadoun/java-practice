class CRTrim{
  static String rTrim(String s){
    int start=0;
    StringBuffer sb=new StringBuffer();
    for (int i=0;i<s.length();i++ ) {
      if (s.charAt(i)==' ') {
        start++;
      }else
        break;
    }for (int i=start;i<s.length();++i) {
      sb.append(s.charAt(i));
    }return sb.toString();
  }public static void main(String[] args) {
    System.out.print("ssj"+rTrim("   Sushil Singh Jadoun   ")+"ssj");
  }
}
