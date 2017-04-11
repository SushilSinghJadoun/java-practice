class CFindDigitInString{
  static boolean findDigitInString(String s){
    for (int i=0;i<s.length() ;i++ )
      if(s.charAt(i)>='0'&&s.charAt(i)<='9')
        return true;
    return false;
  }public static void main(String[] args) {
    System.out.print(findDigitInString("sushil"));
  }
}
