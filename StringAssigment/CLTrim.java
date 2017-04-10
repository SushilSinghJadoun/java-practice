class CLTrim{
  static String lTrim(String s){
    int end=s.length();
    StringBuffer sb=new StringBuffer();
    for (int i=s.length()-1;i>=0;i-- ) {
      if (s.charAt(i)==' ') {
        end--;
      }else
        break;
    }for (int i=0;i<end;++i) {
      sb.append(s.charAt(i));
    }return sb.toString();
  }public static void main(String[] args) {
    System.out.print(lTrim("Sushil Singh Jadoun   ")+"ssj");
  }
}
